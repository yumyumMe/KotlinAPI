package com.kotlin_api.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "user")
data class User (

    @Id
    @Column(name = "id")
    val id: Int,

    @Column(name = "user_id")
    val userId: String,

    @Column(name = "user_name")
    val userName: String,

    @Column(name = "tel_num")
    val telNum: String,

    @Column(name = "status")
    val status: Int,

    @Column(name = "create_datetime")
    val createDatetime: LocalDateTime,

    @Column(name = "update_datetime")
    val updateDatetime: LocalDateTime,

    @Column(name = "deleted")
    val deleted: Int,

    @Column(name = "version")
    val version: Int

    )