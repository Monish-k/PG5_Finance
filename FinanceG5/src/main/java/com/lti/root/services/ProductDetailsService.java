package com.lti.root.services;

import java.util.List;

import com.lti.root.entity.ProductDetails;

public interface ProductDetailsService {
	
	List<ProductDetails> getAllProduct();
	ProductDetails getProductById(int id);
	
}
