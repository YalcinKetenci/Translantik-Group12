package com.translantik.step_definitions;

import com.translantik.pages.Dashboard;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class VehiclesStepDef {



    //US_35 Sales manager store manager widget pin fav step def
    @When("the user clicks plus button")
    public void the_user_clicks_plus_button() {
        new Dashboard().waitUntilLoaderScreenDisappear();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.get().findElement(By.xpath("//button[@data-role='sidebar-add-widget']")).click();
    }

    @When("sidebar widgets page opened")
    public void sidebar_widgets_page_opened() {
        System.out.println("DONE");
    }

    @When("the user click add button")
    public void the_user_click_add_button() throws InterruptedException {
        Thread.sleep(1000);
        Driver.get().findElement(By.xpath("//a[@class='btn widget-picker-add-btn btn-primary']")).click();
    }

    @Then("the widget is added")
    public void the_widget_is_added() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(Driver.get().findElement(By.xpath("//a[@class='btn widget-picker-add-btn btn-primary']")).isDisplayed());
    }

    @When("the user click star button")
    public void the_user_click_star_button() throws InterruptedException {
        Thread.sleep(10000);
        Driver.get().findElement(By.xpath("//i[@class='fa-star hide-text']")).click();
    }

    @Then("the user made the page favorite")
    public void the_user_made_the_page_favorite() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(Driver.get().findElement(By.xpath("//button[@class='btn favorite-button gold-icon']")).isDisplayed());

    }

    @When("the user click pin button")
    public void the_user_click_pin_button() throws InterruptedException {
        Thread.sleep(10000);
        Driver.get().findElement(By.xpath("//button[@title='Pin/unpin the page']")).click();
    }

    @Then("the user made the page pinned")
    public void the_user_made_the_page_pinned() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(Driver.get().findElement(By.xpath("//button[@class='btn minimize-button gold-icon']")).isDisplayed());
    }


}
