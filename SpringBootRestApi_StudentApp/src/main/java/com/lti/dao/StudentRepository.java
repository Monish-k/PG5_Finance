package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
