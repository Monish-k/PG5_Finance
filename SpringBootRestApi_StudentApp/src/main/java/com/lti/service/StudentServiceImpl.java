package com.lti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.StudentRepository;
import com.lti.entity.Student;
import com.lti.exceptions.NoStudentFoundException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sRepo;
	
	@Transactional
	@Override
	public Student createStudent(Student s) {
		
		return sRepo.save(s);
		
	}

	@Override
	public List<Student> listofStudents() {
		// TODO Auto-generated method stub
		return sRepo.findAll();
	}

	@Override
	public Student findStudentById(int rollno) throws NoStudentFoundException {
		// TODO Auto-generated method stub
		Optional<Student> sFind = sRepo.findById(rollno);
		Student stud = null;
		if(sFind.isPresent()) {
			stud =sFind.get();
			
		}
		else {
			throw new NoStudentFoundException("Student not found");
		}
	   return stud;
	}

	@Override
	@Transactional
	public Student updateStudentById(int rollno, Student s) throws NoStudentFoundException {
		Optional<Student> sFind = sRepo.findById(rollno);
		Student stud = null;
		if(sFind.isPresent()) {
//	stud =sFind.get();
			sRepo.save(s);
		}
		else {
			throw new NoStudentFoundException("Student not found");
		}
	   return s;
		 
	}

	@Override
	public Student deleteStudentByid(int rollno) throws NoStudentFoundException {
		Optional<Student> sFind = sRepo.findById(rollno);
		Student stud = null;
		if(sFind.isPresent()) {
			stud =sFind.get();
			sRepo.delete(stud);
			
		}
		else {
			throw new NoStudentFoundException("Student not found");
		}
	   return stud;
	}

}
