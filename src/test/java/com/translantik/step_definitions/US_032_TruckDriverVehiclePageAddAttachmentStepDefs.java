package com.translantik.step_definitions;

import com.translantik.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class US_032_TruckDriverVehiclePageAddAttachmentStepDefs {


    @Given("the user clicks any cost")
    public void the_user_clicks_any_cost() throws InterruptedException {
        Thread.sleep(5000);
        Driver.get().findElement(By.xpath("(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Type'])[1]")).click();
    }

    @Given("the user clicks Add Attachment button")
    public void the_user_clicks_Add_Attachment_button() throws InterruptedException {
        Thread.sleep(5000);
        Driver.get().findElement(By.xpath("//a[@title='Add attachment']")).click();
    }

    @Given("the user clicks Choose File button")
    public void the_user_clicks_Choose_File_button() throws InterruptedException {
        Thread.sleep(5000);
        Driver.get().findElement(By.xpath("//div[@class='uploader input-widget-file']")).click();
    }

}
