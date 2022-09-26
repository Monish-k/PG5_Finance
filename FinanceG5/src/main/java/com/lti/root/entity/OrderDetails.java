package com.lti.root.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public final class OrderDetails {
	
	@Override
	public String toString() {
		return "OrderDetails [order_id=" + order_id + ", order_date=" + order_date + ", paid_amount=" + paid_amount
				+ ", emi_duration=" + emi_duration + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int order_id;
	
	Date order_date;
	
	@OneToOne(targetEntity = ProductDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	ProductDetails product_ordered;
	
	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public OrderDetails() {
		super();
	}


	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public long getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(long paid_amount) {
		this.paid_amount = paid_amount;
	}

	public int getEmi_duration() {
		return emi_duration;
	}

	public void setEmi_duration(int emi_duration) {
		this.emi_duration = emi_duration;
	}

	long paid_amount;
	
	int emi_duration;
	
}
