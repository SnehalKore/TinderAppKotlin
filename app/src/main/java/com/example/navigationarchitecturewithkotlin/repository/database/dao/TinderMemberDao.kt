package com.example.navigationarchitecturewithkotlin.repository.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*

import com.example.navigationarchitecturewithkotlin.model.TinderMemberData


@Dao
interface TinderMemberDao {

    companion object {
        const val tableName = "TinderMemberData"
    }

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(memberList: List<TinderMemberData>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(member: TinderMemberData)

    @Query("SELECT * FROM $tableName ORDER BY id DESC")
    fun fetchAllMembers(): LiveData<List<TinderMemberData>>

    @Query("UPDATE $tableName SET status = :status WHERE uuid=:uuid")
    fun updateStatus(status: String,uuid:String)


}
