package com.tia.ofa.Application

import android.app.Application
//import android.app.interface
import com.tia.ofa.`interface`.Services
import com.tia.ofa.api.RetrofitHelper
import com.tia.ofa.repositary.Repositary

class MainApplication : Application() {
    lateinit var repositary: Repositary      //repo enque data of retrofit
    override fun onCreate() {
        super.onCreate()
        initilizer()
    }

    private fun initilizer() {
        val weatherService = RetrofitHelper.getInstance().create(Services::class.java)
//         repositary = weatherService(weatherService)
//        val database =
        repositary = Repositary(weatherService, applicationContext)
    }
}