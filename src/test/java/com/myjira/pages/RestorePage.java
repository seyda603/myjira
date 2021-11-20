package com.myjira.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestorePage extends BasePage {
    @FindBy(xpath = "//span[@class='main-ui-control-field-label']")
    public WebElement defaultfield;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addfields;

    @FindBy(xpath = "//div[@class='main-ui-filter-field-list-item main-ui-select-inner-item'][1]")
    public WebElement favorite;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoredefault;
}
