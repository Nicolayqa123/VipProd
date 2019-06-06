package com.vipwriters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class OnlineForm extends WebDriverSettings {

    public void OnlineForm1 () {
        driver.get("https://writer.urgentpapers.org");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        username.sendKeys(mail);
        password.sendKeys(pass);
        loginButton.click();
        try {
            TimeUnit.SECONDS.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"file366\"]/div[3]/span/a").click();

        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().sendKeys("nico");
        /*
        driver.findElementByXPath("//*[@id=\"prechat0Field\"]").sendKeys("Bob");
        driver.findElementByXPath("//*[@id=\"prechat1Field\"]").sendKeys("bob@gmail.com");
        driver.findElementByXPath("//*[@id=\"prechat2Field\"]").sendKeys("456123");
        driver.findElementByXPath("//*[@id=\"prechat3Field\"]").sendKeys("Hellou");
        driver.findElementByXPath("//*[@id=\"formSubmit\"]").click();
  */
    }
}
