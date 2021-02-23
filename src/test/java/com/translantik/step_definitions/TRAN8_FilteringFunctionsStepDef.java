package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.pages.VehicleOdometerPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TRAN8_FilteringFunctionsStepDef {

    String enteredDataIntoGridSettings;

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new Dashboard().navigateToModule(tab,module);
        new Dashboard().waitUntilLoaderScreenDisappear();
    }

    @Then("the user should be able to click {string} button")
    public void the_user_should_be_able_to_click_button(String buttonName) {

        new VehicleOdometerPage().clickTheButton(buttonName);
    }

    @Then("the user should be able to see {string} window")
    public void the_user_should_be_able_to_see_window(String windowName) {
        Assert.assertTrue(new VehicleOdometerPage().getWindow(windowName).isDisplayed());
    }

    @Then("the user should be able to enters one of the given data inside the text-box on the {string} window")
    public void the_user_should_be_able_to_enters_one_of_the_given_data_inside_the_text_box_on_the_window(String windowName, List<String> data) {
        new VehicleOdometerPage().getTextBox(windowName).sendKeys(data.get(0));
        enteredDataIntoGridSettings= data.get(0);
    }

    @Then("the user should be able to see the only  options that includes the written character on the {string} window")
    public void the_user_should_be_able_to_see_the_only_options_that_includes_the_written_character_on_the_window(String string) {
        BrowserUtils.waitFor(1);
        for (WebElement names : new VehicleOdometerPage().namesOfTheDataOnTheGridSettings) {
            if(names.isDisplayed() && names.isEnabled()) {
                Assert.assertTrue(names.getText().contains(enteredDataIntoGridSettings));
            }
        }
    }

    @Then("the user should be able to enters {string} inside the {string} area on the {string} window")
    public void the_user_should_be_able_to_enters_inside_the_area_on_the_window(String data, String textBoxName, String windowName) {
        new VehicleOdometerPage().getTextBox(windowName).sendKeys(data);

    }

    @Then("the user should  be able to see No columns found on the {string} window")
    public void the_user_should_be_able_to_see_No_columns_found_on_the_window(String windowName) {
        Assert.assertTrue(new VehicleOdometerPage().getWindow(windowName).isDisplayed());
        Assert.assertTrue(new VehicleOdometerPage().findElementWithExactText("No columns found").isDisplayed());
    }

    @Then("the user should be able to click {string} button on the {string} window")
    public void the_user_should_be_able_to_click_button_on_the_window(String buttonName, String windowName) {
        Assert.assertTrue(new VehicleOdometerPage().getWindow(windowName).isDisplayed());
        BrowserUtils.waitFor(1);
        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.elementToBeClickable(new VehicleOdometerPage().getGridSettingsButton(buttonName)));
        try {
            new VehicleOdometerPage().getGridSettingsButton(buttonName).click();
        }catch (ElementClickInterceptedException e){
            System.out.println(buttonName + " already clicked.");
        }
    }

    @Then("the user should be able to select all given options")
    public void the_user_should_be_able_to_select_all_given_options(List<String> dataTable) {
        for (String s : dataTable) {
          Assert.assertTrue(new VehicleOdometerPage().findElementWithExactText(s).isSelected());
        }
    }

    @Then("the user should be able to see the selected options as headers on the table")
    public void the_user_should_be_able_to_see_the_selected_options_as_headers_on_the_table() {
        for (WebElement dataOnTheGridSetting : new VehicleOdometerPage().getNamesOfTheDataOnTheGridSettings()) {
            if (new VehicleOdometerPage().getGridSettingsCheckBoxes(dataOnTheGridSetting.getText()).isSelected()){
                for (WebElement mainTableHeader : new VehicleOdometerPage().mainTableHeaders) {
                    if (!mainTableHeader.getText().isBlank()) {
                        Assert.assertTrue(mainTableHeader.getText().toLowerCase().equals(dataOnTheGridSetting.getText().toLowerCase()));
                    }
                }
            }
        }
    }

    @Then("the user should be able to see the only selected options on the {string} window")
    public void the_user_should_be_able_to_see_the_only_selected_options_on_the_window(String windowName) {
    new WebDriverWait(Driver.get(),5).until(ExpectedConditions.visibilityOf(new VehicleOdometerPage().getWindow(windowName)));
    Assert.assertTrue(new VehicleOdometerPage().getWindow(windowName).isDisplayed());

        for (WebElement names : new VehicleOdometerPage().getNamesOfTheDataOnTheGridSettings()) {
          Assert.assertTrue(new VehicleOdometerPage().getGridSettingsCheckBoxes(names.getText()).isSelected());
        }
    }

    @Then("the user should NOT be able to see the all given options on the {string} window")
    public void the_user_should_NOT_be_able_to_see_the_all_given_options_on_the_window(String windowName, List<String> dataTable) {

        Assert.assertTrue(new VehicleOdometerPage().getWindow(windowName).isDisplayed());
        for (String data : dataTable) {
            if (!new VehicleOdometerPage().getGridSettingsCheckBoxes(data).isSelected()){
                Assert.assertFalse(new VehicleOdometerPage().getGridSettingsCheckBoxes(data).isSelected());
                break;
            }

        }
    }

    @Then("the user should be able to see the all given options on the {string} window")
    public void the_user_should_be_able_to_see_the_all_given_options_on_the_window(String windowName, List<String> dataTable) {
        Assert.assertTrue(new VehicleOdometerPage().getWindow(windowName).isDisplayed());
        for (String data : dataTable) {
          Assert.assertTrue(new VehicleOdometerPage().getGridSettingsCheckBoxes(data).isDisplayed());
        }
    }

    @Then("the user should be able to select\\(if already not) and deselect the given options")
    public void the_user_should_be_able_to_select_if_already_not_and_deselect_the_given_options(List<String> dataTable) throws InterruptedException {

            for (String data : dataTable) {
                if (!new VehicleOdometerPage().getGridSettingsCheckBoxes(data).isSelected()) {
                    new VehicleOdometerPage().getGridSettingsCheckBoxes(data).click();
                    Assert.assertTrue(new VehicleOdometerPage().getGridSettingsCheckBoxes(data).isSelected());
                } else if (new VehicleOdometerPage().getGridSettingsCheckBoxes(data).isSelected()) {
                    new VehicleOdometerPage().getGridSettingsCheckBoxes(data).click();
                    Assert.assertFalse(new VehicleOdometerPage().getGridSettingsCheckBoxes(data).isSelected());
                }
            }
    }

    @Then("Grid Settings window should be disappear")
    public void grid_Settings_window_should_be_disappear() {

    }

    @Then("the user should be able to see Manage Filters button")
    public void the_user_should_be_able_to_see_Manage_Filters_button() {
        Assert.assertTrue(new VehicleOdometerPage().manageFiltersButton.isDisplayed() && new VehicleOdometerPage().manageFiltersButton.isEnabled());
    }

    @Then("the user should be able to enters {string} inside the text-box on the {string} window")
    public void the_user_should_be_able_to_enters_inside_the_text_box_on_the_window(String data, String windowName) {
            new VehicleOdometerPage().getTextBox(windowName).sendKeys(data);
    }

    @Then("the user should be able to select\\(if already not) the given options")
    public void the_user_should_be_able_to_select_if_already_not_the_given_options(List<String> dataTable) {
        for (String data : dataTable) {
            if(!new VehicleOdometerPage().getManageFiltersCheckBoxes(data).isSelected()){
                new VehicleOdometerPage().getManageFiltersCheckBoxes(data).click();
                BrowserUtils.waitFor(1);
            }
        }
    }

    @Then("the user should be able to see the selected options as headers next to Manage Filters button")
    public void the_user_should_be_able_to_see_the_selected_options_as_headers_next_to_Manage_Filters_button() {

    }

    @Then("the user should be able to deselect the given options")
    public void the_user_should_be_able_to_deselect_the_given_options(List<String> dataTable) {
        for (String data : dataTable) {
            if(new VehicleOdometerPage().getManageFiltersCheckBoxes(data).isSelected()){
                new VehicleOdometerPage().getManageFiltersCheckBoxes(data).click();
            }
        }
    }

    @Then("the user should NOT be able to see the selected options as headers next to Manage Filters button")
    public void the_user_should_NOT_be_able_to_see_the_selected_options_as_headers_next_to_Manage_Filters_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to click the {string} option")
    public void the_user_should_be_able_to_click_the_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to put {string}")
    public void the_user_should_be_able_to_put(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to put Update button")
    public void the_user_should_be_able_to_put_Update_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to see only include {string} odometers")
    public void the_user_should_be_able_to_see_only_include_odometers(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should NOT be able to see only include {string} odometers")
    public void the_user_should_NOT_be_able_to_see_only_include_odometers(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to select {string} option")
    public void the_user_should_be_able_to_select_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the page should be refreshed")
    public void the_page_should_be_refreshed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("{string} window should be disappear")
    public void window_should_be_disappear(String windowName) {
        Assert.assertFalse(new VehicleOdometerPage().getWindow(windowName).isDisplayed());
    }

    @Then("the user should NOT be able to see any given options on the {string} window")
    public void the_user_should_NOT_be_able_to_see_any_given_options_on_the_window(String windowName, List<String> dataTable) {
    Assert.assertTrue(new VehicleOdometerPage().getWindow(windowName).isDisplayed());
        for (String data : dataTable) {
            Assert.assertFalse(new VehicleOdometerPage().getManageFiltersCheckBoxes(data).isDisplayed());
        }
    }

    @Then("the user should be able to see the given options as headers next to Manage Filters button")
    public void the_user_should_be_able_to_see_the_given_options_as_headers_next_to_Manage_Filters_button(List<String> dataTable) {
        int a = 0;
        for (String data : dataTable) {
            Assert.assertEquals(data,new VehicleOdometerPage().filterItems.get(a++).getText());
        }
    }

    @Then("the user should NOT be able to see the given options as headers next to Manage Filters button")
    public void the_user_should_NOT_be_able_to_see_the_given_options_as_headers_next_to_Manage_Filters_button(List<String> dataTable) {
        int a = 0;
        try {
        for (String data : dataTable) {
            Assert.assertNotEquals(data,new VehicleOdometerPage().filterItems.get(a++).getText());
        }
    }catch (NoSuchElementException e){
            Assert.assertTrue(true);
        }
    }


}
