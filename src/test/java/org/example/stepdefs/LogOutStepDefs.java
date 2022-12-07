package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutStepDefs extends AbstractStepDefs{

    @And("the Menu button is clicked")
    public void theMenuButtonIsClicked() {
        homePage.clickMenuButton();
    }

    @When("the Log out button is clicked")
    public void theLogOutButtonIsClicked() {
        homePage.clickLogOutButton();
    }

    @Then("the Log out should be successful")
    public void theLogOutShouldBeSuccessful() throws InterruptedException {
        boolean flag = true;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
            flag = true;
        } catch (TimeoutException exception) {
            flag = false;
        }
        Assert.assertEquals(true, flag);
    }

}
