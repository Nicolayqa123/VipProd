package com.vipwriters.Profile;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ProfileEnterAlternativeEmail extends WebDriverSettings {
    @Test
    public void email () {
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
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/input")).sendKeys("123qwe12qwe@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tfoot/tr/td/button[1]")).click();

    }
    @Test
    public void emailMax () {
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
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/input")).sendKeys("123q4df5s4fs4dfsf4ds56d4fs5d4fsad4fs45dfs4dfsa4df@ds5f4sd5f4sf45ds54fads5f4asf45af4saf45sf4dgmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tfoot/tr/td/button[1]")).click();

    }
    @Test
    public void emailMin () {
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
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/input")).sendKeys("a@gl.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tfoot/tr/td/button[1]")).click();

    }
    @Test
    public void phoneMax () {
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
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/input")).sendKeys("123qwe12qwe@gmail.com");
        driver.findElementByXPath("//*[@id=\"alterPhone\"]").sendKeys("50123456789");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tfoot/tr/td/button[1]")).click();

    }
    @Test
    public void phoneMin () {
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
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/input")).sendKeys("123qwe12qwe@gmail.com");
        driver.findElementByXPath("//*[@id=\"alterPhone\"]").sendKeys("5");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tfoot/tr/td/button[1]")).click();

    }
    @Test
    public void emailNoValid () {
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
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/input")).sendKeys("123qwe12qwe@@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tfoot/tr/td/button[1]")).click();
        assertEquals("Please enter a valid email address", driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/span")).getText());
    }
    @Test
    public void phoneNoValid () {
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
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/div/input")).sendKeys("123qwe12qwe@gmail.com");
        driver.findElementByXPath("//*[@id=\"alterPhone\"]").sendKeys("qwertyu");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tfoot/tr/td/button[1]")).click();
        assertEquals("Please enter a valid phone #", driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/div/div[2]/div/div[2]/table/tbody/tr[8]/td[2]/div[2]")).getText());
    }
}
