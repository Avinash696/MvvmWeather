package com.tia.ofa

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tia.ofa.Application.MainApplication
import com.tia.ofa.databinding.ActivityMainBinding
import com.tia.ofa.viewModel.MainViewModel



    class MainActivity : AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val repositary = (application as MainApplication).repositary

        val mainViewModel=

    }
}