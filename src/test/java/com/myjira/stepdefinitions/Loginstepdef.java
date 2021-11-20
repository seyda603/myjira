package com.myjira.stepdefinitions;

import com.myjira.pages.LoginPage;
import com.myjira.utilities.BrowserUtils;
import com.myjira.utilities.ConfigurationReader;
import com.myjira.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Loginstepdef {
    @Given(":The user is on the login page")
    public void the_user_is_on_the_login_page() {
       String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When(":The user enters the human source information")
    public void the_user_enters_the_human_source_information() {
        BrowserUtils.waitFor(2);
        String username=ConfigurationReader.get("username1");
        BrowserUtils.waitFor(2);
        String password=ConfigurationReader.get("password1");
        BrowserUtils.waitFor(2);
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
        BrowserUtils.waitFor(2);
    }


   /* @When(":The user enters the helpdesk information")
    public void the_user_enters_the_helpdesk_information() {
        String username2=ConfigurationReader.get("username2");
        String password2=ConfigurationReader.get("password2");
        LoginPage loginPage=new LoginPage();
        loginPage.login(username2,password2);

    }

    @When(":The user enters the marketing information")
    public void the_user_enters_the_marketing_information() {
        String username3=ConfigurationReader.get("username3");
        String password3=ConfigurationReader.get("password3");
        LoginPage loginPage=new LoginPage();
        loginPage.login(username3,password3);

    }*/
    @Then(":The user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        //String actualTitle = Driver.get().getTitle();
       // Assert.assertEquals("(1) Portal",actualTitle);
    }



}
