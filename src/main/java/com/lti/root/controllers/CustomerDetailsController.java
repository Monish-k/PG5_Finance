package com.lti.root.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.root.entity.CustomerDetails;
import com.lti.root.services.CustomerDetailsService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class CustomerDetailsController {
	
	@Autowired
	private CustomerDetailsService service;
	
	@PostMapping("/customer")
	public void addCustomer(@RequestBody CustomerDetails c) {
		service.saveCustomerDetails(c);
	}
	
	@GetMapping("/validate")
	public boolean validateCustomer(@RequestParam("username") String username,@RequestParam("password") String password) {
		return service.validateUser(username, password);
	}
	
	@GetMapping("/getUserById/{id}")
	public CustomerDetails getCustomerById(@PathVariable("id") int id) {
		return service.getCustomerId(id);
	}
	
	@GetMapping("/getCardById/{id}")
	public String getCardById(@PathVariable("id") int id) {
		return service.getCardTypeById(id);
	}
	
	@GetMapping("/getAllUser")
	public List<CustomerDetails> getCardById() {
		return service.getAllCustomers();
	}
	
	@GetMapping("/validateUser/{email}")
	public boolean getCardById(@PathVariable("email") String email) {
		return service.validateEmail(email);
	}
	
}