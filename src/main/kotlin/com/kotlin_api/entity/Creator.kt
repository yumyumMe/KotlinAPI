package com.kotlin_api.entity

import javax.persistence.*

@Entity
@Table(name = "creator")
data class Creator (

    @Id
    @Column(name = "id")
    val Id: String,

    @Column(name = "creator_id")
    val creatorId: String,

    @Column(name = "creator_name")
    val creatorName: String,

    @Column(name = "creator_url")
    val creatorUrl: String

)