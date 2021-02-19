package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddAttachmentStepDefs {

    @When("User navigated to {string} tab {string} module")
    public void user_navigated_to_tab_module(String tab, String module) {
        new Dashboard().navigateToModule(tab, module);

    }
    @When("User clicks on any vehicle information")
    public void user_clicks_on_any_vehicle_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies that information page openned")
    public void user_verifies_that_information_page_openned() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on Add Attachment button on the right top corner of the page")
    public void user_clicks_on_Add_Attachment_button_on_the_right_top_corner_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies that Add Attachment popup windows openned")
    public void user_verifies_that_Add_Attachment_popup_windows_openned() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks to Choose File button on the popup window")
    public void user_clicks_to_Choose_File_button_on_the_popup_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User selects a file from computer")
    public void user_selects_a_file_from_computer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks to Save button on the popup window")
    public void user_clicks_to_Save_button_on_the_popup_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies that selected file is uploaded and can be seen under Attachments")
    public void user_verifies_that_selected_file_is_uploaded_and_can_be_seen_under_Attachments() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
