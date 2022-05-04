package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class LogInPage extends Utility {
       By userName= By.xpath("//input[@id='username']");
       By passwordField= By.xpath("//input[@id='password']");
       By logInButton=By.xpath("//button[@class='radius']");
       By usernameerrorMsg=By.xpath("//div[@id='flash']");
       By passworderrorMsg=By.xpath("//div[@id='flash']");
       ////div[@id='flash']
    ////div[@id='flash']
      public void  sendUserName(String email){
          sendTextToElement(userName,email);
      }
      public void sendpasswordText(String password){
         sendTextToElement(passwordField,password);
      }
      public void clickOnLoginButton(){
          clickOnElement(logInButton);
      }
    public String usernameerrorMessage(){
        return getTextFromElement(usernameerrorMsg);
    }
    public String passworderrorMessage(){
          return getTextFromElement(passworderrorMsg);
    }
}
