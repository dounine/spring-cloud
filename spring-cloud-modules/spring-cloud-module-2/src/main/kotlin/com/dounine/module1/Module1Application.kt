package com.dounine.module1

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class Module1Application

fun main(args: Array<String>) {
    SpringApplication.run(Module1Application::class.java, *args)
}
