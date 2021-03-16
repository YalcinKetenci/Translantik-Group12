package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.pages.VehicleCostPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class VehicleCostStepDef {

    //US_025 Mr. Harun ALTINTAS
    @Then("the user able to get following vehicle costs information")
    public void the_user_able_to_get_following_vehicle_costs_information() {
        Assert.assertEquals(new VehicleCostPage().cost_page_title.getText(),"Vehicle Costs");
    }

    @Then("the user change page group as {string}")
    public void the_user_change_page_group_as(String string) {
        new VehicleCostPage().click_page_group_number(string);

    }

    @Then("the user able to change page by click right button")
    public void the_user_able_to_change_page_by_click_right_button() {
        BrowserUtils.waitFor(1);
        new VehicleCostPage().change_page_right.click();


    }

    @Then("the user able to change page by click left button")
    public void the_user_able_to_change_page_by_click_left_button() {
        BrowserUtils.waitFor(1);
        new VehicleCostPage().change_page_left.click();
        BrowserUtils.waitFor(3);

    }
    @Then("the user change entity number by clicking the view per page dropdown by {string}")
    public void the_user_change_entity_number_by_clicking_the_view_per_page_dropdown_by(String string) {
        new VehicleCostPage().scrollToElementWithJS(new VehicleCostPage().btn_group_open);
        new VehicleCostPage().click_page_group_number(string);

    }


    @Then("the user able to select by {string}")
    public void theUserAbleToSelectBy(String arg0) {
        new VehicleCostPage().export_Vehicle_Costs_page_information(arg0);


    }

    //US_30 Specific Cost Functions
    @When("the user click first vehicle cost")
    public void the_user_click_first_vehicle_cost() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(new VehicleCostPage().tableCosts.get(0)).pause(1000).click(new VehicleCostPage().tableCosts.get(0)).perform();
        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.elementToBeClickable(new VehicleCostPage().olderButton));
    }

    @Then("the user should be able to see the given vehicle cost informations")
    public void the_user_should_be_able_to_see_the_given_vehicle_cost_informations(List<String> informationTabNames) {

        for (String tabName : informationTabNames) {
            Assert.assertTrue(new VehicleCostPage().getVehicleCostsInformationTable(tabName).isDisplayed());
        }
    }

    @Then("the user should be able to choose {string}")
    public void the_user_should_be_able_to_choose(String value) {
        // new VehicleCostPage().dateRangeSelect.click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("//select[@class='filter-select-oro no-input-widget']/option[.='"+value+"']")).click();
//        Select select = new Select(new VehicleCostPage().dateRangeSelect);
//        select.selectByValue(value);
        BrowserUtils.waitFor(1);

    }

    @Then("the user should be able to put {string}")
    public void the_user_should_be_able_to_put(String date) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(new VehicleCostPage().laterThanTextBox).pause(300).click();
        new VehicleCostPage().laterThanTextBox.sendKeys(date+ Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @Then("the user should be able to see only activities that after {string}")
    public void the_user_should_be_able_to_see_only_activities_that_after(String date) {
        try {
            Date givenDate = new VehicleCostPage().simpleDateFormat.parse(date);
            Date actualDate = new VehicleCostPage().simpleDateFormat.parse(new VehicleCostPage().getActivitiesInformations(1).get("Start"));
            Assert.assertTrue(givenDate.before(actualDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }

    @When("the user should be able to reach the all activities by clicking the {string} button")
    public void the_user_should_be_able_to_reach_the_all_activities_by_clicking_the_button(String newerOrOlder) {
        new VehicleCostPage().clickOlderOrNewer(newerOrOlder);
    }

    @Then("the attachments should be able to refreseh")
    public void the_attachments_should_be_able_to_refreseh() {
        Assert.assertTrue(new VehicleCostPage().newerButton.isEnabled());
    }


    @When("the user change the number of view per page as {string}")
    public void the_user_change_the_number_of_view_per_page_as(String number) {
        new Dashboard().waitUntilLoaderScreenDisappear();
        new VehicleCostPage().click_page_group_number(number);
        BrowserUtils.waitFor(2);
    }

    @Then("the user should be able to change the page by clicking {string} button")
    public void the_user_should_be_able_to_change_the_page_by_clicking_button(String nextOrPrevious) {
        new VehicleCostPage().triggerAttachmentsPage(nextOrPrevious);
    }
    @Then("the user should be able to unselect first two options")
    public void the_user_should_be_able_to_unselect_first_two_options() {
        BrowserUtils.waitFor(1);
        new VehicleCostPage().vcGridSettingCheckBoxes.get(0).click();
        BrowserUtils.waitFor(1);
        new VehicleCostPage().vcGridSettingCheckBoxes.get(1).click();

        Assert.assertFalse(new VehicleCostPage().vcGridSettingCheckBoxes.get(0).isSelected());
        Assert.assertFalse(new VehicleCostPage().vcGridSettingCheckBoxes.get(1).isSelected());
    }

    //US_029 By Ferruh

    @When("the user clicks Create Vehicle Costs button")
    public void the_user_clicks_Create_Vehicle_Costs_button() {
        new VehicleCostPage().createVehicleCostsButton.click();
    }

    @Then("the user should be able to click Save And Close button")
    public void the_user_should_be_able_to_click_Save_And_Close_button() {
        new VehicleCostPage().saveAndCloseButton.click();
        //Driver.get().findElement(By.xpath("//button[@type='submit']")).click();

    }
}
