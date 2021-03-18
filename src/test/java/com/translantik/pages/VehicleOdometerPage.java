package com.translantik.pages;

import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @FindBy(css = "i.fa-eye.hide-text")
    public WebElement view;

    @FindBy(css = "td.string-cell.grid-cell.grid-body-cell.grid-body-cell-Driver")
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

    @FindBy(xpath = "//*[contains(text(),'Edit')]/i")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='btn-group pull-right']/button")
    public WebElement saveAndCloseButton;


    public WebElement getWindow(String windowName) {

        switch (windowName.toLowerCase()) {
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

    public WebElement getTextBox(String windowName) {
        switch (windowName.toLowerCase()) {
            case "grid settings":
                return gridSettingsTextBox;
            case "manage filters":
                return manageFiltersTextBox;
            default:
                System.out.println("Invalid window name to get window text-box !!!");
                return null;
        }
    }

    public WebElement findElementWithExactText(String exactText) {
        return Driver.get().findElement(By.xpath("//*[text()='" + exactText + "']"));
    }

    public WebElement getGridSettingsButton(String buttonName) {
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

    public WebElement getGridSettingsCheckBoxes(String filterName) {

        return Driver.get().findElement(By.xpath("(//table)[2]//td/label[.='" + filterName + "']/../../td[3]/input"));
    }

    public WebElement getManageFiltersCheckBoxes(String filterName) {
        BrowserUtils.waitFor(1);
        return Driver.get().findElement(By.xpath("//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']//*[@title='" + filterName + "']//input"));
    }

    public WebElement getFirstOdometer() {
        return Driver.get().findElement(By.xpath("(//tbody[@class='grid-body']/tr)[1]"));
    }

    public List<WebElement> getNamesOfTheDataOnTheGridSettings() {
        List<WebElement> dataOnWindow = new ArrayList<>();
        for (WebElement names : namesOfTheDataOnTheGridSettings) {
            if (names.isDisplayed()) {
                dataOnWindow.add(names);
            }
        }
        return dataOnWindow;
    }

    public List<WebElement> getTheDataBaseOnTheMainTableHeaders() {
        return Driver.get().findElements(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']//td[2]"));
    }

    public List<WebElement> getNamesOfTheDataBasedOnTheWindow(String windowName) {
        switch (windowName.toLowerCase()) {
            case "grid settings":
                return namesOfTheDataOnTheGridSettings;
            case "manage filters":
                return namesOfTheDataOnTheManageFilters;
            default:
                System.out.println("Invalid window name | getNamesOfTheDataOnTheBasedOnTheWindow method");
                return null;
        }
    }

    public Map<String, String> getSpecificVehicleOdInformation() {
        Map<String, String> data = new HashMap<>();

        BrowserUtils.waitFor(1);
        data.put("Odometer Value", Driver.get().findElement(By.xpath("//*[@class='control-group control-group-number']//input")).getAttribute("value"));
        BrowserUtils.waitFor(1);

        data.put("Date", Driver.get().findElement(By.xpath("(//*[@class='responsive-cell responsive-cell-no-blocks']//input)[3]")).getAttribute("value"));
        BrowserUtils.waitFor(1);

        data.put("Driver", Driver.get().findElement(By.xpath("(//*[@class='responsive-cell responsive-cell-no-blocks']//input)[4]")).getAttribute("value"));
        BrowserUtils.waitFor(1);

        data.put("Unit", Driver.get().findElement(By.xpath("(//*[@class='select2-choice']/span)[1]")).getText());


        return data;


    }

    public void setVehicleOdometerEditBoxes(String header, String newValue) {
        switch (header) {
            case "Odometer Value":
                Driver.get().findElement(By.xpath("//*[@class='control-group control-group-number']//input")).clear();
                Driver.get().findElement(By.xpath("//*[@class='control-group control-group-number']//input")).sendKeys(newValue);
                break;
            case "Date":
                Driver.get().findElement(By.xpath("(//*[@class='responsive-cell responsive-cell-no-blocks']//input)[3]")).clear();
                Driver.get().findElement(By.xpath("(//*[@class='responsive-cell responsive-cell-no-blocks']//input)[3]")).sendKeys(newValue + Keys.ESCAPE);

                break;
            case "Driver":
                Driver.get().findElement(By.xpath("(//*[@class='responsive-cell responsive-cell-no-blocks']//input)[4]")).clear();
                Driver.get().findElement(By.xpath("(//*[@class='responsive-cell responsive-cell-no-blocks']//input)[4]")).sendKeys(newValue);
                break;
            case "Unit":
                Driver.get().findElement(By.xpath("(//*[@class='select2-choice']/span)[1]")).click();
                Driver.get().findElement(By.xpath("(//*[@class='select2-results'])[2]//div[.='" + newValue + "']")).click();
                break;
            case "Model":
                Driver.get().findElement(By.xpath("//*[@class='select2-container select2 oro-select2']")).click();
                Driver.get().findElement(By.xpath("//*[@class='select2-search']")).sendKeys(newValue);
                break;
            default:
                System.out.println("Invalid input from -> setVehicleOdometerEditBoxes");
                break;
        }
    }

    public void chooseOdometerValueDropDown(String data) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(Driver.get().findElement(By.xpath("//button[@class='btn dropdown-toggle']"))).click().perform();
        Driver.get().findElement(By.xpath("(//span//ul[@class='dropdown-menu'])[1]/li/a[.='" + data.toLowerCase() + "']")).click();
    }

    public void clickTheButton(String buttonTitle) {
        WebElement element;
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

        if (buttonTitle.toLowerCase().equals("activity refresh")) {
            new VehicleCostPage().activityRefresh.click();
        } else {
            try {
                element = Driver.get().findElement(By.xpath("//*[@title='" + buttonTitle + "']"));
                jse.executeScript("arguments[0].scrollIntoView(true);", element);
                element.click();

            } catch (Exception e) {
                element = Driver.get().findElement(By.xpath("//*[contains(text(),'" + buttonTitle + "')]"));
                jse.executeScript("arguments[0].scrollIntoView(true);", element);
                element.click();
            }
        }
    }


}

