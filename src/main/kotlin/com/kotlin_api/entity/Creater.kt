package com.kotlin_api.entity

import javax.persistence.*

@Entity
@Table(name = "creater")
data class Creater (

    @Id
    @OneToMany
    @JoinColumn(name = "creater_id")
    val Id: String,

    @Column(name = "creater_name")
    val createrName: String,

    @Column(name = "creater_url")
    val createrUrl: String

)