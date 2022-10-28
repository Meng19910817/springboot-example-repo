package com.example.demo.model;

public class Customer {

	private int accountno;
	private String customername;
	private String customertype;
	private double balance;
	
	
	public Customer(int accountno, String customername, String customertype, double balance) {
		super();
		this.accountno = accountno;
		this.customername = customername;
		this.customertype = customertype;
		this.balance = balance;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomertype() {
		return customertype;
	}
	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
