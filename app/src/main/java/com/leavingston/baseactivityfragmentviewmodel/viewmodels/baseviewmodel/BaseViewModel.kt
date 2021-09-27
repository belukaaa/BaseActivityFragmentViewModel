package com.leavingston.baseactivityfragmentviewmodel.viewmodels.baseviewmodel

import android.util.EventLog
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent

open class BaseViewModel : ViewModel() , KoinComponent {

    val firstFragment = "First Fragment"
    val secondFragment = "Second Fragment"

    private val _toastMessage = MutableLiveData<String>()
    val toastMessage: LiveData<String> = _toastMessage

    fun newToastMessage(message: String) {
        _toastMessage.value = message
    }


}