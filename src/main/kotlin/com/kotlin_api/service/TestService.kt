package com.kotlin_api.service

import com.kotlin_api.entity.User
import com.kotlin_api.model.users
import com.kotlin_api.repository.TestUserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TestService (
        val testUserRepository: TestUserRepository
        ){

        @Transactional(readOnly = true)
        fun getByUserId(uid: String): users {

            testUserRepository.getByUserId(uid).map {
                it ->

                users(
                    it.userId,
                    it.userName,
                    it.status
                )
            }

            return users // ここ書き方分からない

        }

}