package com.example.bbs_

data class ArticleRequest(
    var id: Int = 0,
    var name: String = "",
    var title: String = "",
    var contents: String = "",
    var articleKey: String = ""
)

