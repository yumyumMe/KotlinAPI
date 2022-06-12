package com.kotlin_api.service

import com.kotlin_api.model.userDetail
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
        fun getByUserId(uid: String): Optional<userDetail> {

            return testUserRepository.getByUserId(uid).map {
                it ->
                userDetail(
                    it.userId,
                    it.userName,
                    it.status
                )
            }

        }

}