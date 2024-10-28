package com.sopra.pojo;

public class ProductId {

	//This class is used to implement everything for productId child objects
	
	private String productCode;
	private String typeCode;
	private String classCode;
	
	public ProductId(String productCode,String typeCode,String classCode) {
		this.productCode=productCode;
		this.typeCode=typeCode;
		this.classCode=classCode;
	}
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
	
	
}
