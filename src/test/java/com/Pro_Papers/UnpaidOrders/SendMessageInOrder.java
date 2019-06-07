package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettings;
import com.vipwriters.WebDriverSettingsChrome;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SendMessageInOrder extends WebDriverSettings {

    @Test
    public void SendMessageInOrder1 () throws Exception {

        LoginPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 4350);");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a").click();
        jse.executeScript("scroll(0, 1050);");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/a").click();




        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(addNewMessage).click();
        driver.findElement(aNMWriter).click();
        driver.findElement(aNMText).sendKeys("test");
        driver.findElement(aNMSendMessage).click();
        TimeUnit.SECONDS.sleep(4);

    }

    public void SendMessageInOrderMax () throws Exception {
        LoginPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 4350);");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a").click();
        jse.executeScript("scroll(0, 1050);");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/a").click();


        ;

        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(addNewMessage).click();
        driver.findElement(aNMWriter).click();
        driver.findElement(aNMText).sendKeys("TestTestT estTes tTestTest TestTes tTestTestT estTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTest\" +\n" +
                "                \"TestTestTestTestTestTestTestTestT estTestTestTestTestTestTestTestTestTestTe stTestTestTestT estTestTestTestTe stTestTestTestTestTestTestTestTest\" +\n" +
                "                \"TestTestTestTestTest TestTestTestTes tTestTestTestTe stTestTes tTestTestTe stTestTestTestTes tTestTestTestTes tTestTestTestTest\" +\n" +
                "                \"TestTestTest TestTestT estTestTestT estTestTes tTestTestTestTestT estT estTes tTestTestTestTe stTestTestTestTestTestTestTestTestTestTestTestTestTest\" +\n" +
                "                \"TestTestTestTestTes tTestTestTestTe stTestTestTest TestTestTestTestT estTest TestTestTestTestTe tTestTestTestTestTestTestTestTestTestTest");
        driver.findElement(aNMSendMessage).click();

    }
    @Test
    public void SendMessageInOrderMin () throws Exception {
        LoginPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 4350);");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a").click();
        jse.executeScript("scroll(0, 1050);");
        TimeUnit.SECONDS.sleep(4);
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/a").click();



        ;
        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(addNewMessage).click();
        driver.findElement(aNMWriter).click();
        driver.findElement(aNMText).sendKeys("1");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(aNMSendMessage).click();

    }
}
