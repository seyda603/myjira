package com.myjira.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePage extends BasePage{
    @FindBy(xpath = "//div[@class='main-ui-control main-ui-select']")
    public WebElement date;
    @FindBy(xpath = "//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button  main-ui-filter-find']")
    public WebElement search;
    @FindBy(xpath = "//span[@class='main-ui-select-name']")
    public WebElement anyday;
}
