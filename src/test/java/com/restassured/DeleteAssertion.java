package com.restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteAssertion {
	@Test
	void test_04() {
		Response delete=RestAssured.delete("http://dummy.restapiexample.com/public/api/v1/delete/2");
		int statusCode = delete.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

}


