package com.dounine.module1.action

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("module-2")
interface Module2Client {

    @GetMapping("/")
    fun module2():String
}