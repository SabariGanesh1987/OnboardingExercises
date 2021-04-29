package com.epam.training;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RestAssuredExamples {

	@Test
	public void postExample() {
		JSONObject request = new JSONObject();
		request.put("name", "chaya");
		request.put("job", "BA");
		System.out.println(request.toString());

		Response res=  given().body(request.toJSONString()).when().post("https://reqres.in/api/users");
		System.out.println("Response Code:::"+res.getStatusCode());
		System.out.println("Response Body:::"+res.getBody().asString());

	}

	@Test(enabled = false)
	public void getExcample() {
			given()
				.get("https://reqres.in/api/users?page=2")
				.then().statusCode(200).body("data.id[0]", equalTo(7));

	}

}
