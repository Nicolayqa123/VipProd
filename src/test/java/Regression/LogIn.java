package Regression;

import com.vipwriters.WebDriverSettings;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LogIn extends WebDriverSettings {

    String username = "Kallyan2@ya.ru";
    String password = "Password123";


    public void jk () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(login1).click();
        driver.findElement(username1).sendKeys("1");
        driver.findElement(passworf1).sendKeys("1");
        driver.findElement(loginButton1).click();
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Please enter a correct username and password.", driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/div[2]")).getText());


    }
}

