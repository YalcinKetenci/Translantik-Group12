package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.pages.VehicleCostPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SidebarWidgetsStepDefs {

    VehicleCostPage vehicleCostPage = new VehicleCostPage();


    @When("the user clicks plus button1")
    public void the_user_clicks_plus_button1() {
=======
    @When("the user clicks plus button")
    public void the_user_clicks_plus_button() {
        new Dashboard().waitUntilLoaderScreenDisappear();

        vehicleCostPage.plusIcon.click();
    }

    @Then("the user verifies that sidebar widgets page opened")
    public void the_user_verifies_that_sidebar_widgets_page_opened() {
        String expectedWindowTitle = "Sidebar Widgets";
        String actualWindowTitle = vehicleCostPage.windowTitle.getText();
        Assert.assertEquals(expectedWindowTitle, actualWindowTitle);
    }

    @When("the user clicks add button for {string}")
    public void the_user_clicks_add_button_for(String widget) {
        vehicleCostPage.addButton(widget).click();
    }

    @Then("the user verifies that {string} message is enclosed near {string} element")
    public void the_user_verifies_that_message_is_enclosed_near_element(String added, String widget) {
        new Dashboard().waitUntilLoaderScreenDisappear();
        Assert.assertEquals(added,vehicleCostPage.addedMessage(widget).getText());
    }

    @When("the user clicks close button")
    public void the_user_clicks_close_button() {
        vehicleCostPage.closeButton.click();
    }

    @Then("the user verifies that {string} icon is visible on the right sidebar")
    public void the_user_verifies_that_icon_is_visible_on_the_right_sidebar(String widget) {
        Assert.assertTrue(vehicleCostPage.visibleIcon(widget).isDisplayed());
    }

    @When("the user click pin button1")
    public void the_user_click_pin_button1() {
        BrowserUtils.waitForClickablility(vehicleCostPage.pinIcon,5);
        vehicleCostPage.pinIcon.click();
    }

    @Then("the user verifies that color of pin icon changed to gold")
    public void the_user_verifies_that_color_of_pin_icon_changed_to_gold() {
        BrowserUtils.waitForClickablility(vehicleCostPage.goldIcon,3);
        Assert.assertTrue(vehicleCostPage.goldIcon.isDisplayed());
    }

    @Then("the user verifies that Vehicle Costs page is pinned to pin bar")
    public void the_user_verifies_that_Vehicle_Costs_page_is_pinned_to_pin_bar() {
        String pageTitle= Driver.get().getTitle();
        String pinnedPage= vehicleCostPage.pinBar.getText();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(pageTitle.contains(pinnedPage));
    }

    @When("the user click star button1")
    public void the_user_click_star_button1() {
        BrowserUtils.waitForClickablility(vehicleCostPage.starIcon,5);
        vehicleCostPage.starIcon.click();
    }

    @Then("the user verifies that color of star icon changed to gold")
    public void the_user_verifies_that_color_of_star_icon_changed_to_gold() {
        BrowserUtils.waitForClickablility(vehicleCostPage.goldStar,3);
        Assert.assertTrue(vehicleCostPage.goldStar.isDisplayed());
    }

    @When("the user clicks fa-bars button")
    public void the_user_clicks_fa_bars_button() {
        BrowserUtils.waitForVisibility(vehicleCostPage.faBars,3);
        vehicleCostPage.faBars.click();
        vehicleCostPage.favTab.click();
    }

    @Then("the user verifies that Vehicle Costs page title is seen as favorite page")
    public void the_user_verifies_that_Vehicle_Costs_page_title_is_seen_as_favorite_page() {
        String pageTitle= Driver.get().getTitle();
        Assert.assertEquals(pageTitle,vehicleCostPage.favContent.getText());
    }
}
