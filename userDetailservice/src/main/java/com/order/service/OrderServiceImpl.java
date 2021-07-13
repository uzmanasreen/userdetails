package com.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.UserDetail;
import com.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	
	
	  @Override public UserDetail createOrder(UserDetail user) { 
		  return orderRepository.save(user); }
	 

}
