package com.kotlin_api.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "item")
data class Item (

    @Id
    @Column(name = "id")
    val Id: Int,

    @Column(name = "item_name")
    val itemName: String,

    @Column(name = "image_url")
    val imageUrl: String,

    @ManyToMany
    @JoinColumn(name = "creater_id")
    val createrId: String,

    @Column(name = "create_date")
    val createDate: LocalDateTime

    )