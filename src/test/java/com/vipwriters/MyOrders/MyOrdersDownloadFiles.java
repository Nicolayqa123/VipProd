package com.vipwriters.MyOrders;

import com.PageWriter.AppliedOrders;
import com.PageWriter.DetailedOrder;
import com.PageWriter.MyOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class MyOrdersDownloadFiles extends WebDriverSettings {
    @Test
    public void Download () throws Exception {
        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        MyOrders.myOrders(driver).click();
        MyOrders.OrderInProgress(driver).click();
        TimeUnit.SECONDS.sleep(2);
        DetailedOrder.downloadFile(driver).click();


    }
}
