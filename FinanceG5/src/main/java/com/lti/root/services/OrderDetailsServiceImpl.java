package com.lti.root.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.root.dao.CustomerDetailsRepository;
import com.lti.root.dao.OrderDetailsRepository;
import com.lti.root.entity.CustomerDetails;
import com.lti.root.entity.OrderDetails;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{

	@Autowired
	OrderDetailsRepository repo;
	@Autowired
	CustomerDetailsRepository repo2;
	
	@Transactional
	@Override
	public boolean saveOrder(CustomerDetails o) {
		// TODO Auto-generated method stub
		Optional<CustomerDetails> o1 = repo2.findById(o.getCustomerid());
		System.out.println(o.getCustomeremail());
		if(o1.isPresent()) {
			System.out.println("trying to save");
			CustomerDetails c = o1.get();
			List<OrderDetails> olist = o.getCustomerorderlist();
			olist.get(0).setOrderdate(new Date());
			c.setCustomerorderlist(olist);
			repo2.save(c);
			return true;
		}
		System.out.println("not saved");
		return false;
	}

	@Override
	@Transactional
	public List<OrderDetails> getAllOrders(int customerfk) {
		// TODO Auto-generated method stub
		List<OrderDetails> order = repo.findByCUSTOMERFK(customerfk);
		return order;
	}

}
