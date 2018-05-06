package io.anhkhue.kafkaproducer;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Greetings {

    private long timestamp;
    private String message;

}
