package com.Pro_Papers.Profile;

import com.PageClient.Page;
import com.PageClient.Profile;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ChangesPasswordTest extends WebDriverSettings {
    @Test
    public void ChangePassNic() throws Exception {
        LoginPap();

        Page.Profile(driver).click();
        Profile.Change_password(driver).click();
        Profile.Current_password(driver).sendKeys("123456");
        Profile.New_password(driver).sendKeys("1234567");
        Profile.Repeat_password(driver).sendKeys("1234567");
        TimeUnit.SECONDS.sleep(2);
        Profile.Button_change_password(driver).click();

        TimeUnit.SECONDS.sleep(2);

      //  Page.Current_Orders(driver).click();
      //  Profile.Change_password(driver).click();
        Profile.Change_password(driver).click();
        Profile.Current_password(driver).sendKeys("1234567");
        Profile.New_password(driver).sendKeys("123456");
        Profile.Repeat_password(driver).sendKeys("123456");
        TimeUnit.SECONDS.sleep(2);
        Profile.Button_change_password(driver).click();


        TimeUnit.SECONDS.sleep(2);

        //Page.Current_Orders(driver).click();
        //Page.Profile(driver).click();
        Profile.Change_password(driver).click();
        Profile.Current_password(driver).sendKeys("1");
        Profile.New_password(driver).sendKeys("1");
        Profile.Repeat_password(driver).sendKeys("1");
        TimeUnit.SECONDS.sleep(2);
        Profile.Button_change_password(driver).click();
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Something wrong", driver.findElement(By.cssSelector("label.text-danger")).getText());

    }


}
