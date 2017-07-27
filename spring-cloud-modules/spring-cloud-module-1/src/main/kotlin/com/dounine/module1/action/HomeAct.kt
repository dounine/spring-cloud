package com.dounine.module1.action

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeAct{

    @Autowired
    lateinit var module2Client: Module2Client;

    @Value("\${name}")
    lateinit var name:String;

    @GetMapping("/")
    fun home():String{
        return "my name is "+name
    }

    @GetMapping("module2")
    fun module2():String{
        return module2Client.module2()
    }

}