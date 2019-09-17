package com.Pro_Papers;

import com.PageClient.Lending;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ForgotPasswordTest extends WebDriverSettings {
    public void forgotPassword1() throws InterruptedException {
        driver.get(ProPapers_ProdUrl);

        Lending.login(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.mail(driver).sendKeys(mailPro);
        Lending.resetpassword(driver).click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("Please check your spam folder if the email doesn't appear within a few minutes.",
                driver.findElement(By.cssSelector("#success-reset > div.modal-body.grey-input-wrapper > p:nth-child(2)")).getText());

    }
    @Test
    public void forgotPasswordWrongmail() throws InterruptedException {
        driver.get(ProPapers_ProdUrl);

        Lending.login(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.mail(driver).sendKeys("test@456.ru");
        Lending.resetpassword(driver).click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("User not found!", driver.findElement(By.id("toast-container")).getText());


    }
    public void forgotPasswordNoValid() throws InterruptedException {
        driver.get(ProPapers_ProdUrl);

        Lending.login(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.mail(driver).sendKeys("test@@@.ru");
        Lending.resetpassword(driver).click();
        TimeUnit.SECONDS.sleep(3);
      //  assertFalse( driver.findElement(By.id("toast-container")).getText().contains("User not found!"));



    }
}
