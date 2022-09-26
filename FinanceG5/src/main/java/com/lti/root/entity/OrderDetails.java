package com.lti.root.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public final class OrderDetails {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderId;
	
	Date orderDate;
	long paidAmount;
	
	int emiDuration;

	
	@OneToOne(targetEntity = ProductDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "productId", referencedColumnName = "productId")
	ProductDetails productOrdered;
	

	public OrderDetails() {
		super();
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


	public ProductDetails getProductOrdered() {
		return productOrdered;
	}


	public void setProductOrdered(ProductDetails productOrdered) {
		this.productOrdered = productOrdered;
	}


	public OrderDetails(int orderId, Date orderDate, long paidAmount, int emiDuration, ProductDetails productOrdered) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.paidAmount = paidAmount;
		this.emiDuration = emiDuration;
		this.productOrdered = productOrdered;
	}

	
}
