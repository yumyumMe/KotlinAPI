package com.kotlin_api.common.dto

import javax.validation.constraints.NotBlank

data class ItemInfoRequest (
    @NotBlank
    val uid: String,
    val limit: Int,
    val page: Int
    )