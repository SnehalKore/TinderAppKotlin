package com.example.navigationarchitecturewithkotlin.repository.network


import com.example.navigationarchitecturewithkotlin.model.DataModel
import com.example.navigationarchitecturewithkotlin.model.TinderMemberData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {

    @GET("/api/?results=10")
    fun getMemberList(): Call<DataModel>

}
