package com.example.navigationarchitecturewithkotlin.repository


import android.text.TextUtils
import android.util.Log
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.example.navigationarchitecturewithkotlin.model.DataModel
import com.example.navigationarchitecturewithkotlin.model.TinderMemberData
import com.example.navigationarchitecturewithkotlin.repository.database.AppDatabase
import com.example.navigationarchitecturewithkotlin.repository.network.ApiInterface
import com.example.navigationarchitecturewithkotlin.repository.network.NetworkState
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NavRepository(
    private val mDatabase: AppDatabase,
    private val serverApi: ApiInterface,
    private val mAppExecutors: AppExecutors
) {

    private var memberListLiveData: MediatorLiveData<List<TinderMemberData>>? = null
    private var networkState: MutableLiveData<NetworkState>
    private val gson: Gson

    init {
        memberListLiveData = MediatorLiveData()
        networkState = MediatorLiveData()
        gson = Gson()
    }

    companion object {
        private var sInstance: NavRepository? = null
        fun getInstance(
            mDatabase: AppDatabase,
            serverApi: ApiInterface,
            mAppExecutors: AppExecutors
        ): NavRepository? {
            if (sInstance == null) {
                synchronized(NavRepository::class.java) {
                    if (sInstance == null) {
                        sInstance = NavRepository(mDatabase, serverApi, mAppExecutors)
                    }
                }
            }
            return sInstance
        }
    }

    fun getNetworkState(): MutableLiveData<NetworkState> {
        return networkState
    }
    //Network call to get Member List using retrofit

    fun getMemberList(isConnected: Boolean): MutableLiveData<List<TinderMemberData>> {
        memberListLiveData = MediatorLiveData()
        try {
            networkState.postValue(NetworkState.LOADING)
            if (isConnected) {
                serverApi.getMemberList().enqueue(object : Callback<DataModel> {
                    override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {
                        if (response.isSuccessful) {
                            Log.d("*** onResponse2 ** > ", response.body()!!.toString())
                            if (!TextUtils.isEmpty(response.body()!!.toString())) {
                                insertMemberListInDB(response)
                                getMemberListFromDB()
                            }
                            networkState.postValue(NetworkState.LOADED)
                        } else {
                            networkState.postValue(
                                NetworkState(
                                    NetworkState.Status.FAILED,
                                    "Something went wrong"
                                )
                            )

                        }
                    }

                    override fun onFailure(call: Call<DataModel>, t: Throwable) {
                        Log.d("*** onFailure ** > ", t.message.toString())
                        getMemberListFromDB()
                    }
                })
            } else {
                getMemberListFromDB()
            }
        } catch (e: Exception) {
            networkState.postValue(NetworkState(NetworkState.Status.FAILED, e.message!!))
        }
        return memberListLiveData as MutableLiveData<List<TinderMemberData>>
    }

    private fun getMemberListFromDB() {
        memberListLiveData!!.addSource(
            mDatabase.tinderMemberDao().fetchAllMembers()
        ) { memberList: List<TinderMemberData>? ->
            if (mDatabase.getDatabaseCreated()!!.value != null) {
                memberListLiveData!!.postValue(memberList)
            }
        }
    }

    fun getUpdateMemberFromDB(status: String, uuid: String) {
        //Fetch data from database
        mAppExecutors.diskIO().execute {
            mDatabase.tinderMemberDao().updateStatus(status, uuid)
        }
    }

    private fun insertMemberListInDB(response: Response<DataModel>) {
        mAppExecutors.diskIO().execute {
            if (response.body() != null && response.body()!!.sampleDataInner.isNotEmpty()) {
                mDatabase.tinderMemberDao().insertAll(response.body()!!.sampleDataInner)
            }
        }
    }
}
