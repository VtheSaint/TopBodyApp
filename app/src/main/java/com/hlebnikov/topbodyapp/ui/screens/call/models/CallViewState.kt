package com.hlebnikov.topbodyapp.ui.screens.call.models

import com.hlebnikov.topbodyapp.utils.CallListBody

enum class CallSubState {
    CallList, CallInfo, CallYRes, CallARes
}


data class CallViewState(
    val  callSubState: CallSubState = CallSubState.CallList,
    val data: CallListBody? = null
)