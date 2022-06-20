package com.kotlin_api.service

import com.kotlin_api.model.userDetail
import com.kotlin_api.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional
class UserService (
    val UserRepository: UserRepository
    ){

        @Transactional(readOnly = true)
        fun getByUserId(uid: String): Optional<userDetail> {

            return UserRepository.getByUserId(uid).map {
                it ->
                userDetail(
                    it.userId,
                    it.userName,
                    it.status
                )
            }

        }
    }