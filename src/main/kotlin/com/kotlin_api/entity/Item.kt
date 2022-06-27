package com.kotlin_api.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "item")
data class Item (

    @Id
    @Column(name = "id")
    val Id: Int,

    @Column(name = "item_id")
    val itemId: String,

    @Column(name = "item_name")
    val itemName: String,

    @Column(name = "image_url")
    val imageUrl: String,

    @Column(name = "status")
    val status: String,

    @ManyToOne
    @JoinColumn(name = "kind_id")
    val kind: Kind,

    @Column(name = "creator_id")
    val creatorId: String,

    @Column(name = "create_datetime")
    val createDatetime: LocalDateTime,

    @Column(name = "update_datetime")
    val updateDatetime: LocalDateTime,

    @Column(name = "deleted")
    val deleted: Int,

    @Column(name = "version")
    val version: Int

    )