package com.translantik.step_definitions;

import com.translantik.pages.VehicleCostPage;
import com.translantik.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ve;
import org.junit.Assert;

public class US_25_StepDefinition {

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
        new VehicleCostPage().click_page_group_number(string);

    }


    @Then("the user able to select by {string}")
    public void theUserAbleToSelectBy(String arg0) {
        new VehicleCostPage().export_Vehicle_Costs_page_information(arg0);


    }
}