package com.freshreview.onlineshopping.service;

import com.freshreview.onlineshopping.entity.Order;

import java.util.List;

public interface OrderService {

	boolean createOrder(Order order);
	
	List<Order> getAllOrders();

}
