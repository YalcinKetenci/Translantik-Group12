package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.pages.VehicleInformationPage;
import com.translantik.pages.VehicleOdometerPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class VehicleOdometerStepDef {
    public String enteredDataIntoGridSettings;
    public String enteredDataIntoManageFilters;
    public String pageHtml;
    VehicleOdometerPage vehicleOdometerPage=new VehicleOdometerPage();
    String expectedSubtitle=null;
    Dashboard dashboard=new Dashboard();

    //US_19 Mr. Nurullah ALP EKIN
    @When("User clicks {string} CVO button")
    public void user_clicks_CVO_button(String button) {
        vehicleOdometerPage.clickTheButton(button);
    }


    @Then("User verifies that Create Vehicle Odometer page opened")
    public void user_verifies_create_page_opened() {
        Assert.assertEquals("Create Vehicle Odometer", Driver.get().findElement(By.cssSelector(".user-name")).getText());
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
    @When("User navigated to {string} tab {string} module")
    public void user_navigated_to_tab_module(String tab, String module) {
        dashboard.navigateToModule(tab, module);

    }

    @Then("User verifies that Vehicles Odometers page opened")
    public void user_verifies_that_page_opened() {
        Assert.assertEquals("Vehicles Odometers",Driver.get().findElement(By.className("oro-subtitle")).getText());

    }

    @When("User clicks on any vehicle information")
    public void user_clicks_on_any_vehicle_information() {
        expectedSubtitle=vehicleOdometerPage.driverName.getText();
        BrowserUtils.waitFor(10);
        new Actions(Driver.get()).moveToElement(vehicleOdometerPage.threeDots).perform();
        vehicleOdometerPage.view.click();
    }

    @Then("User verifies that information page opened")
    public void user_verifies_that_information_page_opened() {
        VehicleInformationPage vehicleInformationPage=new VehicleInformationPage();
        String actualSubtitle= vehicleInformationPage.driverName.getText();
        Assert.assertEquals(expectedSubtitle,actualSubtitle);
    }

    @When("User clicks on Add Attachment button on the right top corner of the page")
    public void user_clicks_on_Add_Attachment_button_on_the_right_top_corner_of_the_page(){
//        BrowserUtils.waitForClickablility(new VehicleInformationPage().addAttachmentButton,20);
        new VehicleInformationPage().addAttachmentButton.click();

    }
    @Then("User verifies that {string} popup windows opened")
    public void user_verifies_that_Add_Attachment_popup_windows_opened(String expectedTitle) {
        VehicleInformationPage vehicleInformationPage=new VehicleInformationPage();
        BrowserUtils.waitForVisibility(vehicleInformationPage.titleAddAttachment,10);
        String actualTitle=vehicleInformationPage.titleAddAttachment.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("User clicks to Choose File button on the popup window and selects a file from computer")
    public void user_clicks_to_Choose_File_button_on_the_popup_window() {
        VehicleInformationPage vehicleInformationPage=new VehicleInformationPage();
        BrowserUtils.waitFor(10);
        vehicleInformationPage.chooseFile.click();
        vehicleInformationPage.chooseFile.sendKeys("C:\\Users\\Asus\\Pictures\\Saved Pictures\\google office.jpg", Keys.ENTER);

    }

    @When("User clicks to Save button on the popup window")
    public void user_clicks_to_Save_button_on_the_popup_window() {
        new VehicleInformationPage().saveButton.click();
    }
    @Then("User verifies that selected file is uploaded and can be seen under Attachments")
    public void user_verifies_that_selected_file_is_uploaded_and_can_be_seen_under_Attachments() {

    }

    //US_017 --> Filtering Functions
    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new Dashboard().navigateToModule(tab,module);
        //new Dashboard().waitUntilLoaderScreenDisappear();
    }

    @Then("the user should be able to click {string} button")
    public void the_user_should_be_able_to_click_button(String buttonName) {
        pageHtml=Driver.get().getCurrentUrl();
        new VehicleOdometerPage().clickTheButton(buttonName);
        BrowserUtils.waitFor(1);
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
            if (!header.getText().isEmpty()) {
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
            Assert.assertTrue(filterItem.getText().isEmpty());
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

    //US_020 Truck driver can see all odometer information
    @When("The user click {string} tab and {string}")
    public void theUserClickTabAnd(String arg0, String arg1) {
        new Dashboard().navigateToModule(arg0,arg1);
        new Dashboard().waitUntilLoaderScreenDisappear();
    }

    @Then("User should be able to see all information on page")
    public void userShouldBeAbleToSeeAllInformationOnPage() {
        Assert.assertEquals(Driver.get().findElement(By.className("oro-subtitle")).getText(), "Vehicles Odometers");
    }

    //US_022 Truck driver odometer Delete Functions Step Defs
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


    @When("navigate to {string} tab and {string} module")
    public void navigate_to_tab_and_module(String tab, String module) {
        dashboard.navigateToModule(tab, module);
    }

    @Then("verify the page does not change")
    public void verify_the_page_does_not_change() {
        Assert.assertEquals("Dashboard", dashboard.getPageSubTitle());
    }

    @Then("verify {string} page title")
    public void verify_page_title(String string) {
        Assert.assertEquals(string, dashboard.getPageSubTitle());
    }




}
