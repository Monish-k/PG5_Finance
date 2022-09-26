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
	int card_id;
	
	long cerdit_balance,credit_total;
	int card_status;
	Date card_validity;
	
//	@Autowired
//	@OneToOne(targetEntity = CustomerDetails.class, cascade = CascadeType.ALL)
//	@JoinColumn(referencedColumnName = "customer_id")
//	int customer_id;
	public CardDetails() {
		super();
	}
	public CardDetails(int card_id, long cerdit_balance, long credit_total, int card_status, Date card_validity) {
		super();
		this.card_id = card_id;
		this.cerdit_balance = cerdit_balance;
		this.credit_total = credit_total;
		this.card_status = card_status;
		this.card_validity = card_validity;
	}
	@Override
	public String toString() {
		return "CardDetails [card_id=" + card_id + ", cerdit_balance=" + cerdit_balance + ", credit_total="
				+ credit_total + ", card_status=" + card_status + ", card_validity=" + card_validity + "]";
	}
	public int getCard_id() {
		return card_id;
	}
	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}
	public long getCerdit_balance() {
		return cerdit_balance;
	}
	public void setCerdit_balance(long cerdit_balance) {
		this.cerdit_balance = cerdit_balance;
	}
	public long getCredit_total() {
		return credit_total;
	}
	public void setCredit_total(long credit_total) {
		this.credit_total = credit_total;
	}
	public int isCard_status() {
		return card_status;
	}
	public void setCard_status(int card_status) {
		this.card_status = card_status;
	}
	public Date getCard_validity() {
		return card_validity;
	}
	public void setCard_validity(Date card_validity) {
		this.card_validity = card_validity;
	}
	
	
}
