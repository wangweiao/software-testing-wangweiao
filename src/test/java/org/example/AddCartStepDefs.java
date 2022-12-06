package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddCartStepDefs extends AbstractStepDefs {
    @Given("the homepage is open")
    public void theHomepageIsOpen() {
        homePage.openPage();
    }

    @And("the Username is filled with {string}")
    public void theUsernameIsFilledWithStandard_user(String username) {
        homePage.fillField(HomePage.USERNAME, username);
    }

    @And("the Password is filled with {string}")
    public void thePasswordIsFilledWithSecret_sauce(String password) {
        homePage.fillField(HomePage.PASSWORD, password);
    }

    @Given("the Sauce Labs Backpack is added to the cart")
    public void theSauceLabsBackpackIsAddedToTheCart() {
        homePage.clickBackPackToCart();
    }

    @Then("{string} should be shown on the cart icon")
    public void shouldBeShownOnTheCartIcon(String number) {
        Assert.assertEquals(number, homePage.getCartNumber());
    }
}
