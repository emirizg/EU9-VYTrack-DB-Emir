package com.vytrack.step_definition;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsStepDefinitions {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = null;
        String password = null;


    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String string, String string2) {

    }
    @Then("the title contains {string}")
    public void the_title_contains(String string) {

    }

}
