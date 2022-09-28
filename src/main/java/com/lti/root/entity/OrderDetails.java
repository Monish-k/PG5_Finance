package com.lti.root.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

@Entity
public final class OrderDetails {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderId;

	@Nullable
	@Column(nullable = true)
	Date orderDate;
	
	@Nullable
	@Column(nullable = true)
	long paidAmount;
	
	@Nullable
	@Column(nullable = true)
	int emiDuration;

	
	@Column(nullable = true)
	String productName;

	public OrderDetails(Date orderDate, long paidAmount, int emiDuration, String productName) {
		super();
		this.orderDate = orderDate;
		this.paidAmount = paidAmount;
		this.emiDuration = emiDuration;
		this.productName = productName;
	}


	public OrderDetails() {
		super();
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public long getPaidAmount() {
		return paidAmount;
	}


	public void setPaidAmount(long paidAmount) {
		this.paidAmount = paidAmount;
	}


	public int getEmiDuration() {
		return emiDuration;
	}


	public void setEmiDuration(int emiDuration) {
		this.emiDuration = emiDuration;
	}


	

	public OrderDetails(int orderId, Date orderDate, long paidAmount, int emiDuration) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.paidAmount = paidAmount;
		this.emiDuration = emiDuration;
		
	}

	
}
