package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.UserDetail;
import com.order.service.OrderService;


@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/user")
	public UserDetail createOrder(@RequestBody UserDetail user) {
		return orderService.createOrder(user);
	}
	
	
}
