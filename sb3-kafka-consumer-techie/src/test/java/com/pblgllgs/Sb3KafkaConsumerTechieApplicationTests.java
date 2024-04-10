package com.pblgllgs;

import com.pblgllgs.dto.Customer;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testcontainers.shaded.org.awaitility.Awaitility.await;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
public class Sb3KafkaConsumerTechieApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sb3KafkaConsumerTechieApplicationTests.class);

    @Container
    static KafkaContainer kafkaContainer = new KafkaContainer(
            DockerImageName.parse("confluentinc/cp-kafka:6.2.1"));

    @DynamicPropertySource
    public static void initKafkaProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.kafka.bootstrap-servers", kafkaContainer::getBootstrapServers);
    }

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @Test
    void testConsumeMessage(){
        LOGGER.info("testConsumer method execution started...");
        Customer customer = new Customer(1, "message", "test@gmail.com", "123123123");
        kafkaTemplate.send("pblgllgs-topic-customer", customer);
        LOGGER.info("testConsumer method execution ended...");
        await().pollInterval(Duration.ofSeconds(3)).atMost(10, TimeUnit.SECONDS).untilAsserted(()-> {

        });
    }

}
