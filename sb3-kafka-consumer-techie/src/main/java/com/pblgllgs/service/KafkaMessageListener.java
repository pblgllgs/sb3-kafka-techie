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
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaMessageListener.class);

//    @KafkaListener(
//            topics = "pblgllgs-topic-partitions",
//            groupId = "pblgllgs-group",
//            topicPartitions = {
//                    @TopicPartition(
//                            topic = "pblgllgs-topic-partitions",
//                            partitions = {"2"}
//                    )})
//    public void consumeMessage(String message) {
//        LOGGER.info("Consumed message: {}", message);
//    }

    @KafkaListener(
            topics = "pblgllgs-topic",
            groupId = "pblgllgs-group")
    public void consumeMessage(String message) {
        LOGGER.info("Consumed message: {}", message);
    }

    @KafkaListener(topics = "pblgllgs-topic-customer", groupId = "pblgllgs-group")
    public void consumeMessage(Customer customer) {
        LOGGER.info("Consumed message: {}", customer.toString());
    }
}
