package com.translantik.pages;

import com.translantik.utilities.BrowserUtils;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleCostPage extends BasePage {

    @FindBy(className = "fa-chevron-right hide-text")
    public WebElement change_page_right;

    @FindBy(className = "fa-chevron-left hide-text")
    public WebElement change_page_left;

    @FindBy(className = "btn-group open")
    public WebElement btn_group_open;

    @FindBy(className = "dropdown-item")
    public List<WebElement> page_show_number;

    public String click_page_group_number(String data) {

        new VehicleCostPage().waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(btn_group_open,5);

        btn_group_open.click();
        BrowserUtils.waitFor(1);

        switch (data) {
            case "10":
                page_show_number.get(0).click();
                BrowserUtils.waitFor(1);
                return btn_group_open.getText();
            case "25":
                page_show_number.get(1).click();
                BrowserUtils.waitFor(1);
                return btn_group_open.getText();
            case "50":
                page_show_number.get(2).click();
                BrowserUtils.waitFor(1);
                return btn_group_open.getText();
            case "100":
                page_show_number.get(3).click();
                BrowserUtils.waitFor(1);
                return btn_group_open.getText();
            default:
                return "invalid data";

        }


    }

}

