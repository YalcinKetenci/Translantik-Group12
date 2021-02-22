package com.translantik.step_definitions;

import com.translantik.pages.VehicleOdometerPage;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US_022_TruckDriverOdometerDeleteFunctionStepDefs {
    @When("User clicks on Delete Vehicle Odometer button on the right top corner of the page")
    public void user_clicks_on_Delete_Vehicle_Odometer_button_on_the_right_top_corner_of_the_page() {
        new VehicleOdometerPage().deleteButton.click();
    }

    @Then("User verifies that Delete Confirmation popup windows opened")
    public void user_verifies_that_Delete_Confirmation_popup_windows_opened() {
        Assert.assertEquals(Driver.get().findElement(By.cssSelector("div.modal-header h3")).getText(),"Delete Confirmation");
    }

    @When("User clicks to Yes, Delete button on the popup window")
    public void user_clicks_to_Yes_Delete_button_on_the_popup_window() {
        Driver.get().findElement(By.cssSelector("a.btn.ok.btn-danger")).click();
    }

//    @Then("User verifies that selected line is deleted and Vehicle Odometer Deleted message can be seen on top of the page")
//    public void user_verifies_that_selected_line_is_deleted_and_Vehicle_Odometer_Deleted_message_can_be_seen_on_top_of_the_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
