package com.mcdermott;

public class VipCustomer {
	private String name;
	private int creditLimit;
	private String email;
	
	
	public VipCustomer(){
		this("Billy Bob", 9000, "Trex34@gmail.com");
	}
	
	public VipCustomer(String name, int creditLimit){
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = "default@yahoo.com";
	}
	public VipCustomer(String name, int creditLimit, String email){
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
	

}
