package com.iyoboyi.retrofitapp.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {

    private val retrofit =
        Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/").addConverterFactory(
            GsonConverterFactory.create()
        ).build()

    val placeHolderAPI = retrofit.create(PlaceHolderAPI::class.java)
}