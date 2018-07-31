package com.accenture.cucumbertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//New code
public class StepDefinition {
	WebDriver d;
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\PNCB\\WorkSpace\\test1maven\\resources\\chromedriver.exe");
		  d=new ChromeDriver();
		  d.manage().window().maximize();
		  d.get("http://demowebshop.tricentis.com/register");
		System.out.println("Hello Given");
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I give tomsmith and SuperSecretPassword!$")
	public void i_give_tomsmith_and_SuperSecretPassword() throws Throwable {
		System.out.println("Hello When");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be login$")
	public void i_should_be_login() throws Throwable {
		System.out.println("Hello Then");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
