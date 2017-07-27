package com.dounine.producerapplication

import com.dounine.producerapplication.action.ProducerChannels
import com.dounine.producerapplication.action.TestAct
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.messaging.MessageChannel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableBinding(ProducerChannels::class)
class ProducerApplication(channels: ProducerChannels){
    init {
        TestAct.CONSUMER = channels.consumer()
    }
}


fun main(args: Array<String>) {
    SpringApplication.run(ProducerApplication::class.java, *args)
}
