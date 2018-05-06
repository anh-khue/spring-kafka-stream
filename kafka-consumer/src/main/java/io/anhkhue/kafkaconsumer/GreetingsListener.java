package io.anhkhue.kafkaconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GreetingsListener {

    @StreamListener(GreetingsStreams.GREETINGS_IN)
    public void processMessage(@Payload Greetings greetings) {
        log.info("Received message: {}", greetings);
    }
}
