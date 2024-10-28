package com.sopra.pojo;

public class AccountTypeParams {

	//This class is used to implement everything for accountTypeParams child objects
	
	private String implementation;
	private String uuid;
	
	public AccountTypeParams(String implementation,String uuid) {
		this.implementation=implementation;
		this.uuid=uuid;
	}
	
	public String getImplementation() {
		return implementation;
	}
	public void setImplementation(String implementation) {
		this.implementation = implementation;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}
