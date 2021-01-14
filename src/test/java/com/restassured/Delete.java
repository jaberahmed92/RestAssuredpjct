package com.restassured;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete {
	@Test
	void test_02() {
		Response delete=RestAssured.delete("http://dummy.restapiexample.com/public/api/v1/delete/2");
		System.out.println(delete.getStatusCode());
	}

}
