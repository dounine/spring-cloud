package com.dounine.springcloudconfigserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
@EnableConfigurationProperties
class SpringCloudConfigServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudConfigServerApplication::class.java, *args)
}
