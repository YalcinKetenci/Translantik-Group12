package com.translantik.step_definitions;

import com.translantik.pages.VehicleCostPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehiclesStepDef {


    //US-032 Truck driver vehicle cost page attachment
    @Then("User verifies that Attachment created successfully")
    public void user_verifies_that_Attachment_created_successfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(new VehicleCostPage().attachmentMessage.isDisplayed());
    }

    //US_35 Sales manager store manager widget pin fav step def
    @When("sidebar widgets page opened")
    public void sidebar_widgets_page_opened() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(new VehicleCostPage().widgetsWindow.isDisplayed());
    }

    @When("the user click add button")
    public void the_user_click_add_button() throws InterruptedException {
        Thread.sleep(1000);
        new VehicleCostPage().addWidgetButton.click();
    }

    @Then("the widget is added")
    public void the_widget_is_added() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(new VehicleCostPage().widgetAddedMessage.isDisplayed());
    }


    @Then("the user made the page favorite")
    public void the_user_made_the_page_favorite() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(new VehicleCostPage().goldenFav.isDisplayed());

    }


    @Then("the user made the page pinned")
    public void the_user_made_the_page_pinned() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(new VehicleCostPage().goldenPin.isDisplayed());
    }

}
