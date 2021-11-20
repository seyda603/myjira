package com.myjira.stepdefinitions;

import com.myjira.pages.TypePage;
import com.myjira.utilities.BrowserUtils;
import com.myjira.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SelectingoneormoreTypeStepDef {
    @Then("the user enter select button")
    public void the_user_enter_select_button() {
        BrowserUtils.waitFor(2);
        TypePage typePage = new TypePage();
        typePage.type.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user should see thirteen item")
    public void the_user_should_see_thirteen_item(List<String> expectedkey) {
        BrowserUtils.waitFor(2);
        System.out.println(expectedkey);
        List<String> actualKeyList = new ArrayList<>();
        List<WebElement> allKeys = Driver.get().findElements(By.xpath("//div[@class='main-ui-select-inner-label']"));
        for (WebElement key : allKeys) {
            String key1 = key.getText();
            System.out.println("key = " + key1);
            actualKeyList.add(key1);
        }
        Assert.assertEquals(expectedkey, actualKeyList);
        BrowserUtils.waitFor(2);
    }

    @Then("the user select one or more")
    public void the_user_select_one_or_more() {
        BrowserUtils.waitFor(2);
        TypePage typePage = new TypePage();
        typePage.posts.click();
        BrowserUtils.waitFor(2);
       // Assert.assertTrue(typePage.posts.isSelected());

    }

}
