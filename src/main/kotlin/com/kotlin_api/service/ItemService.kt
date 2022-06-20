package com.kotlin_api.service

import com.kotlin_api.common.dto.ItemInfo
import com.kotlin_api.common.enum.ItemHolderStatus
import com.kotlin_api.entity.Kind
import com.kotlin_api.entity.Item
import com.kotlin_api.repository.ItemRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ItemService (
    val itemRepository: ItemRepository
    ){

    @Transactional(readOnly = true)
    fun findItemInfoUIDAndStatus(uid: String, limit: Int, page: Int): Page<ItemInfo> {
        return itemRepository.findItemInfoUIDAndStatus(uid, PageRequest.of(page, limit))
            .map {
                it ->
                val item = it.get(0) as Item
                val kind = it.get(1) as Kind

                ItemInfo(
                    item.itemId,
                    kind.kindName,
                    item.itemName,
                    item.imageUrl,
                    item.status
                )

            }
    }

}