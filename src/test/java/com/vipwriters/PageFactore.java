package com.vipwriters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactore {
      public PageFactore(WebDriver driver) {

          PageFactory.initElements(driver, this);
      }

    @FindBy(xpath = "//*[@id=\"mm-0\"]/div[2]/div/div[1]/div/button[2]")
    public WebElement loginClient;

    @FindBy(xpath = "//*[@id=\"login-email\"]")
    public WebElement loginClientUserName;

    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[1]/div[2]/div/input")
    public WebElement loginClientPassword;

    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[1]/div[4]/div/button/span[1]")
    public WebElement loginClientSubmit;


}


