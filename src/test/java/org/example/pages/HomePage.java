package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Optional;

public class HomePage {

    private static final String PAGE_URL = "https://www.saucedemo.com/";

    public static final By USERNAME = By.id("user-name");

    public static final By PASSWORD = By.id("password");

    public static final By FIRSTNAME = By.id("first-name");

    public static final By LASTNAME = By.id("last-name");

    public static final By POSTAL_CODE = By.id("postal-code");

    private static final By LOGIN_ERROR = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");

    private static final By CONTACT_ERROR = By.cssSelector("#center_column > div > ol > li");

    @FindBy(className = "shopping_cart_badge")
    private WebElement cartNumberLabel;

    @FindBy(className = "inventory_item_price")
    private WebElement priceLabel;

    @FindBy(className = "login")
    private WebElement loginLink;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logOutButton;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartButton;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addBackpackToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addBikeLightToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement addTShirtToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addJacketToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement addOnesieToCartButton;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement addRedTShirtToCartButton;

    @FindBy(id = "contact-link")
    private WebElement contactUsLink;

    @FindBy(id = "inventory_sidebar_link")
    private WebElement allItemsLink;

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public void clickAllItemsLink() {
        allItemsLink.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickBackPackToCart() {
        addBackpackToCartButton.click();
    }

    public void clickBikeLightToCart() {
        addBikeLightToCartButton.click();
    }

    public void clickTShirtToCart() {
        addTShirtToCartButton.click();
    }

    public void clickJacketToCart() {
        addJacketToCartButton.click();
    }

    public void clickOnesieToCart() {
        addOnesieToCartButton.click();
    }

    public void clickRedTShirtToCart() {
        addRedTShirtToCartButton.click();
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public void clickLogOutButton() {
        logOutButton.click();
    }

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getSignInLink() {
        return loginLink;
    }

    public WebElement getSignInButton() {
        return loginButton;
    }

    public WebElement getContactUsLink() {
        return contactUsLink;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    public String getCartNumber() {
        return cartNumberLabel.getText();
    }

    public String getPrice() {
        return priceLabel.getText();
    }

    private Optional<WebElement> getError(By errorLocator) {
        List<WebElement> elements = driver.findElements(errorLocator);
        if (elements.size() > 0) {
            return Optional.of(elements.get(0));
        } else {
            return Optional.empty();
        }
    }
}
