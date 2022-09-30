package com.lti.root.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.root.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
	@Query(value = "select o from OrderDetails o where customerfk= ?1")
	List<OrderDetails> findByCUSTOMERFK(int customerfk);
}
