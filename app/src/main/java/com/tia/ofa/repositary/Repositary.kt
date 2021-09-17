package com.tia.ofa.repositary

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tia.ofa.`interface`.Services
import com.tia.ofa.models.WeatherModel
import com.tia.ofa.utils.NetworkUtils

class Repositary(
    private val weatherService: Services,
//    private val quoteDatabase: QuoteDatabase,
    private val applicationContext: Context
) {

    private val weatherLiveData = MutableLiveData<WeatherModel>()    //storing result return

    val weather: LiveData<WeatherModel>                           //for access
        get() = weatherLiveData

   suspend fun getWeather( location:String) {
        if (NetworkUtils.isInternetAvailable(applicationContext)) {
            val result = weatherService.getMainData(location)
            if (result != null) {
                weatherLiveData.postValue(result.body())
            }

        } else {
            Log.d("rawat", "getWeather: obj null")
        }
    }
}