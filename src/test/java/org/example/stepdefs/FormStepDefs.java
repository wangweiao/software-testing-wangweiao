package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FormStepDefs extends AbstractStepDefs {

    @Given("the form page is open")
    public void theFormPageIsOpen() {
        formPage.openPage();
    }

    @And("the Name is filled with {string}")
    public void theNameIsFilledWithName(String name) {
        formPage.fillField(formPage.NAME, name);
    }

    @And("the Message is filled with {string}")
    public void theMessageIsFilledWithMsg(String message) {
        formPage.fillField(formPage.MESSAGE, message);
    }

    @And("the Submit button is clicked")
    public void theSubmitButtonIsClicked() {
        formPage.clickSubmitButton();
    }

    @Then("the {string} should not appear")
    public void theFeedbackShouldNotAppear(String response) {
        Assert.assertNotEquals(response, formPage.getResponse());
    }
}
