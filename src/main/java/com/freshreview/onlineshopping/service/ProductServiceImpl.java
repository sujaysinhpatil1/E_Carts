package com.freshreview.onlineshopping.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;

import com.freshreview.onlineshopping.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {


	@Override
	public @NotNull Iterable<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(@Min(value = 1, message = "Invalid product ID.") long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

    
}
