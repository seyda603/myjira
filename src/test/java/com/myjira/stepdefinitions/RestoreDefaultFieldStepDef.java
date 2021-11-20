package com.myjira.stepdefinitions;

import com.myjira.pages.RestorePage;
import com.myjira.utilities.BrowserUtils;
import com.myjira.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RestoreDefaultFieldStepDef {
    @Then("the user should see four fields")
    public void the_user_should_see_four_fields(List<String> expected) {
        BrowserUtils.waitFor(2);
        List<String> actualKeyList = new ArrayList<>();
        List<WebElement> allKeys = Driver.get().findElements(By.xpath("//span[@class='main-ui-control-field-label']"));
        for (WebElement key : allKeys) {
            String key1 = key.getText();
            System.out.println("key = " + key1);
            actualKeyList.add(key1);
        }
        BrowserUtils.waitFor(2);
        Assert.assertEquals(expected,actualKeyList);
        BrowserUtils.waitFor(2);
    }

    @Then("the user enter add any field")
    public void the_user_enter_add_any_field() {
        RestorePage restorePage=new RestorePage();
        restorePage.addfields.click();
        BrowserUtils.waitFor(2);
        restorePage.favorite.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user click restore default fields")
    public void the_user_click_restore_default_fields() {
       BrowserUtils.waitFor(2);
       RestorePage restorePage=new RestorePage();
       restorePage.restoredefault.click();
        BrowserUtils.waitFor(2);

    }


}
