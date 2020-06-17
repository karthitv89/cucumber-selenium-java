/*
package com.karthik.cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginIntoAccount {
    private WebDriver driver;

    @Before
    public void loadDrivers() {
        System.setProperty("webdriver.chrome.driver", "D:\\Work\\cucumber\\cucumber\\src\\test\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @Given("User navigates to stackoverflow.com website")
    public void user_navigates_to_stackoverflow_com_website() {
        System.out.println("user_navigates_to_stackoverflow_com_website");
        this.driver.get("https://www.stackoverflow.com/");
    }

    @Given("User clicks on Login button")
    public void user_clicks_on_Login_button() {
        this.driver.findElement(By.xpath("//a[contains(text(), 'Log in')]")).click();
    }

    @Given("User enters a valid username")
    public void user_enters_a_valid_username() {
        this.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("karthigboy@gmail.com");

        System.out.println("user_enters_a_valid_username");
    }

    @Given("User enters a valid password")
    public void user_enters_a_valid_password() {
        this.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Singapore0");

    }

    @When("User clicks Login button")
    public void user_clicks_Login_button() {
        this.driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
        System.out.println("user_clicks_Login_button");
    }

    @Then("User enters stackoverflow.com website successfully.")
    public void user_enters_stackoverflow_com_website_successfully() throws InterruptedException {
        Thread.sleep(3000);
        WebElement askQstnButton = this.driver.findElement(By.xpath("//a[contains(text(), 'Ask Question')]"));
        Assert.assertTrue(askQstnButton.isDisplayed());

        System.out.println("user_enters_stackoverflow_com_website_successfully");
    }


    @Given("User navigates to stackoverflow.com website2")
    public void user_navigates_to_stackoverflow_com_website2() {
        System.out.println("user_navigates_to_stackoverflow_com_website2");
    }

    @Given("User clicks on Login button2")
    public void user_clicks_on_Login_button2() {
        System.out.println("user_navigates_to_stackoverflow_com_website2");

    }

    @Given("User enters a valid username2")
    public void user_enters_a_valid_username2() {
        System.out.println("user_navigates_to_stackoverflow_com_website2");

    }

    @Given("User enters a valid password2")
    public void user_enters_a_valid_password2() {
        System.out.println("user_navigates_to_stackoverflow_com_website2");

    }

    @When("User clicks Login button2")
    public void user_clicks_Login_button2() {
        System.out.println("user_navigates_to_stackoverflow_com_website2");

    }

    @Then("User enters stackoverflow.com website successfully2")
    public void user_enters_stackoverflow_com_website_successfully2() {
        System.out.println("user_navigates_to_stackoverflow_com_website2");

    }


    @AfterClass
    public void releaseResources() {
        driver.close();
        driver.quit();
    }
}
*/
