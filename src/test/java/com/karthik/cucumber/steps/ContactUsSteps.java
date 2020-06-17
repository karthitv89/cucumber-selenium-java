package com.karthik.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ContactUsSteps {

    protected WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Work\\cucumber\\cucumber\\src\\test\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @When("I click on the Contact us button")
    public void i_click_on_the_Contact_us_button() throws InterruptedException {
        driver.findElement(By.id("contact-us")).click();
    }

    @When("I enter first name")
    public void i_enter_first_name() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.name("first_name")).sendKeys("Karthik");
    }

    @When("I enter last name")
    public void i_enter_last_name() {
        driver.findElement(By.name("last_name")).sendKeys("Thamil");
    }

    @When("I enter email address")
    public void i_enter_email_address() {
        driver.findElement(By.name("email")).sendKeys("test@test.com");
    }

    @When("I enter comments")
    public void i_enter_comments(io.cucumber.datatable.DataTable dataTable) {

        List<List<String>> commentsTable = dataTable.asLists();
        driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(commentsTable.get(0).get(0).concat("\n\n"));
        driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(commentsTable.get(0).get(1).concat("\n\n"));
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        driver.findElement(By.cssSelector("input[value='SUBMIT']")).click();
    }

    @Then("The information should be submitted successfully submitted by the contact us form")
    public void the_information_should_be_submitted_successfully_submitted_by_the_contact_us_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void release() throws InterruptedException {
        Thread.sleep(20000);
        this.driver.quit();
    }


}
