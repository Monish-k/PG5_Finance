package com.lti.root.controllers;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.root.entity.CustomerDetails;
import com.lti.root.services.Checker;

@RestController
public class CustomerDetailsController {
	
	@Autowired
	Checker c;
	
	@GetMapping(value="/addcustomer")
	public CustomerDetails saveCustomers(){
		return c.createCustomerDetails(new CustomerDetails());
	}
	
}