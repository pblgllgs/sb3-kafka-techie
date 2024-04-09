package com.pblgllgs.sb3kafkatechie.config;
/*
 *
 * @author pblgl
 * Created on 09-04-2024
 *
 */

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {

    @Bean
    public NewTopic newTopic(){
        return new NewTopic("pblgllgs-topic", 3, (short) 1);
    }
}
