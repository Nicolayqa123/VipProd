package com.Pro_Papers.Profile;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ChangesPassword extends WebDriverSettings {
    @Test
    public void ChangePassNic() throws Exception {
        LoginPap();

        driver.findElement(profile).click();
        driver.findElement(profileChangePassword).click();
        driver.findElement(profileChPCurrentPassword).sendKeys("nicolay");
        driver.findElement(profileChPNewPassword).sendKeys("nicolay1");
        driver.findElement(profileChPRepeatNewPassword).sendKeys("nicolay1");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(profileChPButton).click();

        TimeUnit.SECONDS.sleep(4);

        driver.findElement(profile).click();
        driver.findElement(profileChangePassword).click();
        driver.findElement(profileChPCurrentPassword).sendKeys("nicolay1");
        driver.findElement(profileChPNewPassword).sendKeys("nicolay");
        driver.findElement(profileChPRepeatNewPassword).sendKeys("nicolay");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(profileChPButton).click();

        TimeUnit.SECONDS.sleep(4);

        driver.findElement(profile).click();
        driver.findElement(profileChangePassword).click();
        driver.findElement(profileChPCurrentPassword).sendKeys("nicolay1");
        driver.findElement(profileChPNewPassword).sendKeys("1");
        driver.findElement(profileChPRepeatNewPassword).sendKeys("1");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(profileChPButton).click();
            TimeUnit.SECONDS.sleep(4);
        assertEquals("SomethingWrong", driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/form/div/div[4]/p/label")).getText());

    }


}
