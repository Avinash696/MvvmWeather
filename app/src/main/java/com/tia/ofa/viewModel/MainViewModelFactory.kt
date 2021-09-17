package com.tia.ofa.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tia.ofa.repositary.Repositary

class MainViewModelFactory(private val repositary: Repositary) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return  MainViewModel(repositary) as T
    }
}