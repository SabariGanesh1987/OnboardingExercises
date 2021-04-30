package com.epam.java8;

import java.util.List;
import java.util.stream.Collectors;

public class ResponsesJSONAnd400_Q8 extends ResponseList {

	public static void main(String[] args) {

		List<Response> responses = 
		getResponseList().stream()
		.filter(a -> a.getResponsetype().equalsIgnoreCase("json")&&a.getStatusCode()==400)
		.collect(Collectors.toList());
		System.out.println(responses.toString());

	}

}
