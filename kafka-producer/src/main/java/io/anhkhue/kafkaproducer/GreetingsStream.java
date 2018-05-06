package io.anhkhue.kafkaproducer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface GreetingsStream {

    String GREETINGS_IN = "greetingsIn";
    String GREETINGS_OUT = "greetingsOut";

    @Input(GREETINGS_IN)
    SubscribableChannel greetingsIn();

    @Output(GREETINGS_OUT)
    MessageChannel greetingsOut();

}
