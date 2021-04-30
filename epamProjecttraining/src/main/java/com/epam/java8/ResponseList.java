package com.epam.java8;

import java.util.ArrayList;
import java.util.List;

public class ResponseList {
	
	public static List<Response> getResponseList() {
		List<Response> responsesList = new ArrayList<>();
		responsesList.add(new Response("Body1", "JSON", 200));
		responsesList.add(new Response("Body2", "XML", 300));
		responsesList.add(new Response("Body3", "html", 400));
		responsesList.add(new Response("Body4", "JSON", 500));
		responsesList.add(new Response("Body5", "xml", 400));
		responsesList.add(new Response("Body6", "html", 200));
		responsesList.add(new Response("Body7", "JSON", 400));
		return responsesList;
	}

}
