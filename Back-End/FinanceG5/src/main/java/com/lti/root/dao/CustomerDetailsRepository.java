package com.lti.root.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.root.entity.CustomerDetails;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer>{
	CustomerDetails findBycustomername(String customername);
	CustomerDetails findBycustomeremail(String customeremail);
}
