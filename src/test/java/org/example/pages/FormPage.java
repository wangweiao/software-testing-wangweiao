package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    public static final By NAME = By.id("et_pb_contact_name_0");

    public static final By MESSAGE = By.id("et_pb_contact_message_0");

    private static final String PAGE_URL = "https://ultimateqa.com/filling-out-forms/";

    private WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    @FindBy(id = "et_pb_contact_name_0")
    private WebElement name;

    @FindBy(id = "et_pb_contact_message_0")
    private WebElement message;

    @FindBy(className = "et_pb_contact_submit")
    private WebElement submitButton;

    @FindBy(className = "et-pb-contact-message")
    private WebElement responseLabel;

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getResponse() {
        return responseLabel.getText();
    }

}
