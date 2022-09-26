package com.lti.root.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.root.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

}
