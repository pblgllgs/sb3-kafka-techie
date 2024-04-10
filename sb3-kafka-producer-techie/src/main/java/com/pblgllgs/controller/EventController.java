package com.pblgllgs.controller;
/*
 *
 * @author pblgl
 * Created on 09-04-2024
 *
 */

import com.pblgllgs.dto.Customer;
import com.pblgllgs.service.KafkaMessagePublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    public static final String RESPONSE = "response";
    private final KafkaMessagePublisher kafkaMessagePublisher;

    public EventController(KafkaMessagePublisher kafkaMessagePublisher) {
        this.kafkaMessagePublisher = kafkaMessagePublisher;
    }

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable("message") String message) {
        try {
            kafkaMessagePublisher.sendMessageToTopic(message);
            return new ResponseEntity<>(Map.of(RESPONSE, "Message publish successfully"), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(Map.of(RESPONSE, "Message can not send"),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @GetMapping("/publish/partition")
//    public ResponseEntity<?> publishMessagePartitions() {
//        try {
//            kafkaMessagePublisher.sendMessageToTopicPartitions();
//            return new ResponseEntity<>(Map.of(RESPONSE, "Message publish successfully"), HttpStatus.OK);
//        } catch (Exception ex) {
//            return new ResponseEntity<>(Map.of(RESPONSE, "Message can not send"),HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @PostMapping("/publish")
    public ResponseEntity<?> publishMessage(@RequestBody Customer customer) {
        try {
            kafkaMessagePublisher.sendMessageToTopic(customer);
            return new ResponseEntity<>(Map.of(RESPONSE, customer), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(Map.of(RESPONSE, ex.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
