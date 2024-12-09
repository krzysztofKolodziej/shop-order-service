package com.shop.shop_order_service.order.controller;

import com.shop.shop_order_service.order.service.KafkaOrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class KafkaOrderController {

    private final KafkaOrderService producerService;

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
        producerService.sendMessage("order-events", message);
        return ResponseEntity.ok("Message published to Kafka topic");
    }
}
