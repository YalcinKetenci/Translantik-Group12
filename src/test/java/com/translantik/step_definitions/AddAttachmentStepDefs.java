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

    @When("User navigated to {string} tab {string} module")
    public void user_navigated_to_tab_module(String tab, String module) {
        new Dashboard().navigateToModule(tab, module);

    }
    @When("User clicks on any vehicle information")
    public void user_clicks_on_any_vehicle_information() {

        expectedSubtitle=new VehicleOdometerPage().driverName.getText();
        BrowserUtils.waitFor(10);
        new Actions(Driver.get()).moveToElement(new VehicleOdometerPage().threeDots).perform();
        new VehicleOdometerPage().view.click();
  }

    @Then("User verifies that information page opened")
    public void user_verifies_that_information_page_opened() {
        String actualSubtitle= new VehicleInformationPage().driverName.getText();
        Assert.assertEquals(expectedSubtitle,actualSubtitle);

    }


    @When("User clicks on Add Attachment button on the right top corner of the page")
    public void user_clicks_on_Add_Attachment_button_on_the_right_top_corner_of_the_page() throws InterruptedException {
        VehicleInformationPage vehicleInformationPage=new VehicleInformationPage();
        BrowserUtils.waitFor(5000);
        vehicleInformationPage.addAttachmentButton.click();

//        new VehicleInformationPage().chooseFile.click();
//        String projectPath = System.getProperty("user.dir");
//        String filePath = "src/test/resources/translantik.txt";
//        String fullPath = projectPath+"/"+filePath;
//        new VehicleInformationPage().chooseFile.sendKeys("google office.jpg",Keys.ENTER);

        vehicleInformationPage.chooseFile.sendKeys(vehicleInformationPage.filetxt);
        Thread.sleep(3000);
        vehicleInformationPage.saveButton.click();


//        //getting the file name from browser
//        String actualFileName= driver.findElement(By.id("uploaded-files")).getText();
//        //verify file name is file.txt
//        Assert.assertEquals(actualFileName,"textfile.txt");

//        new VehicleInformationPage().chooseFile.sendKeys(new VehicleInformationPage().filePath());
//        new VehicleInformationPage().saveButton.click();

    }
    @Then("User verifies that Add Attachment popup windows opened")
    public void user_verifies_that_Add_Attachment_popup_windows_opened() {

    }
    @When("User clicks to Choose File button on the popup window")
    public void user_clicks_to_Choose_File_button_on_the_popup_window() {

    }
    @When("User selects a file from computer")
    public void user_selects_a_file_from_computer() {

    }
    @When("User clicks to Save button on the popup window")
    public void user_clicks_to_Save_button_on_the_popup_window() {

    }
    @Then("User verifies that selected file is uploaded and can be seen under Attachments")
    public void user_verifies_that_selected_file_is_uploaded_and_can_be_seen_under_Attachments() {

    }
}
