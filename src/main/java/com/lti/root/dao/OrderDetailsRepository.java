package com.lti.root.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.root.entity.OrderDetails;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

	@Query("select o from OrderDetails o where customerId = ?1")
	List<OrderDetails> findBycustomerId(int customerId);
	
}
