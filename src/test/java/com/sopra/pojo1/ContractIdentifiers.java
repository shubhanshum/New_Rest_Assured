package com.sopra.pojo1;

public class ContractIdentifiers {

	private String id;
	private String idType;
	
	public ContractIdentifiers(String id,String idType) {
		this.id=id;
		this.idType=idType;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	
}
