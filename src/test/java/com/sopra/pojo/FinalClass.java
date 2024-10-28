package com.sopra.pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalClass {

	public static void main(String[] args) throws JsonProcessingException {
		ProductId cl2=new ProductId("002",null,null);
		AccountTypeParams cl3=new AccountTypeParams("CURRENT","ca02b1f4-b452-40a3-b631-16cfe80e6768");
		Class1 body=new Class1("748a166d-4742-45b7-bc7a-ffbe62856db8",cl2,cl3);
		
		ObjectMapper mapper=new ObjectMapper();
		String payload=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(body);
		System.out.println(payload);

	}

	

}
