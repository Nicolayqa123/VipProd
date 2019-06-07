package com.vipwriters.Payments;

import com.PageWriter.Transactions;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PaymentsReasonTest extends WebDriverSettings {
    @Test
    public void reaso () throws Exception {
       // WritersLogin();
        WritersLogin();
        TimeUnit.SECONDS.sleep(1);
        Transactions.transactions(driver).click();
        Select reason = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/select")));
        reason.selectByValue("Earn");
        assertEquals("Earn", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[3]")).getText());

        reason.selectByValue("Cancell");
        assertEquals("Cancell", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[3]")).getText());



    }
}
