package com.example.navigationarchitecturewithkotlin.viewModel

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.navigationarchitecturewithkotlin.model.TinderMemberData
import com.example.navigationarchitecturewithkotlin.repository.network.NetworkState

class TinderMemberListViewModel(application: Application) : BaseViewModel(application) {

    var sampleData: LiveData<List<TinderMemberData>>? = null
    var networkState: LiveData<NetworkState>? = null

    fun getData(isConnected: Boolean) {
        sampleData =  repository!!.getMemberList(isConnected)
        networkState = repository?.getNetworkState()
    }

    fun updateStatus(status: String, uuid: String) {
        repository!!.getUpdateMemberFromDB(status,uuid)
    }

}
