package com.dounine.module1.action

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RefreshScope
class HomeAct{

    @Value("\${name}")
    lateinit var user:String;

    @GetMapping("/")
    fun home():String{
        return "my name is "+user
    }

}