package com.sliide.remote.utils

sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T) : ResultWrapper<T>()
    data class Failure(val code: Int, val message: String? = null) :
        ResultWrapper<Nothing>()
}