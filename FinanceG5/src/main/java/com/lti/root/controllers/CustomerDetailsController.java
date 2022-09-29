package com.lti.root.controllers;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.root.entity.CardDetails;
import com.lti.root.entity.CustomerDetails;
//import com.lti.root.services.Checker;
import com.lti.root.services.CustomerDetailsService;
import com.lti.root.services.CustomerDetailsServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200")
public class CustomerDetailsController {
	
	@Autowired
	CustomerDetailsService service = new CustomerDetailsServiceImpl();
	
//	@GetMapping(value="/addcustomer")
//	public CustomerDetails saveCustomers(){
//		return c.createCustomerDetails(new CustomerDetails());
//	}
	
	@PostMapping(value="/addcustomer")
	public void addCustomer(@RequestBody CustomerDetails c) {
		CardDetails cc = new CardDetails();
		cc.setCardstatus(0);
		if(c.getCardtype().equals("gold")) {
			cc.setCreditbalance(100000);
			cc.setCredittotal(100000);
		}
		else {
			cc.setCreditbalance(1000000);
			cc.setCredittotal(1000000);
		}
		cc.setCardvalidity(new Date("2999/12/12"));
		c.setCarddetails(cc);
		this.service.saveCustomerDetails(c);
	}
	
	@GetMapping("/getUserById/{id}")
	public CustomerDetails getCustomerById(@PathVariable("id") int id) {
		return service.getCustomerById(id);
	}

	
	@GetMapping("/validate")
	public CustomerDetails validateCustomer(@RequestParam("username") String username, @RequestParam("password") String password) {
		return service.validateUser(username, password);
	}
	
	@GetMapping("/validateAdmin")
	public boolean validateAdmin(@RequestParam("username") String username, @RequestParam("password") String password) {
		return service.validateAdmin(username, password);
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