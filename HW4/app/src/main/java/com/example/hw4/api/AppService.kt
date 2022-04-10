package com.example.translator.api

import com.example.hw4.api.dataBean
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface AppService {
    @POST("jsonapi")
    fun getdata(@Query("q") word:String): Call<dataBean>
}