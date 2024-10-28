package com.sopra.pojo1;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalPayload {

	public static void main(String[] args) throws JsonProcessingException {
		ContractIdentifiers ci=new ContractIdentifiers("20","BBAN");
		ArrayList<ContractIdentifiers> arr1=new ArrayList<>();
		arr1.add(ci);
		Nominations n=new Nominations("Nominee");
		ArrayList<Nominations> arr2=new ArrayList<>();
		arr2.add(n);
		
		
		Class1 body=new Class1("bcfcb5da-faa6-44ad-a5f0-86edb89d8729","Term Deposit Product",
				"This is a test",arr1,arr2);
		
		ObjectMapper mapper=new ObjectMapper();
		String payload=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(body);
		System.out.println(payload);
	}

}
