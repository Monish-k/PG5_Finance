package com.lti.root.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.root.dao.OrderDetailsRepository;
import com.lti.root.entity.OrderDetails;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{

	@Autowired
	OrderDetailsRepository repo;
	
	@Transactional
	@Override
	public boolean saveOrder(OrderDetails o) {
		// TODO Auto-generated method stub
		if(repo.saveAndFlush(o) != null) {
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public List<OrderDetails> getAllOrders(int customer_id) {
		// TODO Auto-generated method stub
		List<OrderDetails> order = repo.findBycustomer_id(customer_id);
		return order;
	}

}
