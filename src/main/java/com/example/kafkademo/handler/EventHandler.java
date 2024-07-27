package com.example.kafkademo.handler;

import com.example.kafkademo.event.PaymentCreatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {

    @KafkaListener(topics = "payment-created-event-topic")
    public void handle(PaymentCreatedEvent paymentCreatedEvent){
        System.out.println("Event received: " + paymentCreatedEvent.toString());
    }
}
