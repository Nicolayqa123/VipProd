package com.vipwriters.Applied;

import com.PageWriter.AppliedOrders;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class AppliedDownloadFilesTest extends WebDriverSettings {

    @Test
    public void download() throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        AppliedOrders.appliedOrders(driver).click();
        AppliedOrders.order10354(driver).click();
        TimeUnit.SECONDS.sleep(2);
        DetailedOrder.downloadFile(driver).click();
        TimeUnit.SECONDS.sleep(2);
    }
}