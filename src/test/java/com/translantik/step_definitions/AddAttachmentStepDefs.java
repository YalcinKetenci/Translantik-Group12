package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.pages.VehicleInformationPage;
import com.translantik.pages.VehicleOdometerPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ve;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AddAttachmentStepDefs {

    String expectedSubtitle=null;
    Dashboard dashboard=new Dashboard();
    VehicleOdometerPage vehicleOdometerPage=new VehicleOdometerPage();


    @When("User navigated to {string} tab {string} module")
    public void user_navigated_to_tab_module(String tab, String module) {
        dashboard.navigateToModule(tab, module);

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
        String actualSubtitle= vehicleInformationPage.titleAddAttachment.getText();
        Assert.assertEquals(expectedSubtitle,actualSubtitle);
    }

    @When("User clicks on Add Attachment button on the right top corner of the page")
    public void user_clicks_on_Add_Attachment_button_on_the_right_top_corner_of_the_page(){
        BrowserUtils.waitForClickablility(new VehicleInformationPage().addAttachmentButton,20);
        new VehicleInformationPage().addAttachmentButton.click();

    }
    @Then("User verifies that {string} popup windows opened")
    public void user_verifies_that_Add_Attachment_popup_windows_opened(String expectedTitle) {
        VehicleInformationPage vehicleInformationPage=new VehicleInformationPage();
        String actualTitle=vehicleInformationPage.titleAddAttachment.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("User clicks to Choose File button on the popup window and selects a file from computer")
    public void user_clicks_to_Choose_File_button_on_the_popup_window() {
        VehicleInformationPage vehicleInformationPage=new VehicleInformationPage();
        BrowserUtils.waitFor(3000);
        vehicleInformationPage.chooseFile.sendKeys("C:\\Users\\Asus\\Pictures\\Saved Pictures\\google office.jpg");

    }

    @When("User clicks to Save button on the popup window")
    public void user_clicks_to_Save_button_on_the_popup_window() {
    new VehicleInformationPage().saveButton.click();
    }
    @Then("User verifies that selected file is uploaded and can be seen under Attachments")
    public void user_verifies_that_selected_file_is_uploaded_and_can_be_seen_under_Attachments() {

    }

}
