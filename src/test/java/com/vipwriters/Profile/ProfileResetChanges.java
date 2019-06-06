package com.vipwriters.Profile;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ProfileResetChanges extends WebDriverSettings {
    @Test
    public void rch() {
        driver.get("https://writer.urgentpapers.org");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement login =  driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[2]/input"));
        WebElement password =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[3]/input"));
        WebElement loginButton =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[4]/input"));


        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        username.sendKeys("nicolayqa@gmail.com");
        password.sendKeys("nicolayqa");
        loginButton.click();
        try {
            TimeUnit.SECONDS.sleep(11);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[4]/a")).click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/input")).sendKeys("45632178965");

       driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tfoot/tr/td/button[2]")).click();

    }
}
