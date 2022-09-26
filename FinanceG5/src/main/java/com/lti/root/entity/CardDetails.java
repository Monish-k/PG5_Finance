package com.lti.root.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@Entity
@SequenceGenerator(name = "seq", initialValue = 10000, allocationSize = 1)
public final class CardDetails {
	
	@Id
	@GeneratedValue(generator = "seq", strategy = GenerationType.AUTO)
	int cardId;
	
	long cerditBalance,creditTotal;
	int cardStatus;
	Date cardValidity;
	
	public CardDetails() {
		super();
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public long getCerditBalance() {
		return cerditBalance;
	}

	public void setCerditBalance(long cerditBalance) {
		this.cerditBalance = cerditBalance;
	}

	public long getCreditTotal() {
		return creditTotal;
	}

	public void setCreditTotal(long creditTotal) {
		this.creditTotal = creditTotal;
	}

	public int getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(int cardStatus) {
		this.cardStatus = cardStatus;
	}

	public Date getCardValidity() {
		return cardValidity;
	}

	public void setCardValidity(Date cardValidity) {
		this.cardValidity = cardValidity;
	}

	public CardDetails(int cardId, long cerditBalance, long creditTotal, int cardStatus, Date cardValidity) {
		super();
		this.cardId = cardId;
		this.cerditBalance = cerditBalance;
		this.creditTotal = creditTotal;
		this.cardStatus = cardStatus;
		this.cardValidity = cardValidity;
	}	
	
}
