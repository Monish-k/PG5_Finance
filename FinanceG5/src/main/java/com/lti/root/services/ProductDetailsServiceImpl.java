package com.lti.root.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.root.dao.ProductDetailsRepository;
import com.lti.root.entity.ProductDetails;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	private ProductDetailsRepository repo;
	
	@Override
	@Transactional
	public List<ProductDetails> getAllProduct() {
		List<ProductDetails> product_list = repo.findAll();
		return product_list;
	}

	@Override
	@Transactional
	public ProductDetails getProductById(int id) {
		Optional<ProductDetails> product = repo.findById(id);
		ProductDetails p = null;
		if(product.isPresent()) {
			p = product.get();
			return p;
		}
		return null;
	}

}
