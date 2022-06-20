package com.kotlin_api.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "item_holder")
data class ItemHolder (

    @Id
    @Column(name = "id")
    val id: Int,

    @Column(name = "holder_id")
    val holderId: String,

    @Column(name = "item_id")
    val itemId: String,

    @Column(name = "account_id")
    val accountId: String,

    @Column(name = "status")
    val status: String,

    @Column(name = "create_datetime")
    val createDatetime: LocalDateTime,

    @Column(name = "update_datetime")
    val updateDatetime: LocalDateTime,

    @Column(name = "deleted")
    val deleted: Int,

    @Column(name = "version")
    val version: Int

)