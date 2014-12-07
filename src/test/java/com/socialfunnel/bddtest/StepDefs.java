package com.socialfunnel.bddtest;

import cucumber.api.PendingException;
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
		script.clickRegister();
	}

	@When("^I enter my \"(.*?)\" in the field \"(.*?)\"$")
	public void i_enter_my_in_the_field(String arg1, String arg2) throws Throwable {
		script.enterpassword();
	}

	@When("^I repeat my \"(.*?)\" in the field \"(.*?)\"$")
	public void i_repeat_my_in_the_field(String arg1, String arg2) throws Throwable {
		script.enterpassword2();
	}

	@When("^I accept the \"(.*?)\" by checking the checkbox$")
	public void i_accept_the_by_checking_the_checkbox(String arg1) throws Throwable {
		script.checkbox();
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
	
	@Given("^I am not logged in$")
	public void i_am_not_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^both are stored in the ldap-system$")
	public void both_are_stored_in_the_ldap_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^my \"(.*?)\" will be loaded$")
	public void my_will_be_loaded(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I am still on the Page$")
	public void i_am_still_on_the_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I have an existing and active network account$")
	public void i_have_an_existing_and_active_network_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I choose the \"(.*?)\"$")
	public void i_choose_the(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I check the \"(.*?)\" checkbox$")
	public void i_check_the_checkbox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the Network will be tested for validity$")
	public void the_Network_will_be_tested_for_validity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^added to my networks list$")
	public void added_to_my_networks_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I receive an error message that the network could not be connected$")
	public void i_receive_an_error_message_that_the_network_could_not_be_connected() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I search for pillows$")
	public void i_search_for_pillows() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the page title is as expected$")
	public void the_page_title_is_as_expected() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}