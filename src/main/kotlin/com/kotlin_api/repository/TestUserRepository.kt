package com.kotlin_api.repository

import com.kotlin_api.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface TestUserRepository: JpaRepository<User, String> {

    fun getByUserId(userId: String): List<User>

}