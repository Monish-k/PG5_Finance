package com.lti.root.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.root.dao.OrderDetailsRepository;
import com.lti.root.entity.OrderDetails;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Autowired
	private OrderDetailsRepository repo;

	@Override
	@Transactional
	public boolean saveOrder(OrderDetails o) {
		if (o != null) {
			repo.save(o);
			repo.flush();
			return true;
		}
		return false;
	}

	@Override

	@Transactional
	public List<OrderDetails> getAllOrderDetails(int customer_id) {
		List<OrderDetails> order_list = repo.findBycustomerId(customer_id);
		System.out.println(order_list);
		return order_list;
	}

}
