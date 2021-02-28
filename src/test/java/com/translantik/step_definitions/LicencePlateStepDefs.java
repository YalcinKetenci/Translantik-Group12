package com.translantik.step_definitions;

import com.translantik.pages.VehicleInformationPage;
import com.translantik.pages.VehicleOdometerPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LicencePlateStepDefs {

    VehicleOdometerPage vehicleOdometerPage=new VehicleOdometerPage();

    @When("User clicks {string} CVO button")
    public void user_clicks_CVO_button(String button) {
        vehicleOdometerPage.clickTheButton(button);
    }

    @Then("User verifies that Create Vehicle Odometer page opened")
    public void user_verifies_that_page_opened() {
        Assert.assertEquals("Create Vehicle Odometer",Driver.get().findElement(By.cssSelector(".user-name")).getText());
    }

    @When("User clicks Save And Close button")
    public void user_clicks_Save_And_Close_button() {
        BrowserUtils.waitFor(5);
        new VehicleInformationPage().saveAndClose.click();
    }

    @Then("User verifies that Entity Saved message can be seen on page")
    public void userVerifiesThatEntitySavedMessageCanBeSeenOnPage() {
        WebElement entitySaved= Driver.get().findElement(By.cssSelector(".alert.alert-success.fade.top-messages"));
        Assert.assertTrue(entitySaved.isEnabled());
    }

    @When("User clicks {string} cncl button")
    public void user_clicks_cncl_button(String cancel) {
        new VehicleOdometerPage().clickTheButton(cancel);
    }

    @When("User inserts {string} to Odometer Value inbox")
    public void user_inserts_to_Odometer_Value_inbox(String insertChar) {
        BrowserUtils.waitForVisibility(vehicleOdometerPage.odometerValue,10);
        vehicleOdometerPage.odometerValue.sendKeys(insertChar);
    }

    @Then("User gets {string} message for Odometer Value")
    public void user_gets_message_for_Odometer_Value(String valueNotValid) {
        Assert.assertEquals(valueNotValid,Driver.get().findElement(By.cssSelector(".validation-failed")).getText());
        vehicleOdometerPage.odometerValue.clear();
    }

    @When("User inserts {string} to Date inbox")
    public void user_inserts_to_Date_inbox(String dateInbox) {
        vehicleOdometerPage.dateInput.sendKeys(dateInbox);
    }

    @Then("User gets {string} message for Date")
    public void user_gets_message_for_Date(String dateNotValid) {
        Assert.assertEquals(dateNotValid,Driver.get().findElement(By.cssSelector(".validation-failed")).getText());
    }

    @When("User clicks +Add button on the same line of License Plate")
    public void user_clicks_Add_button_on_the_same_line_of_License_Plate() {
        vehicleOdometerPage.addButton.click();
    }

    @Then("User verifies that a new window titled {string} opened")
    public void user_verifies_that_a_new_window_titled_opened(String carReservation) {
        BrowserUtils.waitForVisibility(vehicleOdometerPage.selectCarreserv,10);
        Assert.assertEquals(carReservation,vehicleOdometerPage.selectCarreserv.getText());
    }

    @When("User clicks checkbox of {string}")
    public void user_clicks_checkbox_of(String plate) {

      Driver.get().findElement(By.xpath("//td[contains(text(),'123456')]/preceding-sibling::td/input[@type='checkbox']")).click();
    }

    @When("User clicks Select button")
    public void user_clicks_Select_button() {
        Driver.get().findElement(By.cssSelector(".btn.btn-primary")).click();
    }

    @Then("User verifies that selected {string} can be seen on Create Vehicle Odometer page")
    public void user_verifies_that_selected_can_be_seen_on_Create_Vehicle_Odometer_page(String plate) {
        Assert.assertEquals(plate,Driver.get().findElement(By.cssSelector(".extra-info")).getText());
    }

    @Then("User verifies that selected licence plate {string} can be seen on General Information page")
    public void user_verifies_that_selected_licence_plate_can_be_seen_on_General_Information_page(String plate) {
        Assert.assertEquals(plate,Driver.get().findElement(By.cssSelector("a[title='"+plate+"']")).getText());
    }


}
