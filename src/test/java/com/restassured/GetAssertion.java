package com.restassured;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAssertion {
	@Test
	void test_03() {
		Response res= RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}
}
