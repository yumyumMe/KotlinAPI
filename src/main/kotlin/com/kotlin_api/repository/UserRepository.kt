package com.kotlin_api.repository

import com.kotlin_api.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository: JpaRepository<User, String> {
    
    fun getByUserId(uid: String): Optional<User>

}