package com.lti.root.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;

//import org.springframework.beans.factory.annotation.Autowired;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;

@Entity
public final class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int customerid;
	String customername;
	
	@Column(unique = true)
	String customeremail;
	
	String customerpassword, customeraddress,cardtype,bankname,ifsccode;
	public CustomerDetails(String customername, String customeremail, String customerpassword) {
		super();
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerpassword = customerpassword;
	}

	Date customerdob;
	
	@Column(unique = true)
	long customeraccno;
	
	@OneToOne(targetEntity = CardDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	CardDetails carddetails;
	
	@OneToMany(targetEntity = OrderDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customerfk", referencedColumnName = "customerid")
	List<OrderDetails> customerorderlist;


	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerid=" + customerid + ", customername=" + customername + ", customeremail="
				+ customeremail + ", customerpassword=" + customerpassword + ", customeraddress=" + customeraddress
				+ ", cardtype=" + cardtype + ", bankname=" + bankname + ", ifsccode=" + ifsccode + ", customerdob="
				+ customerdob + ", customeraccno=" + customeraccno + ", carddetails=" + carddetails
				+ ", customerorderlist=" + customerorderlist + "]";
	}

	public CustomerDetails(String customername, String customeremail, String customerpassword, String customeraddress,
			String cardtype, String bankname, String ifsccode, Date customerdob, long customeraccno,
			CardDetails carddetails, List<OrderDetails> customerorderlist) {
		super();
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerpassword = customerpassword;
		this.customeraddress = customeraddress;
		this.cardtype = cardtype;
		this.bankname = bankname;
		this.ifsccode = ifsccode;
		this.customerdob = customerdob;
		this.customeraccno = customeraccno;
		this.carddetails = carddetails;
		this.customerorderlist = customerorderlist;
	}

	public CustomerDetails(int customerid, String customername, String customeremail, String customerpassword,
			String customeraddress, String cardtype, String bankname, String ifsccode, Date customerdob,
			long customeraccno, CardDetails carddetails, List<OrderDetails> customerorderlist) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerpassword = customerpassword;
		this.customeraddress = customeraddress;
		this.cardtype = cardtype;
		this.bankname = bankname;
		this.ifsccode = ifsccode;
		this.customerdob = customerdob;
		this.customeraccno = customeraccno;
		this.carddetails = carddetails;
		this.customerorderlist = customerorderlist;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getCustomerpassword() {
		return customerpassword;
	}

	public void setCustomerpassword(String customerpassword) {
		this.customerpassword = customerpassword;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public Date getCustomerdob() {
		return customerdob;
	}

	public void setCustomerdob(Date customerdob) {
		this.customerdob = customerdob;
	}

	public long getCustomeraccno() {
		return customeraccno;
	}

	public void setCustomeraccno(long customeraccno) {
		this.customeraccno = customeraccno;
	}

	public CardDetails getCarddetails() {
		return carddetails;
	}

	public void setCarddetails(CardDetails carddetails) {
		this.carddetails = carddetails;
	}

	public List<OrderDetails> getCustomerorderlist() {
		return customerorderlist;
	}

	public void setCustomerorderlist(List<OrderDetails> customerorderlist) {
		this.customerorderlist = customerorderlist;
	}
	
		
}
