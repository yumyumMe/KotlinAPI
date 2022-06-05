package com.kotlin_api.model

import com.kotlin_api.entity.User

data class TestResponse (

    var result: Int,
    var data: userListData,
    var message: String

    )

data class userListData(

    var userList: List<users>

    )

data class users (

    var userId: String,
    var userName: String,
    var status: Int

    )
