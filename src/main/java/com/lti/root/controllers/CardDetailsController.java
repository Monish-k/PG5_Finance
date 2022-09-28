package com.lti.root.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.root.entity.CardDetails;
import com.lti.root.services.CardDetailsService;

@RestController
@CrossOrigin("http://localhost:4200")
public class CardDetailsController {

	@Autowired
	private CardDetailsService service;
	
	@PutMapping("/setStatus/{id}")
	public void setStatus(@PathVariable int id) {
		service.setStatus(id);
	}
	
	@GetMapping("/getAllCards")
	public List<CardDetails> getAllCard(){
		return service.getAllCards();
	}
	
	@GetMapping("/getCard/{id}")
	public CardDetails getCardById(@PathVariable("id")int id) {
		return service.getCardDetailsById(id);
	}
	
	@GetMapping("/getCardStatus/{id}")
	public boolean getStatusById(@PathVariable("id")int id) {
		return service.getStatusById(id);
	}
	
	@GetMapping("/setBalance/{id}/{dd}")
	public void setBalenceById(@PathVariable("id")int id,@PathVariable("dd") int dd) {
		 service.setBalanceById(id, dd);
	}
	
	
}
