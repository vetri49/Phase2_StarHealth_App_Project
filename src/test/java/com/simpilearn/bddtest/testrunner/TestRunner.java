package com.simpilearn.bddtest.testrunner;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/starhealth.feature", 
	glue = "com/simplilearn/bddtest/stepdefinitions",
	plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
public class TestRunner {

}
