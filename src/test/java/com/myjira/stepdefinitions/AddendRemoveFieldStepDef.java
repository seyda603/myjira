package com.myjira.stepdefinitions;

import com.myjira.pages.AddendRemovePage;
import com.myjira.pages.LoginPage;
import com.myjira.utilities.BrowserUtils;
import com.myjira.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AddendRemoveFieldStepDef {

    LoginPage loginPage=new LoginPage();
    @Then("the user enter add field")
    public void the_user_enter_add_field() {
        BrowserUtils.waitFor(2);
        AddendRemovePage addendRemovePage =new AddendRemovePage();
        addendRemovePage.Added.click();
    }

    @Then("the user should see seven item")
    public void the_user_should_see_seven_item(List<String> expected) {
        BrowserUtils.waitFor(2);
        List<String> actualKeyList = new ArrayList<>();
        List<WebElement> allKeys = Driver.get().findElements(By.xpath("//div[@class='main-ui-select-inner-label']"));
       for (WebElement key : allKeys) {
           String key1 = key.getText();
           System.out.println("key = " + key1);
            actualKeyList.add(key1);
        }
       Assert.assertEquals(expected,actualKeyList);

    }

    @Then("the user add and remove")
    public void the_user_add_and_remove() {
        List<WebElement> allKeys = Driver.get().findElements(By.xpath("//div[@class='main-ui-select-inner-label']"));
        for (WebElement key : allKeys) {
            Boolean key1 = key.isSelected();
            System.out.println("key = " + key1);
        }
    }

}
