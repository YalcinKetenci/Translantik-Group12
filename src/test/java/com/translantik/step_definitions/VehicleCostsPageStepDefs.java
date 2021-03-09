package com.translantik.step_definitions;

import com.translantik.pages.VehicleCostPage;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class VehicleCostsPageStepDefs {

    @When("the user clicks Create Vehicle Costs button")
    public void the_user_clicks_Create_Vehicle_Costs_button() {
        new VehicleCostPage().createVehicleCostsButton.click();
    }

    @Then("the user should be able to click Save And Close button")
    public void the_user_should_be_able_to_click_Save_And_Close_button() {
        new VehicleCostPage().saveAndCloseButton.click();
        Driver.get().findElement(By.xpath("//button[@type='submit']")).click();

    }
}
