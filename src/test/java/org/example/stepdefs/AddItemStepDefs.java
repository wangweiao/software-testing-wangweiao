package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.junit.Assert;

public class AddItemStepDefs extends AbstractStepDefs {
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

    @Given("the Sauce Labs Bike Light is added to the cart")
    public void theSauceLabsBikeLightIsAddedToTheCart() {
        homePage.clickBikeLightToCart();
    }

    @Given("the Sauce Labs T-Shirt is added to the cart")
    public void theSauceLabsTShirtIsAddedToTheCart() {
        homePage.clickTShirtToCart();
    }

    @Given("the Sauce Labs Jacket is added to the cart")
    public void theSauceLabsJacketIsAddedToTheCart() {
        homePage.clickJacketToCart();
    }

    @Given("the Sauce Labs Onesie is added to the cart")
    public void theSauceLabsOnesieIsAddedToTheCart() {
        homePage.clickOnesieToCart();
    }

    @Given("the Sauce Labs Red T-Shirt is added to the cart")
    public void theSauceLabsRedTShirtIsAddedToTheCart() {
        homePage.clickRedTShirtToCart();
    }
}
