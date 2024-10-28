package com.sopra.pojo1;

import java.util.List;

public class Class1 {

	//Here we will create payload for below payload
	
	//{
		//"customerId": "bcfcb5da-faa6-44ad-a5f0-86edb89d8729",
		  // "name": "Term Deposit Product",
		   //"comment": "This is a test",
		   //"contractIdentifiers": [{
		        //"id": "20",
		        //"idType": "BBAN"
		      //}],
		    //"nominations": [
		        //"Nominee"
		    //]  
	//}
	
	private String customerId;
	private String name;
	private String comment;
	private List<Nominations> nominations;
	private List<ContractIdentifiers> contractIdentifiers;
	
	public Class1(String customerId,String name,String comment,List<ContractIdentifiers> contractIdentifiers,List<Nominations> nominations) {
		this.customerId=customerId;
		this.name=name;
		this.comment=comment;
		this.nominations=nominations;
		this.contractIdentifiers=contractIdentifiers;
		
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public List<Nominations> getNominations() {
		return nominations;
	}
	public void setNominations(List<Nominations> nominations) {
		this.nominations = nominations;
	}
	public List<ContractIdentifiers> getContractIdentifiers() {
		return contractIdentifiers;
	}
	public void setContractIdentifiers(List<ContractIdentifiers> contractIdentifiers) {
		this.contractIdentifiers = contractIdentifiers;
	}
	
}
