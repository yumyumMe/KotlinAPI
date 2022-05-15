package com.kotlin_api.service

import com.kotlin_api.entity.Item
import com.kotlin_api.repository.TestItemRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TestService (
        val testItemRepository: TestItemRepository
        ){

        @Transactional(readOnly = true)
        fun getItemList(userId: String): Array<Item> = testItemRepository.getItemList(userId)
}