package com.freshreview.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.freshreview.onlineshopping.entity.Order;
import com.freshreview.onlineshopping.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
    private OrderService orderService;
	
	@PostMapping(value = "/createOrder")
	public ResponseEntity<Boolean> createOrder(@RequestBody Order order){
		boolean isCreated = orderService.createOrder(order);
		if (isCreated) {
			return new ResponseEntity<Boolean>(isCreated, HttpStatus.OK);
		} else {
			return new ResponseEntity<Boolean>(isCreated, HttpStatus.BAD_REQUEST);
		}
	}
    
}
