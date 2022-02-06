package com.example.kafka.kafkaconsumer.service;

import com.example.kafka.kafkaproducer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumerListener {
    @KafkaListener(topics = "test2", groupId = "group_id", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(User user) {
        System.out.println("Kafka consumer message: " + user);
    }
}
