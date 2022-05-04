package com.herokuapp.the_internet.testbase.testsuite;


import com.herokuapp.the_internet.pages.LogInPage;

import com.herokuapp.the_internet.pages.SecureArea;
import com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
    LogInPage logInPage = new LogInPage();
    SecureArea secureArea = new SecureArea();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        logInPage.sendUserName("tomsmith");
        logInPage.sendpasswordText("SuperSecretPassword!");
        logInPage.clickOnLoginButton();
        secureArea.varifyText();

    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        logInPage.sendUserName("tomsmith1");
        logInPage.sendpasswordText("SuperSecretPassword!");
        logInPage.clickOnLoginButton();
        String expectedMessage = "Your username is invalid!\n" +
                "×";
        String actualMessage =logInPage.usernameerrorMessage();
        Assert.assertEquals(actualMessage,expectedMessage, "User is valid");


    }
    @Test
    public void verifyThePasswordErrorMessage(){
       logInPage.sendUserName("tomsmith");
        logInPage.sendpasswordText("SuperSecretPassword");
        logInPage.clickOnLoginButton();
        String expectedMessage = "Your password is invalid!\n" +
                "×";
        String actualMessage =logInPage.usernameerrorMessage();
        Assert.assertEquals(actualMessage,expectedMessage, "password is valid");


    }


}




