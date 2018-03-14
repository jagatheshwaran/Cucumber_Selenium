package com.jaga.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * 
 * @author Jagatheshwaran
 * @since 12/3/2018
 *
 */

@CucumberOptions(features = { "classpath:featurefile/gcrApplication/SingInPage.feature" }, glue = {
		"classpath:com.jaga.cucumber.framework.stepdefinition.SignIn",
		"classpath:com.jaga.cucumber.framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class SignInPageRunner extends AbstractTestNGCucumberTests{


}
