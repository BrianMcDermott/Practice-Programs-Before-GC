package com.mcdermott;

public class Bank {
	private int account;
	private double balance;
	private int phoneNum;
	private String customerName;
	private String email;
	
	public Bank(){
		this(12345, 555.55, 8675309, "John Doe", "anony@mous.com");
		System.out.println("Empty constructor called.");
	}
	
	
	


	public Bank(int account, double balance, int phoneNum, String customerName, String email) {
		System.out.println("Bank constructor WITH parameters called");
		this.account = account;
		this.balance = balance;
		this.phoneNum = phoneNum;
		this.customerName = customerName;
		this.email = email;
	}
	public Bank(int phoneNum, String customerName, String email) {
		this(99999, 222.22, phoneNum, customerName, email);
	}
	
	public void deposit (double depositAmount){
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}
	
	public void withdrawal(double withdrawalAmount){
		if(this.balance - withdrawalAmount <0) {
			System.out.println("Only " + this.balance + " available, withdrawal not processed");
		} else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balannce = " + this.balance);
		}
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
