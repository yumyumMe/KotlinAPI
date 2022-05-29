package com.kotlin_api.service

import com.kotlin_api.entity.User
import com.kotlin_api.repository.TestUserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional
class TestService (
        val testUserRepository: TestUserRepository
        ){

        @Transactional(readOnly = true)
        fun getByUserId(userId: String): List<User> = testUserRepository.getByUserId(userId)
}