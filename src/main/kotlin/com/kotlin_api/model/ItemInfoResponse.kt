package com.kotlin_api.model

import com.kotlin_api.common.dto.AbstractResponse
import com.kotlin_api.common.dto.ItemInfo
import org.springframework.data.domain.Page

class ItemInfoResponse(page: Page<ItemInfo>): AbstractResponse (
    DataResponse(
        page.content.map{ ItemInfoList(it) },
        page.content.size,
        page.hasNext()
    )
)

data class DataResponse (
    val itemList: List<ItemInfoList>,
    val totalCount: Int,
    val hasNext: Boolean
)

data class ItemInfoList (
    val itemId: String,
    val kindName: String,
    val itemName: String,
    val imageUrl: String,
    val status: String
) {
    constructor(it: ItemInfo): this (
        it.itemId,
        it.kindName,
        it.itemName,
        it.imageUrl,
        it.status
    )
}