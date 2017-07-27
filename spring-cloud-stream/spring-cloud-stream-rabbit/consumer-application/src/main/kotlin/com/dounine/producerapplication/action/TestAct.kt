package com.dounine.producerapplication.action

import com.dounine.producerapplication.ProducerApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.integration.dsl.IntegrationFlowBuilder
import org.springframework.integration.dsl.IntegrationFlows
import org.springframework.integration.dsl.support.GenericHandler
import org.springframework.messaging.Message
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.support.MessageBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TestAct {

    lateinit var channels:ConsumerChannels;



    @GetMapping("hello/{name}")
    fun hello(@PathVariable name: String): String {
        return name
    }

}

