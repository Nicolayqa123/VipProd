package Regression;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MailUS extends WebDriverSettings {
    private By mailUS = By.xpath("/html/body/div[2]/div/div/ul/li[8]");

    @Test
    public void mail() throws Exception {
        driver.get("https://writer.urgentpapers.org");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(login1).click();
        driver.findElement(username1).sendKeys("Nicolayqa@gmail.com");
        driver.findElement(passworf1).sendKeys("nicolayqa");
        driver.findElement(loginButton1).click();
        TimeUnit.SECONDS.sleep(8);
        driver.findElement(mailUS).click();
        TimeUnit.SECONDS.sleep(2);
        Select dropdown = new Select(driver.findElement(By.id("subjectSelect")));
        dropdown.selectByValue("other");
        driver.findElement(sendMailUs).click();
        assertEquals("Please specify your subject", driver.findElement(By.xpath("//*[@id=\"contactUsForm\"]/div[2]/div/div/span")).getText());
    }
}
