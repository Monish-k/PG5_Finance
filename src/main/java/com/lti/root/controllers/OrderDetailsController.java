package com.lti.root.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.root.entity.CustomerDetails;
import com.lti.root.entity.OrderDetails;
import com.lti.root.services.OrderDetailsService;

@RestController
@CrossOrigin("http://localhost:4200")
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService service;
	
	@PostMapping("/saveOrder")
	public void saveOrder(@RequestBody CustomerDetails c) {
		service.saveOrder(c);
	}
	
	/*
	 * @GetMapping("/getAllOrderDetails/{id}") public List<OrderDetails>
	 * getAllOrderDetails(@PathVariable("id") int id){ return
	 * service.getAllOrderDetails(id); }
	 */
}
