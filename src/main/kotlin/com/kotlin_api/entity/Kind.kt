package com.kotlin_api.entity

import javax.persistence.*

@Entity
@Table(name = "kind")
data class Kind (

    @Id
    @Column(name = "id")
    val Id: Int,

    @Column(name = "kind_id")
    val kindId: String,

    @Column(name = "item_id")
    val itemId: String,

    @Column(name = "kind_name")
    val kindName: String,

    @Column(name = "kind_url")
    val kindUrl: String,

    @Column(name = "creator_id")
    val creatorId: String

)