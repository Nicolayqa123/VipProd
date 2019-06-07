package com.vipwriters.available;

import com.PageWriter.AvailableOrders;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class AvailableDownloadFilesTest extends WebDriverSettings {
@Test
    public void download () throws Exception {
        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        AvailableOrders.searchOrder(driver).sendKeys("10004");
    AvailableOrders.order10004(driver).click();
//    DetailedOrder.downloadFile(driver).click();
    TimeUnit.SECONDS.sleep(4);
driver.findElementById("2193").click();

    }
}
