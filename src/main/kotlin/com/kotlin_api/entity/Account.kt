package com.kotlin_api.entity

import javax.persistence.*

@Entity
@Table(name = "account")
data class Account (

    @Id
    @Column(name = "id")
    val Id: Int,

    @Column(name = "account_type")
    val accountType: String,

    @Column(name = "user_id")
    val userId: String,

    @Column(name = "creater_id")
    val createrId: String

    )