package com.myjira.stepdefinitions;

import com.myjira.pages.DatePage;
import com.myjira.utilities.BrowserUtils;
import com.myjira.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SearchbyselectingDateStepDef {

    @Then("the user enter date")
    public void the_user_enter_date() {
        BrowserUtils.waitFor(3);
        DatePage datePage=new DatePage();
        datePage.date.click();
    }

    @Then("the user should see fourteen item")
    public void the_user_should_see_item(List<String> expectedkey) {

        BrowserUtils.waitFor(2);
        List<String> actualKeyList = new ArrayList<>();
        WebElement element = Driver.get().findElement(By.xpath("(//div[@data-items])[1]"));
        String attribute = element.getAttribute("data-items");
        for (int i = 0; i < expectedkey.size(); i++) {
            Assert.assertTrue("is not contain",attribute.contains(expectedkey.get(i)));
        }

    }

    @Then("the user select anyone")
    public void the_user_select_anyone() {
       DatePage datePage=new DatePage();
       datePage.anyday.click();

    }

    @Then("the user click search")
    public void the_user_click_search() {
        DatePage datePage=new DatePage();
        datePage.search.click();

    }

}
