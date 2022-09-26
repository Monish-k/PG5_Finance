package com.lti.root.services;

import java.util.List;

import com.lti.root.entity.CustomerDetails;

public interface CustomerDetailsService {

	public void saveCustomerDetails(CustomerDetails c);
	
	public boolean validateUser(String username, String password);
	
	public CustomerDetails getCustomerId(int id);
	
	public String getCardTypeById(int id);
	
	public List<CustomerDetails> getAllCustomers();
	
	public boolean validateEmail(String email);
	
}
