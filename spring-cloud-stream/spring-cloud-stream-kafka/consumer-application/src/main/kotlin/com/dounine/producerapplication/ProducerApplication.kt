package com.dounine.producerapplication

import com.dounine.producerapplication.action.ConsumerChannels
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.context.annotation.Bean
import org.springframework.integration.dsl.IntegrationFlow
import org.springframework.integration.dsl.IntegrationFlows

@SpringBootApplication
@EnableBinding(ConsumerChannels::class)
class ProducerApplication(channels: ConsumerChannels){

    init {
        ProducerApplication.channels = channels;
    }

    companion object {
        lateinit var channels:ConsumerChannels;
        @Bean
        fun integrationFlow(): IntegrationFlow {
            return IntegrationFlows.from(channels.producer()).handle(String::class.java, { payload, headers ->
                println("接收消息:"+payload)
                null
            }).get()
        }
    }
}


fun main(args: Array<String>) {
    SpringApplication.run(ProducerApplication::class.java, *args)
}





