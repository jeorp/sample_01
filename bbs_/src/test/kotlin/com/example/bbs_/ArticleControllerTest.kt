package com.example.bbs_

import com.example.bbs_.ArticleController
import org.junit.Test //some path might be source of error...
import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MockMvcBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import org.springframework.test.web.servlet.setup.MockMvcBuilders


@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest

class ArticleControllerTest {
    lateinit var mockMvc: MockMvc
    @Autowired
    lateinit var target: ArticleController

    @Before
    fun  setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(target).build()
    }
    @Test
    fun registerArticleTest(){
        mockMvc.perform(
                MockMvcRequestBuilders.post("/")
                    .param("name", "test")
                    .param("title", "test")
                    .param("contents", "test")
                    .param("articleKey", "test")
        )

            .andExpect(status().isOk)
            .andExpect(content().string("saved"))

    }

    fun getArticleTest(){
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andExpect(status().isOk)
            .andExpect(model().attributeExists("articles"))
            .andExpect(view().name("index1"))
    }
}