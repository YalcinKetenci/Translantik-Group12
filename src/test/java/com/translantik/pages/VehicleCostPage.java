package com.translantik.pages;

import com.translantik.utilities.BrowserUtils;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleCostPage extends BasePage {

    @FindBy(className = "oro-subtitle")
    public WebElement cost_page_title;

    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement change_page_right;

    @FindBy(xpath = "//i[@class='fa-chevron-left hide-text']")
    public WebElement change_page_left;

    @FindBy(css = "button.btn.dropdown-toggle" )
    public WebElement btn_group_open;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public List<WebElement> page_show_number;

    @FindBy(css = "a.action.btn.mode-text-only.dropdown-toggle")
    public WebElement export_grid;

    @FindBy(css = "a[title='CSV']")
    public WebElement export_CSV;

    @FindBy(css = "a[title='XLSX']")
    public WebElement export_XLSX;

    @FindBy(partialLinkText = "Create Vehicle Costs")
    public WebElement createVehicleCostsButton;

    @FindBy(xpath = "//a[@class='btn-success btn dropdown-toggle']")
    public WebElement saveAndCloseButton;


    public String click_page_group_number(String data) {



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

    public void export_Vehicle_Costs_page_information(String data){
        export_grid.click();
        BrowserUtils.waitFor(1);

        switch (data){
        case "CSV":
            BrowserUtils.waitFor(1);
            export_CSV.click();
            BrowserUtils.waitFor(2);
            break;
        case "XLSX":
            BrowserUtils.waitFor(1);
            export_XLSX.click();
            BrowserUtils.waitFor(2);
            default:
                System.out.println("Invalid export file");

        }


    }

}

