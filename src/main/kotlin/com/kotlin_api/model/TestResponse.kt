package com.kotlin_api.model

import com.kotlin_api.entity.User

data class TestResponse (

    var result: Int,
    var data: userListData,
    var message: String

    )

data class userListData (

    var userList: List<User>

    )
