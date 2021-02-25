package com.translantik.step_definitions;

import com.translantik.pages.VehicleCostPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_25_StepDefinition {
    @When("the user navigates to {string} tab and {string} page")
    public void the_user_navigates_to_tab_and_page(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("the user able to see information on {string} page")
    public void the_user_able_to_see_information_on_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }
    @When("the user change page on {string} module")
    public void the_user_change_page_on_module(String string) {
        new VehicleCostPage().navigateToModule("Fleet",string);

    }

    @Then("the user able to get following vehicle costs informations")
    public void the_user_able_to_get_following_vehicle_costs_informations() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user change entity number by clicking the view per page dropdown \\({double})")
    public void the_user_change_entity_number_by_clicking_the_view_per_page_dropdown(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user able to see the number of selected dropdown")
    public void the_user_able_to_see_the_number_of_selected_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click export grid")
    public void the_user_click_export_grid() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user able to select {string} \"XLSX")
    public void the_user_able_to_select_XLSX(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user can get all information via e-mail")
    public void the_user_can_get_all_information_via_e_mail() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user change entity number by clicking the view per page dropdown by {string}")
    public void theUserChangeEntityNumberByClickingTheViewPerPageDropdownBy(String arg0) {

        Assert.assertEquals(new VehicleCostPage().click_page_group_number(arg0),arg0);
    }
}
