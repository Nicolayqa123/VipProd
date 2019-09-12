package com.vipwriters.Payments;

import com.PageWriter.Transactions;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PaymentsSearchTest extends WebDriverSettings {

    @Test
    public void search () throws Exception {
        WritersLogin();
        Transactions.transactions(driver).click();
        Transactions.search(driver).sendKeys("38998");
        assertEquals("34372", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[4]")).getText());

    }
}
