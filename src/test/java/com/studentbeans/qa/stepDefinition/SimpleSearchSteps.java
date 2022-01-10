package com.studentbeans.qa.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSearchSteps {
    WebDriver driver;
    @Given("^I am on the studentbeans homepage$")
    public void iAmOnTheStudentbeansHomepage() {
        //define browser
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver= new ChromeDriver();
        //maximise browser
        driver.manage().window().maximize();
        //launch browser
        driver.get("https://www.studentbeans.com/uk");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @When("^I open the search bar$")
    public void iOpenTheSearchBar() {
        driver.findElement(By.cssSelector("#home_root > div:nth-child(1) > nav > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)")).click();
    }

    @And("^I enter \"([^\"]*)\"$")
    public void iEnter(String Samsung) {
        driver.findElement(By.cssSelector("#home_root > div:nth-child(1) > nav > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div > div > div > div:nth-child(1) > div:nth-child(1) > input")).sendKeys("Samsung");
    }

    @Then("^I should be shown a search listing for \"([^\"]*)\"$")
    public void iShouldBeShownASearchListingFor(String Samsung) {
        String expectedPageTitle = "Student Beans";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);

    }
}
