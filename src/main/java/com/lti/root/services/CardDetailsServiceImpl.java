package com.lti.root.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.root.dao.CardDetailsRepository;
import com.lti.root.entity.CardDetails;

@Service
public class CardDetailsServiceImpl implements CardDetailsService {

	@Autowired
	private CardDetailsRepository repo;

	@Override
	@Transactional
	public CardDetails getCardDetailsById(int id) {
		Optional<CardDetails> card = repo.findById(id);
		CardDetails c = null;
		if (card.isPresent()) {
			c = card.get();
			return c;
		}
		return null;
	}

	@Override
	@Transactional
	public boolean getStatusById(int id) {
		Optional<CardDetails> card = repo.findById(id);
		CardDetails c = null;
		if (card.isPresent()) {
			c = card.get();
			int status = c.getCardStatus();
			if (status == 1) {
				return true;
			}

		}
		return false;
	}

	@Override
	@Transactional
	public void setBalanceById(int id, long product_cost) {
		Optional<CardDetails> card = repo.findById(id);
		CardDetails c = null;
		System.out.println(card);
		if(card.isPresent()) {
			c = card.get();
			c.setCerditBalance(c.getCerditBalance()-product_cost);
			System.out.println(c);
			repo.save(c);
		}
		
	}

	@Override
	public List<CardDetails> getAllCards() {
		List<CardDetails> cardList = repo.findAll();
		return cardList;
	}

	@Override
	public void setStatus(int id) {
		// TODO Auto-generated method stub
		Optional<CardDetails> card =repo.findById(id);
		if(card.isPresent()) {
		card.get().setCardStatus(1);
		repo.save(card.get());
		}
	}
}
