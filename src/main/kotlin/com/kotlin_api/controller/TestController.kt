package com.kotlin_api.controller

import com.kotlin_api.model.TestResponse
import com.kotlin_api.model.UserList
import com.kotlin_api.service.TestService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/api/user/items/")
class TestController (
    val testService: TestService
    ){

    @GetMapping("/list")
    fun getUserItemList(
        @RequestParam(value = "userId", required = true) userId: String,
        @RequestParam(value = "limit", required = true) limit: Int,
        @RequestParam(value = "page", required = true) page: Int
    ): TestResponse{

        // itemテーブルから取得したレコードを詰める
        var userItemList = TestResponse(0, UserList(testService.getItemList(userId)), "success")
        return userItemList

        // collectionテーブルから取得したレコードを詰める

    }

}