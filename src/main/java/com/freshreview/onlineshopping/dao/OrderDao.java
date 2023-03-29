package com.freshreview.onlineshopping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.freshreview.onlineshopping.entity.Order;

public interface OrderDao extends CrudRepository<Order, Long> {
	
	boolean createOrder(Order order);
	
	@Query(value = "select*from Order;", nativeQuery = true)
	List<Order> getAllOrders();
	
}
