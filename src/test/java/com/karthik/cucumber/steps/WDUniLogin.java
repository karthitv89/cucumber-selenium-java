package com.karthik.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WDUniLogin {

    private WebDriver driver;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Work\\cucumber\\cucumber\\src\\test\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @Given("I can access webdriveruniversity")
    public void i_can_access_webdriveruniversity() {
       this.driver.get("http://www.webdriveruniversity.com");
    }


    @When("I click on the login portal button")
    public void i_click_on_the_login_portal_button() {
        this.driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1")).click();
    }
    @When("I enter valid username")
    public void i_enter_valid_username() {
        for (String winHandle : this.driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.id("text")).sendKeys("Tom");
    }
    //@When("I enter \"([^\"]*)\" password")
    @When("I enter {string} password")
    public void i_enter_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();

    }
    @Then("It should be presented successful validation message")
    public void it_should_be_presented_successful_validation_message() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        Assert.assertEquals("validation successful", alertMessage);
    }


    @Then("It should be presented error validation message")
    public void it_should_be_presented_error_validation_message() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        Assert.assertEquals("validation failed", alertMessage);
    }


    @After
    public void release() throws InterruptedException {
        Thread.sleep(20000);
        this.driver.quit();
    }
}
