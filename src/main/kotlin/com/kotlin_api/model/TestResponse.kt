package com.kotlin_api.model

import com.kotlin_api.entity.User

data class TestResponse (
    var result: Int,
    var data: UserList,
    var message: String
)

data class UserList(
    var list: List<User>
)