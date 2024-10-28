package com.sopra.pojo;

import java.util.List;

public class Class1 {
	
	//We will create payload for below payload

	//{
		//  "customerId": "748a166d-4742-45b7-bc7a-ffbe62856db8",
		  //"productId": {
		    //"productCode": "002",
		    //"typeCode": null,
		    //"classCode": null
		  //},
		  //"accountTypeParams": {
		    //"implementation": "CURRENT",
		    //"uuid": "ca02b1f4-b452-40a3-b631-16cfe80e6768"
		  //}
		//}
	
	public Class1(String customerId, ProductId productId,AccountTypeParams accountTypeParams) {
		this.customerId=customerId;
		this.productId=productId;
		this.accountTypeParams=accountTypeParams;
	}
	
	private String customerId;
	private ProductId productId;
	private AccountTypeParams accountTypeParams;
	
	public ProductId getProductId() {
		return productId;
	}

	public void setProductId(ProductId productId) {
		this.productId = productId;
	}

	public AccountTypeParams getAccountTypeParams() {
		return accountTypeParams;
	}

	public void setAccountTypeParams(AccountTypeParams accountTypeParams) {
		this.accountTypeParams = accountTypeParams;
	}


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
}
