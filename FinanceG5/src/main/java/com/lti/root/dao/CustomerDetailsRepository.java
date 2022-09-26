package com.lti.root.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.root.entity.CustomerDetails;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer>{
	CustomerDetails findBycustomer_name(String customer_name);
	CustomerDetails findBycustomer_email(String customer_email);
}
