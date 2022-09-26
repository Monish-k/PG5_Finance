package com.lti.root.services;

import java.util.List;

import com.lti.root.entity.OrderDetails;

public interface OrderDetailsService {
	
	boolean saveOrder(OrderDetails o);
	List<OrderDetails> getAllOrders(int customer_id);
	
}
