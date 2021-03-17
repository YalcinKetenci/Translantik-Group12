package com.translantik.pages;

import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> tableCosts;

    @FindBy(xpath = "//select[@class='filter-select-oro no-input-widget']")
    public WebElement dateRangeSelect;

    @FindBy(xpath = "//button[@class='btn btn-primary filter-update']")
    public WebElement dateRangeUpdateButton;

    @FindBy(xpath = "(//div[@class='dropdown datefilter']/input)[1]")
    public WebElement laterThanTextBox;

    @FindBy(xpath = "//h5[@class='user-fieldset']/../div")
    public List<WebElement> generalInformations;

    @FindBy(xpath = "//div[@class='items list-box list-shaped']/div/div/div/a/..")
    public List<WebElement> activities;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr")
    public List<WebElement> additionalInformations;

    @FindBy(xpath = "//li[@class='pagination-next']/a")
    public WebElement olderButton;

    @FindBy(xpath = "//li[@class='pagination-next']/a")
    public WebElement newerButton;

    @FindBy(xpath = "//div[@class='actions-panel pull-right']/a")
    public WebElement activityRefresh;

    @FindBy(xpath = "(//i[@class='fa-chevron-left hide-text'])[3]")
    public WebElement attachmentsPreviousPage;

    @FindBy(xpath = "(//i[@class='fa-chevron-right hide-text'])[3]")
    public WebElement attachmentsNextPage;

    @FindBy(xpath = "//tbody[@class='ui-sortable']//td[3]/input")
    public List<WebElement> vcGridSettingCheckBoxes;

    @FindBy(xpath = "//div[@class='dropdown-menu']")
    public WebElement gridSettingsWindow;

    @FindBy(xpath = "//*[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']")
    public WebElement manageFiltersWindow;

    @FindBy(xpath = "(//table)[2]/tbody/tr/td[1]/label")
    public List<WebElement> namesOfTheDataOnTheGridSettings;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li/label/span")
    public List<WebElement> namesOfTheDataOnTheManageFilters;



    //by alpekin
    @FindBy(xpath = "//div[@id='sidebar-right']/button[@class='sidebar__add-widget']")
    public WebElement plusIcon;
    //by alpekin
    @FindBy(xpath = "//div/div/h3")
    public WebElement windowTitle;
    //by alpekin
    @FindBy(css = ".btn.cancel")
    public WebElement closeButton;
    //by alpekin
    @FindBy(css = ".btn.minimize-button")
    public WebElement pinIcon;
    //by alpekin
    @FindBy(css = ".btn.minimize-button.gold-icon")
    public WebElement goldIcon;
    //by alpekin
    @FindBy(css = ".btn.favorite-button")
    public WebElement starIcon;
    //by alpekin
    @FindBy(css = ".btn.favorite-button.gold-icon")
    public WebElement goldStar;
    //by alpekin
    @FindBy(css = ".fa-bars")
    public WebElement faBars;
    //by alpekin
    @FindBy(css = "#favorite-tab")
    public WebElement favTab;
    //by alpekin
    @FindBy(css = " div#favorite-content a")
    public WebElement favContent;
    //by alpekin
    @FindBy(xpath = "//div[@id='pinbar']/div[@class='list-bar']/ul//a")
    public WebElement pinBar;


    public SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d,yyyy");

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

    //by Harun cloned from Yalcin
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
    //by Harun cloned from Yalcin
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

    //by Harun
    public String click_page_group_number(String data) {


        new VehicleCostPage().scrollToElementWithJS(btn_group_open);
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
    //by Harun
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

    public WebElement getVehicleCostsInformationTable(String informationTabName){
        return Driver.get().findElement(By.xpath("//h4[.='"+informationTabName+"']/..//div[@class='form-horizontal']"));
    }

    public Map<String,String> getActivitiesInformations(int rowNumber){
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(activities.get(rowNumber-1)).pause(200).click().perform();
        //activities.get(rowNumber-1).click();

        List<WebElement> forCount = Driver.get().findElements(By.xpath("(//div[starts-with(@id,'accordion-item')])["+rowNumber+"]//div[@class='control-group attribute-row']"));
        Map<String,String> activity = new HashMap<>();
        for (int i = 1; i <=forCount.size() ; i++) {
            System.out.print(Driver.get().findElement(By.xpath("((//div[starts-with(@id,'accordion-item')])["+rowNumber+"]//div[@class='control-group attribute-row']/label)["+i+"]")).getText());
            System.out.print(" : "+Driver.get().findElement(By.xpath("((//div[starts-with(@id,'accordion-item')])["+rowNumber+"]//div[@class='controls']/div)["+i+"]")).getText());
            activity.put(Driver.get().findElement(By.xpath("((//div[starts-with(@id,'accordion-item')])["+rowNumber+"]//div[@class='control-group attribute-row']/label)["+i+"]")).getText(),Driver.get().findElement(By.xpath("((//div[starts-with(@id,'accordion-item')])["+rowNumber+"]//div[@class='controls']/div)["+i+"]")).getText());
        }



        return activity;
    }

    public void clickOlderOrNewer(String buttonName){
        Actions actions = new Actions(Driver.get());
        switch (buttonName.toLowerCase()) {
            case "older":
                actions.moveToElement(olderButton).click(olderButton).perform();
                break;
            case "newer":
                actions.moveToElement(newerButton).click(newerButton).perform();
                break;
            default:
                System.out.println("Invalid Button Name");
        }

    }

    public void triggerAttachmentsPage(String nextOrPrevious){
        switch (nextOrPrevious.toLowerCase()){
            case "next page":
                attachmentsNextPage.click();
                break;
            case "previous page":
                attachmentsPreviousPage.click();
                break;
            default:
                System.out.println("Invalid Input | from triggerAttachmentsPage method");
        }
    }
    //by alpekin
    public WebElement addButton(String widgetName){
        String buttonLocation="//strong[.='"+widgetName+"']//..//../td[4]";
        return Driver.get().findElement(By.xpath(buttonLocation));
    }
    //by alpekin
    public WebElement addedMessage(String widget){
        String messageLocation= "//strong[.='"+widget+"']//../span";
        return Driver.get().findElement(By.xpath(messageLocation));
    }
    //by alpekin
    public WebElement visibleIcon(String iconName){
        String iconLocation= ".sidebar-widget__icon > i[title='"+iconName+"']";
        return Driver.get().findElement(By.cssSelector(iconLocation));
    }
}

