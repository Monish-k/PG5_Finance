package com.lti.root.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int productid;
	
	String productname,productdetails;
	int productcost;
	public int getProductid() {
		return productid;
	}
	public ProductDetails(int productid, String productname, String productdetails, int productcost) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productdetails = productdetails;
		this.productcost = productcost;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdetails() {
		return productdetails;
	}
	public void setProductdetails(String productdetails) {
		this.productdetails = productdetails;
	}
	public int getProductcost() {
		return productcost;
	}
	public void setProductcost(int productcost) {
		this.productcost = productcost;
	}
	public ProductDetails(String productname, String productdetails, int productcost) {
		super();
		this.productname = productname;
		this.productdetails = productdetails;
		this.productcost = productcost;
	}
	@Override
	public String toString() {
		return "ProductDetails [productid=" + productid + ", productname=" + productname + ", productdetails="
				+ productdetails + ", productcost=" + productcost + "]";
	}
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
