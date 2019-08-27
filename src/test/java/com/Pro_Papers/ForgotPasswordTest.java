package com.Pro_Papers;

import com.PageClient.Lending;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ForgotPasswordTest extends WebDriverSettings {
    @Test
    public void forgotPassword1() throws InterruptedException {
        driver.get(ProPapers_ProdUrl);

        Lending.login(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.mail(driver).sendKeys(mailPro);
        Lending.resetpassword(driver).click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("We’ve sent you an email containing a link that will allow you to reset your password for the next 24 hours.",
                driver.findElement(By.cssSelector("p.text-center:nth-child(1)")).getText());

    }
    @Test
    public void forgotPasswordWrongmail() throws InterruptedException {
        driver.get(ProPapers_ProdUrl);

        Lending.login(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.mail(driver).sendKeys("test@456.ru");
        Lending.resetpassword(driver).click();
        TimeUnit.SECONDS.sleep(3);
        assertFalse( driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div[2]/p[1]")).getText().contains("We’ve sent you an email containing a link that will allow you to reset your password for the next 24 hours."));

    }
    @Test
    public void forgotPasswordNoValid() throws InterruptedException {
        driver.get(ProPapers_ProdUrl);

        Lending.login(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.mail(driver).sendKeys("test@@@.ru");
        Lending.resetpassword(driver).click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("User not found!", driver.findElement(By.id("toast-container")).getText());
      //  assertFalse( driver.findElement(By.id("toast-container")).getText().contains("User not found!"));



    }
}
