package com.lti.root.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.root.dao.CustomerDetailsRepository;
import com.lti.root.entity.CustomerDetails;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	CustomerDetailsRepository repo;
	
	@Transactional
	@Override
	public void saveCustomerDetails(CustomerDetails c) {
		this.repo.saveAndFlush(c);
		
	}

	@Override
	@Transactional
	public CustomerDetails validateUser(String us, String pwd) {
		CustomerDetails c = repo.findBycustomername(us);
		if(c!=null) {
			if(c.getCustomerpassword().equals(pwd)) {
				return c;
			}
		}
		return null;
	}

	@Override
	@Transactional
	public CustomerDetails getCustomerById(int id) {
		// TODO Auto-generated method stub
		Optional<CustomerDetails> c = repo.findById(id);
		if(c.isPresent()) {
			return c.get();
		}
		return null;
	}

	@Override
	@Transactional
	public String getCardTypeById(int id) {
		Optional<CustomerDetails> c = repo.findById(id);
		CustomerDetails cd;
		if(c.isPresent()) {
			cd = c.get();
			return cd.getCardtype();
		}
		return null;
	}

	@Override
	@Transactional
	public List<CustomerDetails> getAllCustomers() {
		// TODO Auto-generated method stub
		List<CustomerDetails> lst = repo.findAll();
		return lst;
	}

	@Override
	@Transactional
	public boolean validateEmail(String email) {
		// TODO Auto-generated method stub
		CustomerDetails c = repo.findBycustomeremail(email);
		if(c!=null) {
			return true;
		}
		return false;
	}
	
	@Override
	@Transactional
	public boolean validateAdmin(String username, String password) {
		// TODO Auto-generated method stub
		CustomerDetails c = repo.findBycustomername(username);
		if(c!=null) {
			if(c.getCustomerpassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
