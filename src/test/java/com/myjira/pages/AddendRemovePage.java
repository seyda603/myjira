package com.myjira.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddendRemovePage extends BasePage{
    @FindBy (xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement Added;
}
