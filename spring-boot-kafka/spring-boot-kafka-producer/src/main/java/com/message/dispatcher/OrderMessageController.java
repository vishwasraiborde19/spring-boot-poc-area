package com.message.dispatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.message.data.Order;
import com.message.producer.service.OrderService;

@RestController
public class OrderMessageController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/order")
	public Order getOrder(@RequestBody Order order) {
		orderService.placeOrder(order);
		return order;		
	}
	
//	@GetMapping("/orders")
//	public Order getOrders() {
//		Order order = new Order(1, 1d, 1d, "test", "test", "test");
//		
//		orderService.placeOrder(order);
//		return  order ;		
//	}

}
