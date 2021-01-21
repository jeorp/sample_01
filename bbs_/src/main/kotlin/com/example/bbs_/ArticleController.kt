package com.example.bbs_

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
//import com.example.bbs_.ArticleRequest
// might be no essential

@Controller
class ArticleController {
    @Autowired
    lateinit var articleRepository:  ArticleRepository
    @PostMapping("/")
    //@ResponseBody
    fun registerArticle(@ModelAttribute articleRequest: ArticleRequest) : String {
            articleRepository.save(
                Article(
                    articleRequest.id,
                    articleRequest.name,
                    articleRequest.title,
                    articleRequest.contents,
                    articleRequest.articleKey
                )
            )
            return "redirect:/"
    }

    @GetMapping("/")
    fun getArticleList(model: Model) : String{
        model.addAttribute("articles", articleRepository.findAll())
        return "index"

    }
}