package com.myjira.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {



    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passWord;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@id='LIVEFEED_search']")
    public WebElement filterandsearchbox;

    public void login(String username,String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        loginBtn.click();
    }




}
