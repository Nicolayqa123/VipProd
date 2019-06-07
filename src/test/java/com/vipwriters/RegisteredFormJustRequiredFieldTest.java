package com.vipwriters;

import com.PageWriter.SignUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class RegisteredFormJustRequiredFieldTest extends WebDriverSettings {

    Random r = new Random();
    int x = r.nextInt(10000) + 1;
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char letter = abc.charAt(r.nextInt(abc.length()));

    public String regmail = x + "test@test.com";
    public String regpass = "123456";




    @Test
    public void RegisteredFormJustRequiredField1() throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/signUp");
        TimeUnit.SECONDS.sleep(3);


        SignUp.firsName(driver).sendKeys(names);
        SignUp.lastName(driver).sendKeys(lastName);
        SignUp.language(driver).sendKeys("england");
        SignUp.genderMale(driver).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        TimeUnit.SECONDS.sleep(3);
        SignUp.next(driver).click();

        TimeUnit.SECONDS.sleep(2);

        SignUp.primaryEmail(driver).sendKeys(regmail);
        SignUp.cityName(driver).sendKeys("Ukraine");
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[2]/div[2]/span").click();
        driver.findElementByXPath("/html/body/span/span/span[1]/input").sendKeys("Ukraine");
        driver.findElementByXPath("/html/body/span/span/span[2]").click();
        SignUp.phone(driver).sendKeys("50124" + x);
        jse.executeScript("scroll(0, 250);");
        TimeUnit.SECONDS.sleep(2);
        SignUp.next(driver).click();

        TimeUnit.SECONDS.sleep(5);


        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Art");
        driver.findElementByXPath("/html/body/span/span/span").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Culture");
        driver.findElementByXPath("/html/body/span/span/span").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Music");
        driver.findElementByXPath("/html/body/span/span/span").click();
        SignUp.specialization(driver).sendKeys("Test");
        SignUp.styles(driver).click();
        SignUp.academicDegree(driver).click();
        jse.executeScript("scroll(0, 250);");
        SignUp.next(driver).click();

        TimeUnit.SECONDS.sleep(2);

        SignUp.newpass(driver).sendKeys(regpass);
        SignUp.rePassword(driver).sendKeys(regpass);
        SignUp.iHaveRead(driver).click();
        jse.executeScript("scroll(0, 250);");
        SignUp.finish(driver).click();
        TimeUnit.SECONDS.sleep(15);
        assertEquals("Email", driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/p")).getText());

    }

    @Test
    public void RegisteredFormAll() throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/signUp/aboutMe");

        SignUp.firsName(driver).sendKeys("Nicolay");
        SignUp.lastName(driver).sendKeys("QAtest");
        SignUp.language(driver).sendKeys("england");
        SignUp.aboutMe(driver).sendKeys("test test Test 123123");
        SignUp.genderMale(driver).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        TimeUnit.SECONDS.sleep(3);
        SignUp.next(driver).click();

        TimeUnit.SECONDS.sleep(2);

        SignUp.primaryEmail(driver).sendKeys(regmail);
        SignUp.altEmail(driver).sendKeys(regmail);
        SignUp.cityName(driver).sendKeys("Ukraine");
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[2]/div[2]/span").click();
        driver.findElementByXPath("/html/body/span/span/span[1]/input").sendKeys("Ukraine");
        driver.findElementByXPath("/html/body/span/span/span[2]").click();
        SignUp.phone(driver).sendKeys("50124" + x);
        SignUp.altPhone(driver).sendKeys("50454" + x);
        jse.executeScript("scroll(0, 250);");
        TimeUnit.SECONDS.sleep(2);
        SignUp.next(driver).click();

        TimeUnit.SECONDS.sleep(5);

        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Art");
        driver.findElementByXPath("/html/body/span/span/span").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Culture");
        driver.findElementByXPath("/html/body/span/span/span").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Music");
        driver.findElementByXPath("/html/body/span/span/span").click();
        SignUp.specialization(driver).sendKeys("Test");
        SignUp.styles(driver).click();
        SignUp.academicDegree(driver).click();
        jse.executeScript("scroll(0, 250);");
        SignUp.next(driver).click();

        TimeUnit.SECONDS.sleep(2);

        SignUp.newpass(driver).sendKeys(regpass);
        SignUp.rePassword(driver).sendKeys(regpass);
        SignUp.iHaveRead(driver).click();
        jse.executeScript("scroll(0, 250);");
        SignUp.finish(driver).click();
        TimeUnit.SECONDS.sleep(15);
       // assertEquals("Email", driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/p")).getText());
        assertEquals("Email", driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/p")).getText());
    }
}



