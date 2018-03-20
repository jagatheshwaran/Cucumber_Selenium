package com.jaga.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * 
 * @author Jagatheshwaran
 * @since 12/3/2018
 * @Modified-20/3/2018
 */

@CucumberOptions(features = { "classpath:featurefile/gcrApplication/SingInPage.feature" }, glue = {
		"classpath:com.jaga.cucumber.framework.stepdefinition.SignIn",
		"classpath:com.jaga.cucumber.framework.helper" }, plugin = { "pretty", "html:target/Cucumber/report",
"json:target/jsonReport/json/result.json" })
public class SignInPageRunner extends AbstractTestNGCucumberTests{


}
