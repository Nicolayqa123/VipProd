package com.vipwriters.Applied;

import com.PageWriter.AppliedOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AppliedDetailedOrderView extends WebDriverSettings {
    @Test
    public void order () throws Exception {

       // WritersLogin();
        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        AppliedOrders.appliedOrders(driver).click();
        AppliedOrders.orderApplied(driver).click();
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Writer applied", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/h2/span")).getText());

    }
}
