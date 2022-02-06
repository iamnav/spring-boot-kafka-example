package com.example.kafka.kafkaproducer.controller;

import com.example.kafka.kafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class UserController {
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC_NAME = "test2";

    @PostMapping("publish")
    public String publishMessage(@RequestBody User user) {
        kafkaTemplate.send(TOPIC_NAME, user);
        return "Published successfully";
    }
}
