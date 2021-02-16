package com.translantik.pages;

import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }

    public void loginAsAStoreManager(){
        userName.sendKeys(ConfigurationReader.get("storemanager_username"));
        password.sendKeys(ConfigurationReader.get("storemanager_password"));
        submit.click();

    }
    public void loginAsASalesManager(){
        userName.sendKeys(ConfigurationReader.get("salesmanager_username"));
        password.sendKeys(ConfigurationReader.get("salesmanager_password"));
        submit.click();
    }
    public void loginAsATruckDriver(){
        userName.sendKeys(ConfigurationReader.get("driver_username"));
        password.sendKeys(ConfigurationReader.get("driver_password"));
        submit.click();
    }

}
