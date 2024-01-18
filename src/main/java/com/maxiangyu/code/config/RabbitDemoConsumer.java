package com.maxiangyu.code.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {RabbitMQConfig.RABBITMQ_DEMO_TOPIC})
public class RabbitDemoConsumer {
    @RabbitHandler
    public void process(String msg){
        System.out.println("消费者从mq中消费消息：" + msg);
    }
}
