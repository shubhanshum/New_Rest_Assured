package com.sopra.restassured;

import java.util.Map;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestTemplate {

	public void setRequest(String baseUri, String basePath, Map headers) {
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setBaseUri(baseUri);
		builder.setBasePath(basePath);
		builder.addHeaders(headers);
	}
	
	public RequestSpecBuilder setRequest(String baseUri, String basePath, Map headers,String queryParam,String queryParamValue) {
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setBaseUri(baseUri);
		builder.setBasePath(basePath);
		builder.addHeaders(headers);
		builder.addQueryParam(queryParam, queryParamValue);
		
		return builder;
	}
}
