package com.maxiangyu.code.service;

import com.maxiangyu.code.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MQService {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    public void  sendMessage(String msg){
        rabbitTemplate.convertAndSend(RabbitMQConfig.RABBITMQ_DEMO_DIRECT_EXCHANGE,RabbitMQConfig.RABBITMQ_DEMO_DIRECT_ROUTING,msg);
    }
}
