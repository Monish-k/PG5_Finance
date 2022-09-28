package com.lti.root.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.root.entity.CustomerDetails;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer>{
	
	//@Query("select c from CustomerDetails c where customerName = ?1")
	CustomerDetails findBycustomerName(String customer_name);
	
	//@Query("select c from CustomerDetails c where customerEmail = ?1")
	CustomerDetails findBycustomerEmail(String customer_email);
}
