package com.example.githubpagesdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class Controller {

    @GetMapping("/")
    suspend fun getHello(): String {
        return "hello world"
    }
}