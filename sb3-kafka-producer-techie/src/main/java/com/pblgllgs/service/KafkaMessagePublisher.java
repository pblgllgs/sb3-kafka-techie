package com.pblgllgs.service;
/*
 *
 * @author pblgl
 * Created on 09-04-2024
 *
 */

import com.pblgllgs.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaMessagePublisher.class);
    public static final String PBLGLLGS_TOPIC_PARTITIONS = "pblgllgs-topic-partitions";

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaMessagePublisher(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessageToTopic(String message) {
        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("pblgllgs-topic", message);
        future.whenComplete((result, ex) -> {
            if (ex == null) {
                LOGGER.info("Sent message=[{}] with offset=[{}]", message, result.getRecordMetadata().offset());
            } else {
                LOGGER.error("Unable to send message=[{}] with offset=[{}]", message, ex.getMessage());
            }
        });
    }

//    public void sendMessageToTopicPartitions() {
//        kafkaTemplate.send(PBLGLLGS_TOPIC_PARTITIONS, 3, null, "message3");
//        kafkaTemplate.send(PBLGLLGS_TOPIC_PARTITIONS, 1, null, "message1");
//        kafkaTemplate.send(PBLGLLGS_TOPIC_PARTITIONS, 2, null, "message2");
//        kafkaTemplate.send(PBLGLLGS_TOPIC_PARTITIONS, 3, null, "message3");
//        kafkaTemplate.send(PBLGLLGS_TOPIC_PARTITIONS, 2, null, "message2");
//        kafkaTemplate.send(PBLGLLGS_TOPIC_PARTITIONS, 1, null, "message1");
//    }

    public void sendMessageToTopic(Customer customer) {
        try {
            CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("pblgllgs-topic-customer", customer);
            future.whenComplete((result, ex) -> {
                if (ex == null) {
                    LOGGER.info("Sent message=[{}] with offset=[{}]", customer.toString(), result.getRecordMetadata().offset());
                } else {
                    LOGGER.error("Unable to send message=[{}] with offset=[{}]", customer.toString(), ex.getMessage());
                }
            });
        } catch (Exception e) {
            LOGGER.error("Unable to send message=[{}]", e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
