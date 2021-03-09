package com.translantik.step_definitions;

import com.translantik.pages.LoginPage;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("The user on the login page")
    public void the_user_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        new LoginPage().loginAsATruckDriver();
    }

    @When("The user enters valid credentials for sales manager")
    public void the_user_enters_valid_credentials_for_sales_manager() {
        new LoginPage().loginAsASalesManager();
    }

    @When("The user enters valid credentials for store manager")
    public void the_user_enters_valid_credentials_for_store_manager() {
        new LoginPage().loginAsAStoreManager();
    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        String currentTitle = "Login";
        String actualTitle = Driver.get().getTitle();
        Assert.assertNotEquals(currentTitle,actualTitle);
    }


}
