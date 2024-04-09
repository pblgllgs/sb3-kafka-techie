package com.pblgllgs.sb3kafkatechie.controller;
/*
 *
 * @author pblgl
 * Created on 09-04-2024
 *
 */

import com.pblgllgs.sb3kafkatechie.service.KafkaMessagePublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    private final KafkaMessagePublisher kafkaMessagePublisher;

    public EventController(KafkaMessagePublisher kafkaMessagePublisher) {
        this.kafkaMessagePublisher = kafkaMessagePublisher;
    }

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable("message") String message) {
        try {
            kafkaMessagePublisher.sendMessageToTopic(message);
            for (int i = 0; i < 10000; i++) {
                kafkaMessagePublisher.sendMessageToTopic(
                        message + " : " + i
                );
            }
            return new ResponseEntity<>(Map.of("response", "Message publish successfully"), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(Map.of("response", "Message can not send"),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
