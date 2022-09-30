package com.lti.root.services;

import java.util.List;

import com.lti.root.entity.CustomerDetails;

public interface CustomerDetailsService {

	void saveCustomerDetails(CustomerDetails c);
	CustomerDetails validateUser(String us, String pwd);
	CustomerDetails getCustomerById(int id);
	String getCardTypeById(int id);
	List<CustomerDetails> getAllCustomers();
	boolean validateEmail(String email);
	boolean validateAdmin(String username, String password);
	
}
