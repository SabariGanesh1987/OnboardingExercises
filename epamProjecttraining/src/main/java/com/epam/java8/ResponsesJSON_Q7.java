package com.epam.java8;

import java.util.List;
import java.util.stream.Collectors;

public class ResponsesJSON_Q7 extends ResponseList {

	public static void main(String[] args) {

		List<Response> responses = 
		getResponseList().stream().filter(a -> a.getResponsetype().equalsIgnoreCase("json")).collect(Collectors.toList());
		System.out.println(responses.toString());

	}

}
