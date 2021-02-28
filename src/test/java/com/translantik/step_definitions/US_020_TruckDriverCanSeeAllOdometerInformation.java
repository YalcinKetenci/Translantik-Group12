package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.pages.VehicleOdometerPage;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US_020_TruckDriverCanSeeAllOdometerInformation {



    @When("The user click {string} tab and {string}")
    public void theUserClickTabAnd(String arg0, String arg1) {
        new Dashboard().navigateToModule(arg0,arg1);
        new Dashboard().waitUntilLoaderScreenDisappear();
    }

    @Then("User should be able to see all information on page")
    public void userShouldBeAbleToSeeAllInformationOnPage() {
        Assert.assertEquals(Driver.get().findElement(By.className("oro-subtitle")).getText(), "Vehicles Odometers");
    }
}

