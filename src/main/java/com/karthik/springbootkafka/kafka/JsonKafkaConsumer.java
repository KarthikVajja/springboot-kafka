package com.karthik.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.karthik.springbootkafka.kafka.payload.User;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics="javaguides_json", groupId = "myGroup")
    public void consume(User data){
        LOGGER.info(String.format("Json message received: %s", data.toString()));
    }

}
