package com.dounine.producerapplication.action

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface ProducerChannels {

    @Output
    fun consumer(): MessageChannel
}