package com.epam.java8;

import java.util.List;
import java.util.stream.Collectors;

public class ResponsesGreaterthan400_Q6 extends ResponseList {

	public static void main(String[] args) {

		List<Response> responses = 
		getResponseList().stream().filter(a -> a.getStatusCode() == 400).collect(Collectors.toList());
		System.out.println(responses.toString());

	}

}
