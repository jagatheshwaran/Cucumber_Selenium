package com.jaga.cucumber.framework.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/FaceBookLogin.feature" }, glue = {
		"classpath:com.jaga.cucumber.framework.stepdefinition",
		"classpath:com.jaga.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class FaceBookLoginRunner extends AbstractTestNGCucumberTests {

}
