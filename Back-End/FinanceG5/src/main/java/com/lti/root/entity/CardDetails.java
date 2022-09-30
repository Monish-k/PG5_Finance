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
	int cardid;
	
	long creditbalance,credittotal;
	int cardstatus;
	Date cardvalidity;
	
//	@Autowired
//	@OneToOne(targetEntity = CustomerDetails.class, cascade = CascadeType.ALL)
//	@JoinColumn(referencedColumnName = "customer_id")
//	int customer_id;
	public CardDetails() {
		super();
	}

	public int getCardid() {
		return cardid;
	}

	public void setCardid(int cardid) {
		this.cardid = cardid;
	}

	public long getCreditbalance() {
		return creditbalance;
	}

	public void setCreditbalance(long creditbalance) {
		this.creditbalance = creditbalance;
	}

	public long getCredittotal() {
		return credittotal;
	}

	public void setCredittotal(long credittotal) {
		this.credittotal = credittotal;
	}

	public int getCardstatus() {
		return cardstatus;
	}

	public void setCardstatus(int cardstatus) {
		this.cardstatus = cardstatus;
	}

	public Date getCardvalidity() {
		return cardvalidity;
	}

	public void setCardvalidity(Date cardvalidity) {
		this.cardvalidity = cardvalidity;
	}

	public CardDetails(long creditbalance, long credittotal, int cardstatus, Date cardvalidity) {
		super();
		this.creditbalance = creditbalance;
		this.credittotal = credittotal;
		this.cardstatus = cardstatus;
		this.cardvalidity = cardvalidity;
	}

	public CardDetails(int cardid, long creditbalance, long credittotal, int cardstatus, Date cardvalidity) {
		super();
		this.cardid = cardid;
		this.creditbalance = creditbalance;
		this.credittotal = credittotal;
		this.cardstatus = cardstatus;
		this.cardvalidity = cardvalidity;
	}

	@Override
	public String toString() {
		return "CardDetails [cardid=" + cardid + ", creditbalance=" + creditbalance + ", credittotal=" + credittotal
				+ ", cardstatus=" + cardstatus + ", cardvalidity=" + cardvalidity + "]";
	}
		
}
