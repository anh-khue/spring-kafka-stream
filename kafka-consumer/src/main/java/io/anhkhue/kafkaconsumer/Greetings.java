package io.anhkhue.kafkaconsumer;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Greetings {

    private long timestamp;
    private String message;
}
