package com.hlebnikov.topbodyapp


enum class MainSubState {
    Login, Call, Profile
}

data class MainViewState (
    val subState: MainSubState = MainSubState.Call,
    val isLoggedIn: Boolean = false,
)