package com.lti.root.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int product_id;
	
	@Override
	public String toString() {
		return "ProductDetails [product_id=" + product_id + ", product_name=" + product_name + ", product_details="
				+ product_details + ", product_cost=" + product_cost + "]";
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_details() {
		return product_details;
	}
	public void setProduct_details(String product_details) {
		this.product_details = product_details;
	}
	public int getProduct_cost() {
		return product_cost;
	}
	public void setProduct_cost(int product_cost) {
		this.product_cost = product_cost;
	}
	public ProductDetails() {
		super();
	}
	public ProductDetails(int product_id, String product_name, String product_details, int product_cost) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_details = product_details;
		this.product_cost = product_cost;
	}
	String product_name,product_details;
	int product_cost;
}
