package com.tia.ofa.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tia.ofa.models.WeatherModel
import com.tia.ofa.repositary.Repositary
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repositary: Repositary) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repositary.getWeather("lucknow")
        }
    }

    val weathers: LiveData<WeatherModel>
        get() = repositary.weather
}