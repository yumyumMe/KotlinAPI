package com.kotlin_api.model

import java.util.*

data class TestResponse (

    var result: Int,
    var data: userData,
    var message: String

    )

data class userData(

    var userInfo: Optional<userDetail>

    )

data class userDetail (

    var userId: String,
    var userName: String,
    var status: Int

    )
