package com.pblgllgs.sb3kafka.service;
/*
 *
 * @author pblgl
 * Created on 09-04-2024
 *
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "pblgllgs-topic",groupId = "pblgllgs-group")
    public void consumeMessage1(String message){
        LOGGER.info("Consumed message: {}", message);
    }

    @KafkaListener(topics = "pblgllgs-topic",groupId = "pblgllgs-group")
    public void consumeMessage2(String message){
        LOGGER.info("Consumed message: {}", message);
    }

    @KafkaListener(topics = "pblgllgs-topic",groupId = "pblgllgs-group")
    public void consumeMessage3(String message){
        LOGGER.info("Consumed message: {}", message);
    }

    @KafkaListener(topics = "pblgllgs-topic",groupId = "pblgllgs-group")
    public void consumeMessage4(String message){
        LOGGER.info("Consumed message: {}", message);
    }
}
