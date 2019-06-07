package com.vipwriters.Applied;

import com.PageWriter.AppliedOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AppliedDetailedOrderViewTest extends WebDriverSettings {
    @Test
    public void order () throws Exception {

        WritersLogin();
            TimeUnit.SECONDS.sleep(8);
        AppliedOrders.appliedOrders(driver).click();
        AppliedOrders.order10354(driver).click();
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Writer applied", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/h2/span")).getText());

    }
}
