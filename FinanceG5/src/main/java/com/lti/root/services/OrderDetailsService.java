package com.lti.root.services;

import java.util.List;

import com.lti.root.entity.CustomerDetails;
import com.lti.root.entity.OrderDetails;

public interface OrderDetailsService {
	
	boolean saveOrder(CustomerDetails o);
	List<OrderDetails> getAllOrders(int customerfk);
	
}
