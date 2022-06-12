package com.kotlin_api.controller

import com.kotlin_api.model.TestResponse
import com.kotlin_api.model.userData
import com.kotlin_api.service.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestController (
    val testService: TestService
    ){

    /**
     * ユーザー情報取得(request: userId)
     */
    @GetMapping("/user/info")
    fun getUserItemList(
        @RequestParam(value = "userId", required = true) uid: String
    ): TestResponse {

        // userテーブルから取得したレコードを詰める
        return TestResponse(0, userData(testService.getByUserId(uid)), "success")

    }

}