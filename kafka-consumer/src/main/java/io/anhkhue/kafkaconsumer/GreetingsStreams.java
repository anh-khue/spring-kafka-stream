package io.anhkhue.kafkaconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface GreetingsStreams {

    String GREETINGS_IN = "greetingsIn";

    @Input(GREETINGS_IN)
    SubscribableChannel greetingsIn();

}
