package com.dounine.springcloudconfigserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringCloudConfigServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudConfigServerApplication::class.java, *args)
}
