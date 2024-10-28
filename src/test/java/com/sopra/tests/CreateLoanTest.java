package com.sopra.tests;

import java.io.File;

import org.testng.annotations.Test;

import com.sopra.restassured.RequestTemplate;
import com.sopra.utility.CommonHeaders;
import com.sopra.utility.ReadPropertiesFile;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateLoanTest {
	
	public static void main(String[] args) {
		File createLoanFile=new File(System.getProperty("user.dir")+"//Payloads//createLoan.json");
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setBaseUri(ReadPropertiesFile.getPropFileData("BaseURI"));
		builder.setBasePath(ReadPropertiesFile.getPropFileData("BasePath"));
		builder.addHeaders(CommonHeaders.getHeaders());
		builder.addQueryParam("customerId", "748a166d-4742-45b7-bc7a-ffbe62856db8");
		RequestSpecification request=builder.build();
		request.log().uri();
		
		
		
		Response response=RestAssured.given(request).body(createLoanFile).contentType(ContentType.JSON).post("loans");
		System.out.println(response.asPrettyString());
		
		System.out.println("partnerProductCode is: "+response.jsonPath().getString("productReferences.partnerProductCode"));
		//To get whole array
		System.out.println("payers array: "+response.jsonPath().getList("payers").get(0));
		
		System.out.println("payer accountId: "+response.jsonPath().getString("payers.accountId[0]"));
		
		System.out.println("Borrowsers name is "+response.jsonPath().getString("borrowers.name"));
		
		System.out.println("ID Type is "+response.jsonPath().getString("payers.externalAccount.account.idType"));
	}
		
	
	
	
}
