package com.translantik.step_definitions;

import com.translantik.pages.VehicleOdometerPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class US_022_TruckDriverOdometerDeleteFunctionStepDefs {

    @Then("User clicks on any car information")
    public void user_clicks_on_any_car_information() {
        new Actions(Driver.get()).moveToElement(Driver.get().findElement(By.xpath("//tr[@class='grid-row row-click-action'][2]/td[2]"))).perform();
        Driver.get().findElement(By.xpath("//tr[@class='grid-row row-click-action'][2]/td[2]")).click();
    }

    @Then("User verifies that vehicle information page opened")
    public void user_verifies_that_vehicle_information_page_opened() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getTitle().contains(Driver.get().findElement(By.cssSelector("h1.user-name")).getText()));
    }

    @Then("User clicks on Delete Vehicle Odometer button on the right top corner of the page")
    public void user_clicks_on_Delete_Vehicle_Odometer_button_on_the_right_top_corner_of_the_page() {
        new VehicleOdometerPage().deleteButton.click();
    }

    @Then("User verifies that Delete Confirmation popup windows opened")
    public void user_verifies_that_Delete_Confirmation_popup_windows_opened() {
        Assert.assertEquals(Driver.get().findElement(By.cssSelector("div.modal-header h3")).getText(), "Delete Confirmation");
    }

    @Then("User clicks to Yes, Delete button on the popup window")
    public void user_clicks_to_Yes_Delete_button_on_the_popup_window() {
        Driver.get().findElement(By.cssSelector("a.btn.ok.btn-danger")).click();
    }

    @Then("User clicks on Delete popup icon at the end of the each row")
    public void user_clicks_on_Delete_popup_icon_at_the_end_of_the_each_row() {
//        new Actions(Driver.get()).moveToElement(Driver.get().findElement(By.xpath("//tr[@class='string-cell grid-cell grid-body-cell grid-body-cell-Model']/td[7]"))).click().perform();
//        Driver.get().findElement(By.cssSelector("i.fa-trash-o.hide-text")).click();
        BrowserUtils.waitFor(5);
        new Actions(Driver.get()).moveToElement(Driver.get().findElement(By.cssSelector("td.action-cell.grid-cell.grid-body-cell"))).perform();
        Driver.get().findElement(By.cssSelector("i.fa-trash-o.hide-text")).click();
    }

    @Then("User verifies that selected line is deleted and Vehicle Odometer Deleted message can be seen on top of the page")
    public void user_verifies_that_selected_line_is_deleted_and_Vehicle_Odometer_Deleted_message_can_be_seen_on_top_of_the_page() {
        System.out.println("hello");
    }
}


