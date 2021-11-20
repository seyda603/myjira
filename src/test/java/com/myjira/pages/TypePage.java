package com.myjira.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TypePage extends BasePage{
    @FindBy(xpath = "//div[@class='main-ui-control main-ui-multi-select']")
    public WebElement type;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label']")
    public WebElement posts;

    @FindBy(xpath = " //span[@class='main-ui-square-item']")
    public WebElement polls;
}
