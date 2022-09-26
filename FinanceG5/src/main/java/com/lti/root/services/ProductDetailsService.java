package com.lti.root.services;

import java.util.List;

import com.lti.root.entity.ProductDetails;

public interface ProductDetailsService {

	public List<ProductDetails> getAllProduct();
	
	public ProductDetails getProductById(int id);
	
}
