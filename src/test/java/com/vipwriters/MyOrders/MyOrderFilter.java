package com.vipwriters.MyOrders;

import com.PageWriter.MyOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MyOrderFilter extends WebDriverSettings {

    public void Filter3 () throws Exception {
       WritersLogin();
        TimeUnit.SECONDS.sleep(5);
        MyOrders.myOrders(driver).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        String order = driver.findElementByXPath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr[29]/td[1]/a").getText();
        String price = driver.findElementByXPath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr[8]/td[2]").getText();

        MyOrders.filterOrderId(driver).click();
        assertEquals(order, driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[1]")).getText());

        MyOrders.filterPrice(driver).click();
        assertEquals(price, driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[2]")).getText());
    }
}
