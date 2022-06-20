package com.kotlin_api.common.dto

abstract class AbstractResponse (
    val data: Any? = Object()
) {
    open val result: Int = 0
    open val message: String = "success"
}