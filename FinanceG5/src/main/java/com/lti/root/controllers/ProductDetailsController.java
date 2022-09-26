package com.lti.root.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lti.root.entity.ProductDetails;
import com.lti.root.services.ProductDetailsService;

@RestController
public class ProductDetailsController {

	@Autowired
	private ProductDetailsService service;
	
	@GetMapping("/getAllProduct")
	public List<ProductDetails> getAllProduct(){
		return service.getAllProduct();
	}
	
	@GetMapping("/getAllProduct/{id}")
	public ProductDetails getProductById(@PathVariable("id") int id){
		return service.getProductById(id);
	}
}
