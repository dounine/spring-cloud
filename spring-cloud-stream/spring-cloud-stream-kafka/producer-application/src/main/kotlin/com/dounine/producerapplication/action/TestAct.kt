package com.dounine.producerapplication.action

import com.dounine.producerapplication.ProducerApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.Message
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.support.MessageBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TestAct {

    companion object {
        lateinit var CONSUMER:MessageChannel
    }

    @GetMapping("send/{msg}")
    fun send(@PathVariable msg: String): String {
        var mm:Message<String> = MessageBuilder.withPayload(msg).build();
        CONSUMER.send(mm)
        println(msg+" 消息发送成功")
        return "success"
    }

}

