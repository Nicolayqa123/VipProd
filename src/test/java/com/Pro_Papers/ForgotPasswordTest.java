package com.Pro_Papers;

import com.PageClient.Lending;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ForgotPasswordTest extends WebDriverSettings {
    @Test
    public void forgotPassword1() throws InterruptedException {
        driver.get("https://client.urgentpapers.org/");

        Lending.login(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.mail(driver).sendKeys("test@test.ru");
        Lending.resetpassword(driver).click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("We’ve sent you an email containing a link that will allow you to reset your password for the next 24 hours.", driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/div[2]/div/div/div[3]/p[1]")).getText());

    }
    @Test
    public void forgotPasswordWrongmail() throws InterruptedException {
        driver.get("https://client.urgentpapers.org/");

        Lending.login(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.mail(driver).sendKeys("test@456.ru");
        Lending.resetpassword(driver).click();
        TimeUnit.SECONDS.sleep(3);
        assertFalse( driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/div[2]/div/div/div[3]/p[1]")).getText().contains("We’ve sent you an email containing a link that will allow you to reset your password for the next 24 hours."));

    }
    @Test
    public void forgotPasswordNoValid() throws InterruptedException {
        driver.get("https://client.urgentpapers.org/");

        Lending.login(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.mail(driver).sendKeys("test@@@.ru");
        Lending.resetpassword(driver).click();
        TimeUnit.SECONDS.sleep(3);
        assertFalse( driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/div[2]/div/div/div[3]/p[1]")).getText().contains("We’ve sent you an email containing a link that will allow you to reset your password for the next 24 hours."));

    }
}
