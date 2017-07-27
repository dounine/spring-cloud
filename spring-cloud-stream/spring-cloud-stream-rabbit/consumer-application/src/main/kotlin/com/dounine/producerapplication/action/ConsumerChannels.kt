package com.dounine.producerapplication.action

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.SubscribableChannel

interface ConsumerChannels {

    @Input
    fun producer():SubscribableChannel
}