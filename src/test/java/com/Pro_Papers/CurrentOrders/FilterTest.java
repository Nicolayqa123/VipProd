package com.Pro_Papers.CurrentOrders;

import com.vipwriters.WebDriverSettings;;
import org.apache.velocity.tools.generic.LoopTool;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FilterTest extends WebDriverSettings {

    @Test
    public void Filter1 () throws Exception {
        LoginPap();

        String order1 = driver.findElementByCssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)").getText();
        assertEquals(order1, driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)")).getText());
        driver.findElementByCssSelector("th.case").click();
        assertFalse(order1.contains("10273"));
    }

}
