package com.vipwriters.Payments;

import com.PageWriter.Transactions;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PaymentsReasonTest extends WebDriverSettings {
    @Test
    public void reaso () throws Exception {
        WritersLogin();
        TimeUnit.SECONDS.sleep(3);
        Transactions.transactions(driver).click();
        Transactions.reasonEarn(driver).click();
        assertEquals("Earn", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[3]")).getText());

        Transactions.reasonCancell(driver).click();
        assertEquals("Cancell", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[3]")).getText());



    }
}
