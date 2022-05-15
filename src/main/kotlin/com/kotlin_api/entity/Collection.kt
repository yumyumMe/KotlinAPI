package com.kotlin_api.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "collection")
data class Collection (

    @Id
    @Column(name = "item_id")
    val Id: Int,

    @Column(name = "colection_id")
    val collectionId: Int,

    @Column(name = "collection_name")
    val collectionName: String,

    @Column(name = "collection_url")
    val collectionUrl: String,

    @Column(name = "status")
    val status: Int

)