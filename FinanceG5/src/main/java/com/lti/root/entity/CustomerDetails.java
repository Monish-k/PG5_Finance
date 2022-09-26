package com.lti.root.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	int customerId;
	String customerName,customerEmail,customerPassword, customerAddress,cardType,bankName,ifscCode;
	Date customerDob;
	long customerAccno;
	
	@OneToOne(targetEntity = CardDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private CardDetails cardDetails;
	
	@OneToMany(targetEntity = OrderDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customerId")
	private List<OrderDetails> customerOrderList;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public Date getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}
	public long getCustomerAccno() {
		return customerAccno;
	}
	public void setCustomerAccno(long customerAccno) {
		this.customerAccno = customerAccno;
	}
	public CardDetails getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(CardDetails cardDetails) {
		this.cardDetails = cardDetails;
	}
	public List<OrderDetails> getCustomerOrderList() {
		return customerOrderList;
	}
	public void setCustomerOrderList(List<OrderDetails> customerOrderList) {
		this.customerOrderList = customerOrderList;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPassword=" + customerPassword + ", customerAddress=" + customerAddress
				+ ", cardType=" + cardType + ", bankName=" + bankName + ", ifscCode=" + ifscCode + ", customerDob="
				+ customerDob + ", customerAccno=" + customerAccno + ", cardDetails=" + cardDetails
				+ ", customerOrderList=" + customerOrderList + "]";
	}
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
}
