package com.socialfunnel.bddtest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	private SeleniumTest script;

	public void setUpWebDriver() throws Exception {

		script = new SeleniumTest();

		script.setUp();

		script.goToHomePage();

	}

	public void tidyUp() {

		script.tearDown();

	}
	
	@Given("^I am not registered$")
	public void i_am_not_registered() throws Throwable {
	}

	@Given("^I am on the \"(.*?)\" page$")
	public void i_am_on_the_page(String arg1) throws Throwable {
		setUpWebDriver();
//		script.clickRegister();
	}

	@When("^I enter my \"(.*?)\" in the field \"(.*?)\"$")
	public void i_enter_my_in_the_field(String arg1, String arg2) throws Throwable {
	}

	@When("^I repeat my \"(.*?)\" in the field \"(.*?)\"$")
	public void i_repeat_my_in_the_field(String arg1, String arg2) throws Throwable {
	}

	@When("^I accept the \"(.*?)\" by checking the checkbox$")
	public void i_accept_the_by_checking_the_checkbox(String arg1) throws Throwable {
	}

	@When("^I press the \"(.*?)\" button$")
	public void i_press_the_button(String arg1) throws Throwable {
	}

	@Then("^my \"(.*?)\" will be created$")
	public void my_will_be_created(String arg1) throws Throwable {
	}

	@Then("^I will receive and email$")
	public void i_will_receive_and_email() throws Throwable {
	}

	@Then("^I will be logged into the website$")
	public void i_will_be_logged_into_the_website() throws Throwable {
	}

	@When("^one of them is wrong$")
	public void one_of_them_is_wrong() throws Throwable {
	}

	@Then("^I will receive and error message to check my input$")
	public void i_will_receive_and_error_message_to_check_my_input() throws Throwable {
	}
}
