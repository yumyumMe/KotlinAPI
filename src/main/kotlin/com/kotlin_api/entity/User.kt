package com.kotlin_api.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User (

    @Id
    @Column(name = "id")
    val Id: Int,

    @OneToOne
    @JoinColumn(name = "user_id")
    val userId: String,

    @Column(name = "user_name")
    val userName: String,

    @Column(name = "tel_num")
    val telNum: String,

    @Column(name = "status")
    val status: Int

    )