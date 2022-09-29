package com.lti.root.services;

import java.util.List;

import com.lti.root.entity.CardDetails;

public interface CardDetailsService {
	
	CardDetails getCardDetailsById(int id);
	boolean getStatusById(int id);
	void setBalanceById(int id, long product_cost);
	List<CardDetails> getAllCards();
	void setStatus(int id);
	
}
