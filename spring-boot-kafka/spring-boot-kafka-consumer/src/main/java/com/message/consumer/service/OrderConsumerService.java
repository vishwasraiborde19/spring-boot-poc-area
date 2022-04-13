package com.message.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.message.data.Order;

@Service
public class OrderConsumerService {
	
	@KafkaListener(id = "slow_orders", topics = "order_topic", containerFactory = "jsonKafkaListenerContainerFactory")
	public void receiveOrder(Order order) {
		System.out.println(order.toString());
	}
	
//	@KafkaListener(id = "sampleGroup", topics = "order_topic", containerFactory = "jsonKafkaListenerContainerFactory")
//	public void receiveFastOrder(Order order) {
//		System.out.println(order.toString());
//	}

}
