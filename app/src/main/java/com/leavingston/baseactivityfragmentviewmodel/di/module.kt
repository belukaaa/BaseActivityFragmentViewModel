package com.leavingston.baseactivityfragmentviewmodel.di

import com.leavingston.baseactivityfragmentviewmodel.viewmodels.ViewModelFirst
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { ViewModelFirst() }
}
