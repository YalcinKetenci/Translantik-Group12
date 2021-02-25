package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.pages.VehicleOdometerPage;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US_020_TruckDriverCanSeeAllOdometerInformation {

    @When("the user navigates to {string} tab and {string} module")
    public void the_user_navigates_to_tab_and_module(String tab, String module) {
        new Dashboard().navigateToModule(tab, module);
        new Dashboard().waitUntilLoaderScreenDisappear();

    }

    @Then("the user able to see information on Vehicle Odometer")
    public void the_user_able_to_see_information_on_Vehicle_Odometer() {
        Assert.assertEquals(Driver.get().findElement(By.className("oro-subtitle")).getText(), "Vehicles Odometers");



    }
}

