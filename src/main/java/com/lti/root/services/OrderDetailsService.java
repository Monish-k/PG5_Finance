package com.lti.root.services;

import java.util.List;

import com.lti.root.entity.CustomerDetails;
import com.lti.root.entity.OrderDetails;

public interface OrderDetailsService {

	public boolean saveOrder(CustomerDetails o);
	
	//public List<OrderDetails> getAllOrderDetails(int customer_id);
}
