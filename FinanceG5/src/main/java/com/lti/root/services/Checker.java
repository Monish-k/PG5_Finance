package com.lti.root.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.root.dao.CustomerDetailsRepository;
import com.lti.root.entity.CustomerDetails;

@Service
public class Checker {
	
	@Autowired
	CustomerDetailsRepository repo;
	
	@Transactional
	public CustomerDetails createCustomerDetails(CustomerDetails customerDetails) {
		//repo.saveAndFlush(customerDetails);
		return this.repo.save(customerDetails);	
		
	}
	
}
