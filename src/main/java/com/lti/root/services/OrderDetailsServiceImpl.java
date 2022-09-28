package com.lti.root.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.root.dao.CustomerDetailsRepository;
import com.lti.root.entity.CustomerDetails;
import com.lti.root.entity.OrderDetails;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Autowired
	private CustomerDetailsRepository repo;

	@Override
	@Transactional
	public boolean saveOrder(CustomerDetails o) {
	  Optional<CustomerDetails>	o1 = repo.findById(o.getCustomerId());
		if (o1.isPresent()) {
			CustomerDetails c = o1.get();
			List<OrderDetails> olist = o.getCustomerOrderList();
			olist.get(0).setOrderDate(new Date());
			c.setCustomerOrderList(olist);
			repo.save(c);
			return true;
		}
		return false;
	}

//	@Override

	/*@Transactional
	public List<OrderDetails> getAllOrderDetails(int customer_id) {
		//List<OrderDetails> order_list = repo.findBycustomerId(customer_id);
		System.out.println(order_list);
		return order_list;
	}*/

}
