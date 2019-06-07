package com.vipwriters.available;

import com.PageWriter.AvailableOrders;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class AvailableDownloadFiles extends WebDriverSettings {
@Test
    public void download () throws Exception {
        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        AvailableOrders.searchOrder(driver).sendKeys("10004");
    AvailableOrders.orderAvailable(driver).click();
//    DetailedOrder.downloadFile(driver).click();
    TimeUnit.SECONDS.sleep(4);
driver.findElementById("2193").click();

    }
}
