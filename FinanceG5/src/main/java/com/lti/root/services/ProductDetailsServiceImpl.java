package com.lti.root.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.root.dao.ProductDetailsRepository;
import com.lti.root.entity.ProductDetails;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
	
	@Autowired
	ProductDetailsRepository repo;
	
	@Transactional
	@Override
	public List<ProductDetails> getAllProduct() {
		// TODO Auto-generated method stub
		List<ProductDetails> lst = repo.findAll();
		return lst;
	}

	@Override
	@Transactional
	public ProductDetails getProductById(int id) {
		// TODO Auto-generated method stub
		Optional<ProductDetails> op = repo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}

}
