package com.absattar.rabbitmq.services;

import lombok.Setter;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Setter
@Service
public class MessageSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${queue.name}")
    private String queueName;

    public void send(String message){
        amqpTemplate.convertAndSend(queueName,message);
    }
}
