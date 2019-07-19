package com.vipwriters.available;

import com.PageWriter.AvailableOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AvailablePageSwitching extends WebDriverSettings {
    @Test
    public  void pageSwitch10 () throws Exception{
       WritersLogin();
       TimeUnit.SECONDS.sleep(6);
        AvailableOrders.showEntries10(driver).click();
        AvailableOrders.page2(driver).click();
        AvailableOrders.page3(driver).click();
       }

    public  void pageSwitch25 () throws Exception{
        WritersLogin();
        TimeUnit.SECONDS.sleep(6);
        AvailableOrders.showEntries25(driver).click();
        AvailableOrders.page2(driver).click();

    }
}
