package com.lti.root.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public final class OrderDetails {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderid;
	
	@Override
	public String toString() {
		return "OrderDetails [orderid=" + orderid + ", orderdate=" + orderdate + ", productname=" + productname
				+ ", paidamount=" + paidamount + ", emiduration=" + emiduration + "]";
	}
	
	@Column(updatable = false)
	@CreationTimestamp
	Date orderdate;
	
	String productname;

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	long paidamount;
	
	public OrderDetails(int orderid, Date orderdate, ProductDetails productordered, long paidamount, int emiduration) {
		super();
		this.orderid = orderid;
		this.orderdate = orderdate;
		//this.productordered = productordered;
		this.paidamount = paidamount;
		this.emiduration = emiduration;
	}

	int emiduration;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

//	public ProductDetails getProductordered() {
//		return productordered;
//	}
//
//	public void setProductordered(ProductDetails productordered) {
//		this.productordered = productordered;
//	}

	public long getPaidamount() {
		return paidamount;
	}

	public void setPaidamount(long paidamount) {
		this.paidamount = paidamount;
	}

	public int getEmiduration() {
		return emiduration;
	}

	public void setEmiduration(int emiduration) {
		this.emiduration = emiduration;
	}

	public OrderDetails(Date orderdate, ProductDetails productordered, long paidamount, int emiduration) {
		super();
		this.orderdate = orderdate;
		//this.productordered = productordered;
		this.paidamount = paidamount;
		this.emiduration = emiduration;
	}

	public OrderDetails(Date orderdate, String productname, long paidamount, int emiduration) {
		super();
		this.orderdate = orderdate;
		this.productname = productname;
		this.paidamount = paidamount;
		this.emiduration = emiduration;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
