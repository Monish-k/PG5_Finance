package com.lti.root.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int productId;
	
	String productName,productDetails;
	int productCost;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public ProductDetails(int productId, String productName, String productDetails, int productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDetails = productDetails;
		this.productCost = productCost;
	}
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
