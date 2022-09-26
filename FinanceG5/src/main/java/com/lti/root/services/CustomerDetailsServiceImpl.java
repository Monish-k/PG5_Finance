package com.lti.root.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.root.dao.CustomerDetailsRepository;
import com.lti.root.entity.CardDetails;
import com.lti.root.entity.CustomerDetails;
import com.lti.root.exception.ExceptionFound;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService{

	@Autowired
	private CustomerDetailsRepository repo;
	
	@Override
	@Transactional
	public void saveCustomerDetails(CustomerDetails c) {
		repo.save(c);
		repo.flush();
	}

	@Override
	@Transactional
	public boolean validateUser(String username, String password) {
		CustomerDetails customer = repo.findBycustomerName(username);
		if(customer!=null) {
			if(customer.getCustomerPassword().equals(password)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	@Transactional
	public CustomerDetails getCustomerId(int id) {
		Optional<CustomerDetails> customer = repo.findById(id);
		CustomerDetails cst = null;
		if(customer.isPresent()) {
			cst = customer.get();
			return cst;
		}
		return null;
	}

	@Override
	@Transactional
	public String getCardTypeById(int id) {
		Optional<CustomerDetails> card = repo.findById(id);
		CustomerDetails c = null;
		if(card.isPresent()) {
			c = card.get();
			return c.getCardType();
		}
		return null;
	}

	@Override
	@Transactional
	public List<CustomerDetails> getAllCustomers() {
		List<CustomerDetails> customer_list = repo.findAll();
		return customer_list;
	}

	@Override
	@Transactional
	public boolean validateEmail(String email) {
		CustomerDetails customer = repo.findBycustomerEmail(email);
		if(customer!=null) {
			return true;
		}
		return false;
	}

}
