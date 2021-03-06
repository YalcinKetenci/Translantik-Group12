package com.translantik.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleInformationPage extends BasePage{

    @FindBy(className = "user-name")
    public WebElement driverName;

    @FindBy(xpath = "//a[@title='Add attachment']")
    public WebElement addAttachmentButton;

    @FindBy(css = "span.ui-dialog-title")
    public WebElement titleAddAttachment;

    @FindBy(css = "div.uploader.input-widget-file")
    public WebElement chooseFile;

    @FindBy(css = "button.btn.btn-primary")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='pull-right title-buttons-container']/div[2]/div/button[@type='submit']")
    public WebElement saveAndClose;

//    public String filetxt= "C:\\Users\\Asus\\Desktop\\translantik.txt";

//    public String filePath(){
//        String filetxt= "C:\\Users\\Asus\\Desktop\\translantik.txt";
//        return filetxt;
//    }
}
