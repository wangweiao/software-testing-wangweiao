package org.example.stepdefs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.FormPage;
import org.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractStepDefs {

    private static final int WAIT_TIME = 10;

    static WebDriver driver;

    protected static HomePage homePage;

    protected static FormPage formPage;

    static {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        formPage = new FormPage(driver);

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
//        homePage = new HomePage(driver);
    }

}
