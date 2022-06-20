package com.kotlin_api.controller

import com.kotlin_api.common.dto.ItemInfoRequest
import com.kotlin_api.common.dto.UserInfoRequest
import com.kotlin_api.common.enum.ItemHolderStatus
import com.kotlin_api.model.ItemInfoResponse
import com.kotlin_api.model.UserInfoResponse
import com.kotlin_api.model.userData
import com.kotlin_api.service.ItemService
import com.kotlin_api.service.UserService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api/user")
class UserController (
    val userService: UserService,
    val itemService: ItemService
    ){

    /**
     * ユーザー情報取得(request: userId)
     */
    @GetMapping("/info")
    fun getUserInfo(
        @Valid request: UserInfoRequest
    ): UserInfoResponse {

        // userテーブルから取得したレコードを詰める
        return UserInfoResponse(0, userData(userService.getByUserId(request.uid)), "success")

    }

    /**
     * 所持アイテム情報取得(request: userId)
     */
    @GetMapping("/item/info")
    fun getItemInfoList(
        @Valid request: ItemInfoRequest
    ): ItemInfoResponse {

        return ItemInfoResponse(itemService.findItemInfoUIDAndStatus(request.uid, request.limit, request.page))

    }

}