package com.hlebnikov.topbodyapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hlebnikov.topbodyapp.common.EventHandler

class MainViewModel: ViewModel(), EventHandler<MainEvent> {

    private val _viewState = MutableLiveData<MainViewState>();
    val viewState: LiveData<MainViewState> = _viewState

    override fun obtainEvent(event: MainEvent) {
//        when (event) {
//
//        }
    }
}


sealed class MainEvent(

)