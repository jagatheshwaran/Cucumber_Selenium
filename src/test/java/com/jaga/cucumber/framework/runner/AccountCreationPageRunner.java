package com.jaga.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * 
 * @author Jagatheshwaran
 * @since 13/3/2018
 * @Modified 20/3/2018
 */

@CucumberOptions(features = { "classpath:featurefile/gcrApplication/AccountRegistrationPage.feature" }, glue = {
		"classpath:com.jaga.cucumber.framework.stepdefinition.AccountCreation",
		"classpath:com.jaga.cucumber.framework.helper" }, plugin = { "pretty", "html:target/Cucumber/report",
"json:target/jsonReport/json/result.json" })
public class AccountCreationPageRunner extends AbstractTestNGCucumberTests{

}
