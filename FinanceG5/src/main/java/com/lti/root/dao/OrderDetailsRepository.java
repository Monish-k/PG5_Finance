package com.lti.root.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.root.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
	List<OrderDetails> findBycustomer_id(int customer_id);
}
