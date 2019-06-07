package com.Pro_Papers.PreviousOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class PayToOrder extends WebDriverSettings {
    @Test
    public void orderPay () throws Exception {
        LoginPap();
        driver.findElement(previousOrders).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -350);");
        driver.findElement(order10272).click();
        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(4);
        String pay = driver.findElementByXPath("//*[@id=\"collapseThree\"]/div/div/button").getText();
        System.out.println(pay);
    }
}
