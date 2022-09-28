package com.lti.root.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.root.entity.CardDetails;

@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails, Integer>{

}
