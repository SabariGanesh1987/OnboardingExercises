package com.epam.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/epam/features",
		glue="com.epam.stepdefinitions",
		monochrome=true
		)
public class CartTestRunner {

}
