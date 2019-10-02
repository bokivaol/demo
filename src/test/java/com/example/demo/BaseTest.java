package com.example.demo;

import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.mapper.ObjectMapperType;
import org.junit.BeforeClass;

/**
 * Created by @Bojan Jovic on Oct, 2019
 */
public class BaseTest {

	@BeforeClass
	public static void setup() {
//		Needed not to check SSL cert
		RestAssured.useRelaxedHTTPSValidation();
//		GSON over Jackson
		RestAssured.given().config(RestAssuredConfig.config().objectMapperConfig(new ObjectMapperConfig(ObjectMapperType.GSON)));

		RestAssured.baseURI = "http://localhost:8085";
	}

}
