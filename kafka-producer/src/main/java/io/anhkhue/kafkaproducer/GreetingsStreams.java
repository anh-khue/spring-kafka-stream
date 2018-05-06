package io.anhkhue.kafkaproducer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface GreetingsStreams {

    String GREETINGS_OUT = "greetingsOut";

    @Output(GREETINGS_OUT)
    MessageChannel greetingsOut();
}
