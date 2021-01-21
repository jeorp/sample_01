package com.example.bbs_

import org.springframework.data.jpa.repository.JpaRepository
import com.example.bbs_.Article

interface ArticleRepository : JpaRepository<Article, Int>