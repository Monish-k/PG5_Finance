package com.lti.root.services;

import com.lti.root.entity.CardDetails;

public interface CardDetailsService {
	
	CardDetails getCardDetailsById(int id);
	boolean getStatusById(int id);
	void setBalanceById(int id, long product_cost);
	
}
