package com.kotlin_api.repository

import com.kotlin_api.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TestItemRepository: JpaRepository<User, String> {
    fun getItemList(userId: String): Array<User>

}