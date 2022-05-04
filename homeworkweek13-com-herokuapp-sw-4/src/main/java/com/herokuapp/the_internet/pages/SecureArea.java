package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class SecureArea extends Utility {
    By varifyText=By.xpath("//h2[contains(text(),' Secure Area')]");



    public String varifyText(){
      return getTextFromElement(varifyText);
    }


}
