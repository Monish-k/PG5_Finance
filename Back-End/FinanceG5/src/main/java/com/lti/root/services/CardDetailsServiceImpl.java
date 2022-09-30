package com.lti.root.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.root.dao.CardDetailsRepository;
import com.lti.root.entity.CardDetails;

@Service
public class CardDetailsServiceImpl implements CardDetailsService{

	@Autowired
	CardDetailsRepository repo;
	
	@Transactional
	@Override
	public CardDetails getCardDetailsById(int id) {
		// TODO Auto-generated method stub
		Optional<CardDetails> c = repo.findById(id);
		if(c.isPresent()) {
			return c.get();
		}
		return null;
	}

	@Transactional
	@Override
	public boolean getStatusById(int id) {
		// TODO Auto-generated method stub
		Optional<CardDetails> c = repo.findById(id);
		CardDetails cd;
		if(c.isPresent()){
			cd = c.get();
			 if(cd.getCardstatus()==1) {
				 return true;
			 }
		}
		return false;
		
	}

	@Transactional
	@Override
	public void setBalanceById(int id , long product_cost) {
		// TODO Auto-generated method stub
		Optional<CardDetails> c = repo.findById(id);
		CardDetails cd;
		if(c.isPresent()) {
			cd=c.get();
			cd.setCreditbalance(cd.getCreditbalance()- product_cost);
		}
	}
	@Transactional
	@Override
	public List<CardDetails> getAllCards() {
		// TODO Auto-generated method stub
		List<CardDetails> cardList = repo.findAll();
		
		return cardList;
	}

	@Override
	public void setStatus(int id) {
		// TODO Auto-generated method stub
		Optional<CardDetails> card = repo.findById(id);
		System.out.println("outside");
		if(card.isPresent()) {
			System.out.println("inside");
			card.get().setCardstatus(1);
			repo.save(card.get());
		}
		
	}

}
