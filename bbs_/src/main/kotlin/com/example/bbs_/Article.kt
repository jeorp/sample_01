package com.example.bbs_

import javax.persistence.*
import java.util.*

@Entity
data class Article (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,
    var name: String = "",
    var title: String = "",
    var contents: String = "",
    @Column(name = "article_key")
    var articleKey: String = "",
    @Column(name = "register_at")
    var registerAt: Date = Date(),
    @Column(name = "update_at")
    var updateAT: Date = Date()
        )
