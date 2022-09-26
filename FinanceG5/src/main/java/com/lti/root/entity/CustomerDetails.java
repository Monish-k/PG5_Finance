package com.lti.root.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//import org.springframework.beans.factory.annotation.Autowired;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;

@Entity
public final class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int customer_id;
	String customer_name,customer_email,customer_password, customer_address,card_type,bank_name,ifsc_code;
	Date customer_dob;
	long customer_accno;
	
	@OneToOne(targetEntity = CardDetails.class, cascade = CascadeType.ALL)
	CardDetails cardDetails;
	
	@OneToMany(targetEntity = OrderDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	List<OrderDetails> customer_order_list;
	
	public CardDetails getCustomer_card() {
		return cardDetails;
	}
	public void setCustomer_card(CardDetails cardDetails) {
		this.cardDetails = cardDetails;
	}
	
	@Override
	public String toString() {
		return "CustomerDetails [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_email="
				+ customer_email + ", customer_password=" + customer_password + ", customer_address=" + customer_address
				+ ", card_type=" + card_type + ", bank_name=" + bank_name + ", ifsc_code=" + ifsc_code
				+ ", customer_dob=" + customer_dob + ", customer_accno=" + customer_accno + ", customer_card="
				+ cardDetails + "]";
	}

	public List<OrderDetails> getCustomer_order_list() {
		return customer_order_list;
	}
	public void setCustomer_order_list(List<OrderDetails> customer_order_list) {
		this.customer_order_list = customer_order_list;
	}
	
	public CustomerDetails(int customer_id, String customer_name, String customer_email, String customer_password,
			String customer_address, String card_type, String bank_name, String ifsc_code, Date customer_dob,
			long customer_accno, CardDetails cardDetails, List<OrderDetails> customer_order_list) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_email = customer_email;
		this.customer_password = customer_password;
		this.customer_address = customer_address;
		this.card_type = card_type;
		this.bank_name = bank_name;
		this.ifsc_code = ifsc_code;
		this.customer_dob = customer_dob;
		this.customer_accno = customer_accno;
		this.cardDetails = cardDetails;
		this.customer_order_list = customer_order_list;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public CustomerDetails() {
		super();
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public Date getCustomer_dob() {
		return customer_dob;
	}
	public void setCustomer_dob(Date customer_dob) {
		this.customer_dob = customer_dob;
	}
	public long getCustomer_accno() {
		return customer_accno;
	}
	public void setCustomer_accno(long customer_accno) {
		this.customer_accno = customer_accno;
	}
	
}
