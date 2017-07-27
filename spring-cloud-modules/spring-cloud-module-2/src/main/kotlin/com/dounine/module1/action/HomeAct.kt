package com.dounine.module1.action

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeAct{

    @Value("\${name}")
    lateinit var name:String;

    @GetMapping("/")
    fun home():String{
        return "my name is "+name
    }

}