package com.kotlin_api.controller

import com.kotlin_api.model.TestResponse
import com.kotlin_api.model.UserList
import com.kotlin_api.service.TestService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/api")
class TestController (
    val testService: TestService
    ){

    @GetMapping("/user")
    fun getUserItemList(
        @RequestParam(value = "userId", required = true) userId: String
    ): TestResponse {

        // userテーブルから取得したレコードを詰める
        var userItemList = TestResponse(0, UserList(testService.getByUserId(userId)), "success")
        return userItemList

    }

}