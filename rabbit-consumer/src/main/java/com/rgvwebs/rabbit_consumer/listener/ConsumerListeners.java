package com.rgvwebs.rabbit_consumer.listener;

import com.rgvwebs.rabbit_consumer.config.RabbitmqConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import  com.rgvwebs.rabbit_publisher.models.Models;

@Service @RequiredArgsConstructor @Slf4j
public class ConsumerListeners {
    @RabbitListener(queues = RabbitmqConfig.QUEUE_COLOR)
    public void readColorMessage(Models.Color color){
        log.info("Receiving color {}", color);
    }
    @RabbitListener(queues = RabbitmqConfig.QUEUE_SHAPE)
    public void readColorMessage(Models.Shape shape){
        log.info("Receiving shape {}", shape);
    }
}
