package com.message.producer.service;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import com.message.data.Order;

@Service
public class OrderService {
	
	@Autowired
	KafkaTemplate kafkatemplate;
	
	public void placeOrder(Order order) {
		ListenableFuture<?> result = kafkatemplate.send("order_topic", order);	
		try {
			System.out.println(result.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
