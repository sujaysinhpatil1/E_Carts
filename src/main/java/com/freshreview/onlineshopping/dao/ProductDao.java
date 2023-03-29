package com.freshreview.onlineshopping.dao;

import org.springframework.data.repository.CrudRepository;

import com.freshreview.onlineshopping.entity.Product;

public interface ProductDao extends CrudRepository<Product, Long> {
	
	boolean addProduct(Product product);
	
}
