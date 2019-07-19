package com.Pro_Papers.PreviousOrders;

import com.PageClient.Page;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilterTest extends WebDriverSettings {
    @Test
    public void Filter1 () throws Exception {
        LoginPap();
        TimeUnit.SECONDS.sleep(4);

        Page.Previous_Orders(driver).click();
        TimeUnit.SECONDS.sleep(10);
        String order1 = driver.findElementByCssSelector("tr.odd:nth-child(1) > td:nth-child(1) > a:nth-child(2)").getText();
        driver.findElementByCssSelector(".case").click();
        String order2 = driver.findElementByCssSelector("tr.odd:nth-child(1) > td:nth-child(1) > a:nth-child(2)").getText();

        assertTrue(order1 != order2);

    }
}
