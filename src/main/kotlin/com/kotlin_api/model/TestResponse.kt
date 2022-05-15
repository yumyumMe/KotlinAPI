package com.kotlin_api.model

import com.kotlin_api.entity.Item

data class TestResponse (
    var result: Int,
    var data: UserList,
    var message: String
)

data class UserList(
    var itemList: Array<Item>
    //var collectionList: Array<Object>
)