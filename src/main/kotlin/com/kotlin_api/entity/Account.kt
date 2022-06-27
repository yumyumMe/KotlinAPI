package com.kotlin_api.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "account")
data class Account (

    @Id
    @Column(name = "id")
    val Id: Int,

    @Column(name = "account_id")
    val accountId: String,

    @Column(name = "account_type")
    val accountType: String,

    @OneToOne
    @JoinColumn(name = "user_id")
    val user: User,

    @Column(name = "creator_id")
    val creatorId: String?,

    @Column(name = "create_datetime")
    val createDatetime: LocalDateTime,

    @Column(name = "update_datetime")
    val updateDatetime: LocalDateTime,

    @Column(name = "deleted")
    val deleted: Int,

    @Column(name = "version")
    val version: Int

    )