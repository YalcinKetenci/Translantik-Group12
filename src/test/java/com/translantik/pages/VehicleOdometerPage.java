package com.translantik.pages;

import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class VehicleOdometerPage extends BasePage {

    @FindBy(xpath = "(//*[@class='dropdown-menu'])[4]")
    public WebElement gridSettingsWindow;

    @FindBy(xpath = "//*[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']")
    public WebElement manageFiltersWindow;

    @FindBy(xpath = "//*[@class='column-manager-search empty']/input")
    public WebElement gridSettingsTextBox;

    @FindBy(xpath = "//*[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']/div/div/input")
    public WebElement manageFiltersTextBox;

    @FindBy(xpath = "(//table)[2]/tbody/tr/td[1]/label")
    public List<WebElement> namesOfTheDataOnTheGridSettings;

    @FindBy(xpath = "//*[text()='Select All']")
    public WebElement selectAll;

    @FindBy(xpath = "//*[@class='column-filter-renderable-tab active']")
    public WebElement All;

    @FindBy(xpath = "//*[@class='column-filter-renderable-tab']")
    public WebElement Selected;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//th/a/span")
    public List<WebElement> mainTableHeaders;

    @FindBy(css = "td.action-cell.grid-cell.grid-body-cell")
    public WebElement threeDots;

    @FindBy (css = "i.fa-eye.hide-text")
    public WebElement view;

    @FindBy (css = "td.string-cell.grid-cell.grid-body-cell.grid-body-cell-Driver")
    public WebElement driverName;

    @FindBy(css = "i.fa-trash-o.hide-text")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[@class='close']")
    public WebElement gridSettingsCloseButton;

    @FindBy(xpath = "//button[@class='ui-multiselect ui-corner-all select-filter-widget']/a")
    public WebElement manageFiltersButton;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']//label/span")
    public List<WebElement> nameOfTheDataOnTheManageFilters;

    @FindBy(xpath = "//span[@class='filter-items']/div/div[1]")
    public List<WebElement> filterItems;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']//input")
    public List<WebElement> getAllCheckBoxesOnTheManageFilters;


    public WebElement clickTheButton(String buttonTitle){
        waitUntilLoaderScreenDisappear();
        WebElement btn;

        btn = Driver.get().findElement(By.xpath("//*[@title='" + buttonTitle + "']"));
        btn.click();
        return btn;


    }

    public WebElement getWindow(String windowName){

        switch (windowName.toLowerCase()){
            case "grid settings":
                gridSettingsWindow.click();
                BrowserUtils.waitFor(1);
                return gridSettingsWindow;
            case "manage filters":
                manageFiltersWindow.click();
                BrowserUtils.waitFor(1);
                return manageFiltersWindow;
            default:
                System.out.println("Invalid window name to get window !!!");
                return null;
        }
    }

    public WebElement getTextBox(String windowName){
        switch (windowName.toLowerCase()){
            case "grid settings":
                return gridSettingsTextBox;
            case "manage filters":
                return manageFiltersTextBox;
            default:
                System.out.println("Invalid window name to get window text-box !!!");
                return null;
        }
    }

    public WebElement findElementWithExactText(String exactText){
        return Driver.get().findElement(By.xpath("//*[text()='"+exactText+"']"));
    }

    public WebElement getGridSettingsButton(String buttonName){
        switch (buttonName.toLowerCase()){
            case "selected":
                return Selected;
            case "all":
                return All;
            case "select all":
                return selectAll;
            case"x":
                return gridSettingsCloseButton;
            default:
                System.out.println("Invalid button name");
                return null;
        }


    }

    public WebElement getGridSettingsCheckBoxes(String filterName){

        return Driver.get().findElement(By.xpath("(//table)[2]//td/label[.='"+filterName+"']/../../td[3]/input"));
    }

    public List<WebElement> getNamesOfTheDataOnTheGridSettings(){
        List<WebElement> dataOnWindow = new ArrayList<>();
        for (WebElement names : namesOfTheDataOnTheGridSettings) {
            if (names.isDisplayed()){
                dataOnWindow.add(names);
            }
        }
        return dataOnWindow;
    }

    public WebElement getManageFiltersCheckBoxes(String filterName){
        BrowserUtils.waitFor(1);
        return Driver.get().findElement(By.xpath("//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']//*[@title='"+filterName+"']//input"));
    }

}

