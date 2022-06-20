package com.kotlin_api.common.dto

import javax.validation.constraints.NotBlank

data class UserInfoRequest (
    @NotBlank
    val uid : String
    )