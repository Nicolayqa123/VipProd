package com.vipwriters.MyOrders;

import com.PageWriter.MyOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MyOrderDetailedOrderViewTest extends WebDriverSettings {
    @Test
    public void orderView () throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(2);
        MyOrders.myOrders(driver).click();
        MyOrders.OrderInProgress(driver).click();
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/h2/span")).getText());
    }
}
