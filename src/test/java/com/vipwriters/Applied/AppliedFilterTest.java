package com.vipwriters.Applied;

import com.PageWriter.AppliedOrders;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AppliedFilterTest extends WebDriverSettings {
@Test
    public void Filter () throws Exception {

    WritersLogin();
    TimeUnit.SECONDS.sleep(8);
    AppliedOrders.appliedOrders(driver).click();
    TimeUnit.SECONDS.sleep(2);
    AppliedOrders.filterOrderId(driver).click();
    AppliedOrders.filterOrderId(driver).click();
    TimeUnit.SECONDS.sleep(2);
    assertEquals("10475", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/a")).getText());

    AppliedOrders.filterPrice(driver).click();
    AppliedOrders.filterPrice(driver).click();
    assertEquals("609.75", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]")).getText());
    }



    }

