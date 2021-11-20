package com.myjira.pages;

import com.myjira.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteraandSearchPage extends BasePage {
    public void compareDataList() {

        List<WebElement> allKeys = Driver.get().findElements(By.xpath("//div[@class='main-ui-filter-sidebar-item']"));
        List<String> actualKeyList = new ArrayList<>();
        List<String> expectedKeyList = new ArrayList<>(Arrays.asList("WORK","FAVORITES",
                "MY ACTIVITY", "ANNOUNCEMENTS", "WORKFLOWS"));

        for (WebElement key : allKeys) {
            String key1 = key.getText();
            System.out.println("key = " + key1);
            actualKeyList.add(key1);
        }

        Assert.assertEquals(actualKeyList, expectedKeyList, "check key list");
    }
}