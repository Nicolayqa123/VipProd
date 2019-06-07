package com.Pro_Papers;

import com.PageClient.DetailedOrder;
import com.PageClient.Registered;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class RegisteredTest extends WebDriverSettings {

    Random r = new Random();
    int x = r.nextInt(10000) + 1;

    public String regmail = x + "test@test.com";
    public String regpass = "123456";


    @Test
    public void Registered1() throws InterruptedException {
        driver.get("https://client.urgentpapers.org");

        TimeUnit.SECONDS.sleep(6);
      //  driver.findElementByXPath("//*[@id=\"endChat\"]").click();
      //  DetailedOrder.endChat(driver).click();
        driver.findElement(orderNow).click();
        driver.findElement(oNFirstName).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(oNFirstName).sendKeys("Testtest");
        driver.findElement(oNLastName).sendKeys("tes");
        driver.findElement(oNMail).sendKeys(regmail);
        driver.findElement(onConfirmMail).sendKeys(regmail);
        driver.findElement(oNPassword).sendKeys(regpass);
        driver.findElement(oNComfPassword).sendKeys(regpass);
        driver.findElement(oNPhone).sendKeys("501244" + x);
        jse.executeScript("scroll(0, 550);");
        TimeUnit.SECONDS.sleep(10);
        driver.findElement(oNStep2).click();
        TimeUnit.SECONDS.sleep(5);
        assertEquals("ORDER FORM", driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/h3")).getText());
    }

    @Test
    public void RegisteredMin() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://client.urgentpapers.org");

        TimeUnit.SECONDS.sleep(6);
        driver.findElement(orderNow).click();
        driver.findElement(oNFirstName).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(oNFirstName).sendKeys("T");
        driver.findElement(oNLastName).sendKeys("t");
        driver.findElement(oNMail).sendKeys(regmail);
        driver.findElement(onConfirmMail).sendKeys(regmail);
        driver.findElement(oNPassword).sendKeys(regpass);
        driver.findElement(oNComfPassword).sendKeys(regpass);
        driver.findElement(oNPhone).sendKeys("501244" + x);
        TimeUnit.SECONDS.sleep(5);
      //  driver.findElementById("endChat").click();
        Registered.onStep2(driver).click();

        TimeUnit.SECONDS.sleep(5);
        assertEquals("ORDER FORM", driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/h3")).getText());
    }
    @Test
    public void RegisteredMax() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://client.urgentpapers.org");

        TimeUnit.SECONDS.sleep(6);
        driver.findElement(orderNow).click();
        driver.findElement(oNFirstName).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(oNFirstName).sendKeys("TesttestTesttestTesttestTesttest");
        driver.findElement(oNLastName).sendKeys("tesTesttestTesttestTesttest");
        driver.findElement(oNMail).sendKeys(regmail);
        driver.findElement(onConfirmMail).sendKeys(regmail);
        driver.findElement(oNPassword).sendKeys(regpass);
        driver.findElement(oNComfPassword).sendKeys(regpass);
        driver.findElement(oNPhone).sendKeys("501244" + x);
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(oNStep2).click();
        TimeUnit.SECONDS.sleep(5);
        assertEquals("ORDER FORM", driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/h3")).getText());
    }

    public void RegisteredNoValid() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://client.urgentpapers.org");


        driver.findElement(orderNow).click();
        driver.findElement(oNFirstName).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(oNFirstName).sendKeys("1");
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Please enter valid first name", driver.findElement(By.cssSelector("#customer > div:nth-child(1) > div:nth-child(2) > span:nth-child(2)")).getText());
        driver.findElement(oNLastName).sendKeys("1");
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Please enter valid last name", driver.findElement(By.xpath("#customer > div:nth-child(2) > div:nth-child(2) > span:nth-child(2)")).getText());
        driver.findElement(oNMail).sendKeys("1");
        assertEquals("Please enter valid email", driver.findElement(By.xpath("#customer > div:nth-child(3) > div:nth-child(2) > span:nth-child(2)")).getText());
        driver.findElement(onConfirmMail).sendKeys("1");
        assertEquals("Please enter valid email", driver.findElement(By.xpath("#customer > div:nth-child(4) > div:nth-child(2) > span:nth-child(2)")).getText());
        driver.findElement(oNPassword).sendKeys("1");
        assertEquals("Password must be at least 6 characters long.", driver.findElement(By.xpath("div.form-group:nth-child(5) > div:nth-child(2) > span:nth-child(2)")).getText());
        driver.findElement(oNComfPassword).sendKeys("1");
        assertEquals("Password must be at least 6 characters long.", driver.findElement(By.xpath("div.form-group:nth-child(6) > div:nth-child(2) > span:nth-child(2)")).getText());
        driver.findElement(oNPhone).sendKeys("545665");
        assertEquals("We need your valid phone number to make your account secure.", driver.findElement(By.xpath("span.help-block:nth-child(3)")).getText());
        driver.findElement(oNStep2).click();

        assertEquals("ORDER FORM", driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/h3")).getText());

    }
    }
