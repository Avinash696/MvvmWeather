package com.tia.ofa.`interface`

import com.tia.ofa.models.WeatherModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Services {

//    @GET("/?&&appid=e1991533deb53055ab7b41c85f79680d")
////    fun getWeather( @Query("lat") Double lat, @Query("lon") Double lon) :Call<List<WeatherModel>>
//    fun getLogLat(@Query("lat") lat:Double ,@Query("lon") lon:Double ) :Call<WeatherModel>


    @GET("?&appid=e1991533deb53055ab7b41c85f79680d")
  suspend  fun getMainData(@Query("q") name: String?): Response<WeatherModel?>?
}