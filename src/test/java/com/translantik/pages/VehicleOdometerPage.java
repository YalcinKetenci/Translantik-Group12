package com.translantik.pages;

import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class VehicleOdometerPage extends BasePage {

    @FindBy(xpath = "//div[@class='dropdown-menu']")
    public WebElement gridSettingsWindow;

    @FindBy(xpath = "//*[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']")
    public WebElement manageFiltersWindow;

    @FindBy(xpath = "//*[@class='column-manager-search empty']/input")
    public WebElement gridSettingsTextBox;

    @FindBy(xpath = "//*[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']/div/div/input")
    public WebElement manageFiltersTextBox;

    @FindBy(xpath = "(//table)[2]/tbody/tr/td[1]/label")
    public List<WebElement> namesOfTheDataOnTheGridSettings;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li/label/span")
    public List<WebElement> namesOfTheDataOnTheManageFilters;

    @FindBy(xpath = "//div[@class='column-manager-actions']/a")
    public WebElement selectAll;

    @FindBy(xpath = "//*[@class='column-manager-filter']/a[1]")
    public WebElement All;

    @FindBy(xpath = "//*[@class='column-manager-filter']/a[2]")
    public WebElement Selected;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//th[starts-with(@class,'grid-cell grid-header-cell grid-header-cell')]/a/span[1]")
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

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li")
    public List<WebElement> dataOnTheManageFilters;

    @FindBy(xpath = "//span[@class='filter-items']/div/div[1]")
    public List<WebElement> filterItems;

    @FindBy(xpath = "//*[@class='filter-start']/input")
    public WebElement equalsInput;

    @FindBy(xpath = "//*[@id='OdometerValue']/..//button")
    public WebElement updateButton;

    @FindBy(xpath = "//div[@class='no-data']/span")
    public WebElement noDataAlert;

    @FindBy(css = "input[name='custom_entity_type[OdometerValue]']")
    public WebElement odometerValue;

    @FindBy(css = ".datepicker-input.hasDatepicker")
    public WebElement dateInput;

    @FindBy(css = ".btn.btn-medium.add-btn")
    public WebElement addButton;

    @FindBy(css = ".ui-dialog-title")
    public WebElement selectCarreserv;

    @FindBy(css = ".user-name")
    public WebElement pageTitle;

    @FindBy(css = ".alert.alert-success.fade.top-messages")
    public WebElement entitySavedMessage;

    @FindBy(css = ".validation-failed")
    public WebElement odometerValueMessage;

    @FindBy(css = ".validation-failed")
    public WebElement dateNotValid;

    @FindBy(css = "//td[contains(text(),'123456')]/preceding-sibling::td/input[@type='checkbox']")
    public WebElement plate;

    @FindBy(css = ".btn.btn-primary")
    public WebElement selectButton;

    @FindBy(css = ".extra-info")
    public WebElement selectedPlate;

    @FindBy(className = "oro-subtitle")
    public WebElement vehiclesOdometersTitle;

    public WebElement verifyPlate(String plateNo){

        return Driver.get().findElement(By.cssSelector("a[title='"+plateNo+"']"));
    }



    public void clickTheButton(String buttonTitle){
        WebElement element;
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

        if (buttonTitle.toLowerCase().equals("activity refresh")){
            new VehicleCostPage().activityRefresh.click();
        }else {
            try {
                 element = Driver.get().findElement(By.xpath("//*[@title='" + buttonTitle + "']"));
                jse.executeScript("arguments[0].scrollIntoView(true);",element);
                element.click();

            } catch (Exception e) {
                 element = Driver.get().findElement(By.xpath("//*[contains(text(),'" + buttonTitle + "')]"));
                jse.executeScript("arguments[0].scrollIntoView(true);",element);
                element.click();
            }
        }
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
            switch (buttonName.toLowerCase()) {
                case "selected":
                    return Selected;
                case "all":
                    return All;
                case "select all":
                    return selectAll;
                case "x":
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

    public void chooseOdometerValueDropDown(String data){
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(Driver.get().findElement(By.xpath("//button[@class='btn dropdown-toggle']"))).click().perform();
        Driver.get().findElement(By.xpath("(//span//ul[@class='dropdown-menu'])[1]/li/a[.='"+data.toLowerCase()+"']")).click();
    }

    public List<WebElement> getTheDataBaseOnTheMainTableHeaders(){
        return Driver.get().findElements(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']//td[2]"));
    }

    public List<WebElement> getNamesOfTheDataBasedOnTheWindow(String windowName){
        switch (windowName.toLowerCase()){
            case "grid settings":
                return namesOfTheDataOnTheGridSettings;
            case "manage filters":
                return namesOfTheDataOnTheManageFilters;
            default:
                System.out.println("Invalid window name | getNamesOfTheDataOnTheBasedOnTheWindow method");
                return null;
        }
    }

}

