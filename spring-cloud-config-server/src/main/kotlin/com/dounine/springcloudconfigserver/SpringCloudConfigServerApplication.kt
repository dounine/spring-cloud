package com.dounine.springcloudconfigserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringCloudConfigServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudConfigServerApplication::class.java, *args)
}
