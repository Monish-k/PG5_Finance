package com.lti.root.services;

import java.util.List;

import com.lti.root.entity.OrderDetails;

public interface OrderDetailsService {

	public boolean saveOrder(OrderDetails o);
	
	public List<OrderDetails> getAllOrderDetails(int customer_id);
}
