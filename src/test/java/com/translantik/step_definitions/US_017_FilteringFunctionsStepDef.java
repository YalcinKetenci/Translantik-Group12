package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.pages.VehicleOdometerPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class US_017_FilteringFunctionsStepDef {

    public String enteredDataIntoGridSettings;
    public String enteredDataIntoManageFilters;
    public String pageHtml;

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new Dashboard().navigateToModule(tab,module);
        new Dashboard().waitUntilLoaderScreenDisappear();
    }

    @Then("the user should be able to click {string} button")
    public void the_user_should_be_able_to_click_button(String buttonName) {
        pageHtml=Driver.get().getCurrentUrl();
        new VehicleOdometerPage().clickTheButton(buttonName);
    }

    @Then("the user should be able to see {string} window")
    public void the_user_should_be_able_to_see_window(String windowName) {
        Assert.assertTrue(new VehicleOdometerPage().getWindow(windowName).isDisplayed());
    }

    @Then("the user should be able to enters one of the given data inside the text-box on the {string} window")
    public void the_user_should_be_able_to_enters_one_of_the_given_data_inside_the_text_box_on_the_window(String windowName, List<String> data) {
        new VehicleOdometerPage().getTextBox(windowName).sendKeys(data.get(0));
        switch (windowName.toLowerCase()){
            case "grid settings":
                enteredDataIntoGridSettings= data.get(0);
                break;
            case "manage filters":
                enteredDataIntoManageFilters= data.get(0);
                break;
        }
    }

    @Then("the user should be able to see the only options that includes the written character on the {string} window")
    public void the_user_should_be_able_to_see_the_only_options_that_includes_the_written_character_on_the_window(String windowName) {
        BrowserUtils.waitFor(1);

        for (WebElement names : new VehicleOdometerPage().getNamesOfTheDataBasedOnTheWindow(windowName)) {
            if(names.isDisplayed() && names.isEnabled()) {
                if (windowName.equalsIgnoreCase("manage filters")) {
                    Assert.assertEquals(names.getText(), enteredDataIntoManageFilters);
                }else if (windowName.equalsIgnoreCase("grid settings")){
                    Assert.assertEquals(names.getText(),enteredDataIntoGridSettings);
                }
            }
        }
    }

    @Then("the user should be able to enters {string} inside the Quick Search area on the {string} window")
    public void the_user_should_be_able_to_enters_inside_the_Quick_Search_area_on_the_window(String data, String windowName) {
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
           Actions act = new Actions(Driver.get());
           act.moveToElement(new VehicleOdometerPage().getGridSettingsButton(buttonName)).pause(500).click(new VehicleOdometerPage().getGridSettingsButton(buttonName)).pause(500).perform();

    }

    @Then("the user should be able to select all given options")
    public void the_user_should_be_able_to_select_all_given_options(List<String> dataTable) {
        for (String data : dataTable) {
            Assert.assertTrue(new VehicleOdometerPage().getGridSettingsCheckBoxes(data).isSelected());
        }
    }

    @Then("the user should be able to see the selected options as headers on the table")
    public void the_user_should_be_able_to_see_the_selected_options_as_headers_on_the_table() {

        List<String> selectedOptions = new ArrayList<>();
        for (WebElement name : new VehicleOdometerPage().namesOfTheDataOnTheGridSettings) {
            if (new VehicleOdometerPage().getGridSettingsCheckBoxes(name.getText()).isSelected()) {
                selectedOptions.add(name.getText().toLowerCase());
            }
        }

        List<String> headers = new ArrayList<>();
        for (WebElement header : new VehicleOdometerPage().mainTableHeaders) {
            if (!header.getText().isBlank()) {
                headers.add(header.getText().toLowerCase());
            }
        }

        Assert.assertEquals(selectedOptions, headers);

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
    public void the_user_should_be_able_to_select_if_already_not_and_deselect_the_given_options(List<String> dataTable)  {

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
        Assert.assertFalse(new VehicleOdometerPage().gridSettingsWindow.isDisplayed());
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
                BrowserUtils.waitFor(1);
                new VehicleOdometerPage().getManageFiltersCheckBoxes(data).click();
            }
        }
        for (String data : dataTable) {
          Assert.assertTrue(new VehicleOdometerPage().getManageFiltersCheckBoxes(data).isSelected());
        }
    }

    @Then("the user should be able to see the selected options as headers next to Manage Filters button")
    public void the_user_should_be_able_to_see_the_selected_options_as_headers_next_to_Manage_Filters_button() {
        int a = 0;
        for (WebElement dataOnTheManageFilter : new VehicleOdometerPage().dataOnTheManageFilters) {
            if(new VehicleOdometerPage().getManageFiltersCheckBoxes(dataOnTheManageFilter.getText()).isSelected()){
                Assert.assertTrue(new VehicleOdometerPage().filterItems.get(a++).getText().contains(dataOnTheManageFilter.getText()));
            }
        }
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
        for (WebElement filterItem : new VehicleOdometerPage().filterItems) {
            Assert.assertTrue(filterItem.getText().isBlank());
        }
    }

    @Then("the user should be able to click the {string} item")
    public void the_user_should_be_able_to_click_the_item(String filterItem) {
        for (WebElement item : new VehicleOdometerPage().filterItems) {
            if (item.getText().contains(filterItem)){
                item.click();
            }
        }
    }
    @Then("the user should be able to click the {string} option")
    public void the_user_should_be_able_to_click_the_option(String filterItem) {
        new VehicleOdometerPage().chooseOdometerValueDropDown(filterItem);

    }

    @Then("the user should be able to put {string} \"Equals\" into the equals textboxes on the odometer value item")
    public void the_user_should_be_able_to_put_Equals_into_the_equals_textboxes_on_the_odometer_value_item(String data) {
        new VehicleOdometerPage().equalsInput.sendKeys(data);
    }

    @Then("the user should be able to click Update button")
    public void the_user_should_be_able_to_click_Update_button() {
    new VehicleOdometerPage().updateButton.click();
    }

    @Then("the user should be able to see only include {string} odometers")
    public void the_user_should_be_able_to_see_only_include_odometers(String data) {
        new Dashboard().waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(new VehicleOdometerPage().getTheDataBaseOnTheMainTableHeaders().size()>0);
        for (WebElement base : new VehicleOdometerPage().getTheDataBaseOnTheMainTableHeaders()) {
            System.out.println(base.getText());
            Assert.assertEquals(base.getText(), data);
        }
    }

    @Then("the user should NOT be able to see any odometers")
    public void the_user_should_NOT_be_able_to_see_any_odometers() {
        new Dashboard().waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(new VehicleOdometerPage().noDataAlert.isDisplayed());
    }

    @Then("the user should be able to select {string} option")
    public void the_user_should_be_able_to_select_option(String data) {
        new VehicleOdometerPage().getGridSettingsCheckBoxes(data).click();
    }

    @Then("the page should be refreshed")
    public void the_page_should_be_refreshed() {
        Assert.assertEquals("Page should be refresh",Driver.get().getCurrentUrl(),pageHtml);
    }
    @Then("the page should be reset")
    public void the_page_should_be_reset() {
        Assert.assertNotEquals("Page should be refresh",Driver.get().getCurrentUrl(),pageHtml);
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
    @Then("the user should be able to click Manage filters button")
    public void the_user_should_be_able_to_click_Manage_filters_button() {
        new VehicleOdometerPage().manageFiltersButton.click();
    }

}
