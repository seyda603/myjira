package com.myjira.stepdefinitions;

import com.myjira.pages.FilteraandSearchPage;
import com.myjira.pages.LoginPage;
import com.myjira.utilities.BrowserUtils;
import com.myjira.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FilterandsearchstepDef {
    @Given("The user login as a human source")
    public void the_user_login_as_a_human_source() {
        BrowserUtils.waitFor(2);
        new Loginstepdef().the_user_is_on_the_login_page();
        new Loginstepdef().the_user_enters_the_human_source_information();

    }
    @When("the user navigates to Filter and Search box")
    public void the_user_navigates_to() {
        LoginPage loginPage=new LoginPage();
        loginPage.filterandsearchbox.click();

    }

    @Then("the title contains type")
    public void the_title_contains(List<String> expectedkey) {
        BrowserUtils.waitFor(2);
        List<String> actualKeyList = new ArrayList<>();
        List<WebElement> allKeys = Driver.get().findElements(By.xpath("//div[@class='main-ui-filter-sidebar-item']"));
        for (WebElement key : allKeys) {
            String key1 = key.getText();
            System.out.println("key = " + key1);
            actualKeyList.add(key1);
        }
        Assert.assertEquals(expectedkey,actualKeyList);
BrowserUtils.waitFor(2);
    }







}
