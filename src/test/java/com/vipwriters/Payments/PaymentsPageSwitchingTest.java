package com.vipwriters.Payments;

import com.PageWriter.DetailedOrder;
import com.PageWriter.Transactions;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PaymentsPageSwitchingTest extends WebDriverSettings {
    @Test
    public void ppswitching10 () throws Exception {
        WritersLogin();
        TimeUnit.SECONDS.sleep(3);
        Transactions.transactions(driver).click();
        Transactions.showEntries10(driver).click();
        Transactions.page2(driver).click();
        Transactions.page3(driver).click();
    }
    /*
    public void ppswitching25 () throws Exception {
        WritersLogin();
        TimeUnit.SECONDS.sleep(3);
        Transactions.transactions(driver).click();
        Transactions.showEntries25(driver).click();
        Transactions.page2(driver).click();

    }*/
}
