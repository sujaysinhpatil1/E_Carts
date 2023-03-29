package com.freshreview.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freshreview.onlineshopping.dao.OrderDao;
import com.freshreview.onlineshopping.entity.Order;
import com.freshreview.onlineshopping.entity.Product;

import java.time.LocalDate;
import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
    private OrderDao orderDao;
    
    LocalDate date = LocalDate.now();
	int m = date.getMonthValue();

	double calculateCost(double cost) {
		List<Order> orderList = getAllOrders();	
		int orderNumber = orderList.size();

		if (m == 11 && orderNumber < 10) {
			cost = cost * 0.85;
		} else if (m == 11 && orderNumber >= 10 && orderNumber < 20) {
			cost = cost * 0.75;
		} else if (m == 11 && orderNumber >= 20) {
			cost = cost * 0.65;
		} else if (m != 11 && orderNumber >= 10 && orderNumber < 20) {
			cost = cost * 0.90;
		} else if (m != 11 && orderNumber >= 20) {
			cost = cost * 0.80;
		}
		return cost;
	}

	@Override
	public boolean createOrder(Order order) {

		order.setDateCreated(date);

		List<Product> productList = order.getProduct();
		Double totalCost = productList.stream().mapToDouble(i -> i.getPrice()).sum();
		double finalCost = calculateCost(totalCost);
		order.setCost(finalCost);
		
		boolean isCreated = orderDao.createOrder(order);
		return isCreated;
	}
	
	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
