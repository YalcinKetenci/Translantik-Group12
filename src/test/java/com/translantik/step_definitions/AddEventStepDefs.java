package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.pages.VehicleCostPage;
import com.translantik.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static org.junit.Assert.*;

public class AddEventStepDefs {

    VehicleCostPage vehicleCostPage=new VehicleCostPage();

    @When("the user clicks Item {int}")
    public void the_user_clicks_Item(int itemNo) {
        BrowserUtils.waitForClickablility(vehicleCostPage.itemNumber(itemNo),5);
        vehicleCostPage.itemNumber(itemNo).click();
    }

    @Then("the user verifies that information page for {string} is opened")
    public void the_user_verifies_that_information_page_for_is_opened(String itemNo) {
        assertEquals(itemNo,vehicleCostPage.itemPage.getText());
    }

    @When("the user clicks Add Event button")
    public void the_user_clicks_Add_Event_button() {
        BrowserUtils.waitFor(3);
        vehicleCostPage.addEventButton.click();
    }

    @Then("the user verifies that {string} page is opened")
    public void the_user_verifies_that_Add_Event_page_is_opened(String addEvent) {
        BrowserUtils.waitForVisibility(vehicleCostPage.addEventPage,3);
        assertEquals(addEvent,vehicleCostPage.addEventPage.getText());
    }

    @When("the user inserts {string} to Title input box")
    public void the_user_inserts_to_Title_input_box(String text) {
        vehicleCostPage.titleInputBox.sendKeys(text);
    }

    @When("the user clicks Save button")
    public void the_user_clicks_Save_button() {
        vehicleCostPage.saveButton.click();
    }

    @Then("the user verifies that {string} message is appeared on the page")
    public void the_user_verifies_that_message_is_appeared_on_the_page(String message) {
        assertEquals(vehicleCostPage.savedMessage.getText(),message);
    }

    @Then("the user verifies that event can be seen under Activity tab with title {string}")
    public void the_user_verifies_that_event_can_be_seen_under_Activity_tab(String text) {
        assertTrue(vehicleCostPage.verifyWithTitle(text).isDisplayed());
    }

    @Then("the user verifies that {string} tab is active")
    public void the_user_verifies_that_tab_is_active(String tabName) {

        assertEquals(tabName,vehicleCostPage.active.getText());
    }

    @When("the user clicks {string} tab")
    public void the_user_clicks_tab(String tabName) {
        vehicleCostPage.tabName(tabName).click();
    }

    @Then("the user gets {string} under Title input box")
    public void the_user_gets_under_Title_input_box(String message) {
        assertEquals(message,vehicleCostPage.validationFailed.getText());
    }

    @When("the user inserts {string} into Organizer email input box")
    public void the_user_inserts_into_Organizer_email_input_box(String input) {
        vehicleCostPage.organizerEmailBox.sendKeys(input);
        vehicleCostPage.displayName.click();
    }

    @Then("the user gets {string} under Organizer email input box")
    public void the_user_gets_under_Organizer_email_input_box(String message) {
        assertEquals(message,vehicleCostPage.validationFailed.getText());
    }

}
