package com.hlebnikov.topbodyapp.common

interface EventHandler<T> {
    fun obtainEvent(event: T)
}