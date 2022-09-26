package com.lti.root.services;

import com.lti.root.entity.CardDetails;

public interface CardDetailsService {

	public CardDetails getCardDetailsById(int id);
	
	public boolean getStatusById(int id);
	
	public void setBalanceById(int id, long product_cost);
	
	
}
