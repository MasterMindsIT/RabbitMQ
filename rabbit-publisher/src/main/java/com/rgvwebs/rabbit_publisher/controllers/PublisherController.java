package com.rgvwebs.rabbit_publisher.controllers;


import com.rgvwebs.rabbit_publisher.config.RabbitmqConfig;
import com.rgvwebs.rabbit_publisher.models.Models;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/publish")
public class PublisherController {
    private final RabbitTemplate template;
    @PostMapping("/color")
    public String publishColor(@RequestBody Models.Color color){
        this.template.convertAndSend(RabbitmqConfig.EXCHANGE, RabbitmqConfig.ROUTING_KEY_COLOR, color);
        return "Color message send success";
    }
    @PostMapping("/shape")
    public String publishShape(@RequestBody Models.Shape shape){
        this.template.convertAndSend(RabbitmqConfig.EXCHANGE, RabbitmqConfig.ROUTING_KEY_SHAPE, shape);
        return "Shape message send success";
    }
}
