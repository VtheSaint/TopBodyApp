package com.hlebnikov.topbodyapp.ui.screens.call

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hlebnikov.topbodyapp.common.EventHandler
import com.hlebnikov.topbodyapp.ui.screens.call.models.CallSubState
import com.hlebnikov.topbodyapp.ui.screens.call.models.CallViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CallViewModel @Inject constructor():  ViewModel(), EventHandler<CallEvent> {

    private val _viewState = MutableLiveData<CallViewState>()
    val viewState: LiveData<CallViewState> = _viewState

    override fun obtainEvent(event: CallEvent) {
        when (event) {
            is CallEvent.toCallCard -> redirectCallInfo(event.id)
            else -> {}
        }
    }

    private fun redirectCallInfo(id: Number) {
        _viewState.postValue(
            _viewState.value?.copy(
                callSubState = CallSubState.CallInfo
            )
        )
    }
}


sealed class CallEvent {
    data class toCallCard(val id: Number) : CallEvent()
}