package com.lti.root.services;

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
		
		if(card.isPresent()) {
			c = card.get();
			c.setCerditBalance(c.getCerditBalance()-product_cost);
		}
		
	}
}
