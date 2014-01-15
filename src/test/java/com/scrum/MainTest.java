package com.scrum;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = { "src/test/resources" }, format = { "pretty",
		"html:target/reports/cucumber/html", "json:target/cucumber.json",
		"usage:target/usage.jsonx", "junit:target/junit.xml" }, tags = { "@done" })
public class MainTest {

	@BeforeClass
	public static void setUp() throws IOException {

		WebDriverSingleton.getInstance();
	}

	@AfterClass
	public static void tearDown() throws IOException {
		WebDriverSingleton.getInstance().quit();
	}

}
