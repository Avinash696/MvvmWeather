package com.tia.ofa.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    //    private val BASE_URL ="https://api.openweathermap.org/data/2.5/weather?lat=20&lon=20&appid=e1991533deb53055ab7b41c85f79680d"
    val BASE_URL = "https://api.openweathermap.org/data/2.5/weather/"


    fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}