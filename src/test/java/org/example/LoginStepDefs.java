package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class LoginStepDefs extends AbstractStepDefs {

    @Given("the homepage is opened")
    public void theHomepageIsOpened() {
        homePage.openPage();
    }

    @Given("the Username is filled with {string} and Password is filled with {string}")
    public void theUsernameIsFilledWithUsernameAndPasswordIsFilledWithPassword(String username, String password) {
        homePage.fillField(HomePage.USERNAME, username);
        homePage.fillField(HomePage.PASSWORD, password);
    }

    @And("the Login button is clicked")
    public void theLoginButtonIsClicked() {
        homePage.clickLoginButton();
    }

    @Then("the Login should be successful")
    public void theLoginShouldBeSuccessful() {
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @Then("the Login should fail")
    public void theLoginShouldFail() {
        assertNotEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }
}
