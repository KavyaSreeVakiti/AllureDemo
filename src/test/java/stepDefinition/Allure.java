package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Allure
{
    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        System.out.println("user is on registration page");
    }

    @When("user enters following details")
    public void user_enters_following_details(DataTable dataTable) {
        java.util.List<java.util.List<String>> userList = dataTable.asLists(String.class);
        for (java.util.List<String> e : userList) {
            System.out.println(e);
        }
    }

    @Then("user registration should be successful")
    public void user_registration_should_be_successful() {
        System.out.println("user registration should be successful and no errors");//changed by B
    }


}

