package com.Pro_Papers;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RegisteredStep3 extends WebDriverSettings {

    private Random r = new Random();
    private int x = r.nextInt(20) + 1;
    private int y = r.nextInt(20) + 1;
    private int z = r.nextInt(20) + 1;
    private int a = r.nextInt(20) + 1;
    private int s = r.nextInt(9) + 1;



    @Test
    public void Step3Pay() throws Exception {


        RegisteredStep2();
        Select level = new Select(driver.findElement(By.name("academic_level")));
        level.selectByIndex(2);
        driver.findElement(oNSteps3NumberOfPages).sendKeys(x + "");
        driver.findElement(oNSteps3NumberOfProblem).sendKeys(y+"");
        driver.findElement(oNSteps3NumberOfQuestions).sendKeys(z + "");
        driver.findElement(oNSteps3NumberOfSlides).sendKeys(a+"");
        Select deadlines = new Select(driver.findElement(By.name("deadline")));
        deadlines.selectByIndex(s);
        driver.findElementByCssSelector("#payment-radio-2").click();
        driver.findElement(oNSteps3IAgree).click();
        driver.findElement(oNStep3Pay).click();

        TimeUnit.SECONDS.sleep(20);
      //  ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        TimeUnit.SECONDS.sleep(15);
        driver.findElementByXPath("//*[@id=\"loginSection\"]/div/div[2]").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("email").sendKeys("paul.shtefan-buyer@gmail.com");
        TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("//*[@id=\"splitEmail\"]/div[3]").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementByName("login_password").sendKeys("i2vBBwGuTlfboB9JwspQ");
        driver.findElementByName("btnLogin").click();
        TimeUnit.SECONDS.sleep(15);
        driver.findElementById("confirmButtonTop").click();
        TimeUnit.SECONDS.sleep(5);

    }
    @Test
    public void Step3NewOrder() throws Exception {


        RegisteredStep2();
        Select level = new Select(driver.findElement(By.name("academic_level")));
        level.selectByIndex(2);
        driver.findElement(oNSteps3NumberOfPages).sendKeys(x + "");
        driver.findElement(oNSteps3NumberOfProblem).sendKeys(y + "");
        driver.findElement(oNSteps3NumberOfQuestions).sendKeys(z + "");
        driver.findElement(oNSteps3NumberOfSlides).sendKeys(a + "");
        Select deadlines = new Select(driver.findElement(By.name("deadline")));
        deadlines.selectByIndex(s);
        driver.findElementByCssSelector("#payment-radio-2").click();
        driver.findElement(oNSteps3IAgree).click();
        driver.findElement(oNStep3Pay).click();
    }
    @Test
    public void Step3OrderWith6hoursPay() throws Exception {


        RegisteredStep2();
        Select level = new Select(driver.findElement(By.name("academic_level")));
        level.selectByIndex(2);
        driver.findElement(oNSteps3NumberOfPages).sendKeys(x + "2");
        driver.findElement(oNSteps3NumberOfProblem).sendKeys(y+"4");
        driver.findElement(oNSteps3NumberOfQuestions).sendKeys(z + "1");
        driver.findElement(oNSteps3NumberOfSlides).sendKeys(a+"3");
        Select deadlines = new Select(driver.findElement(By.name("deadline")));
        deadlines.selectByIndex(10);
        driver.findElementByCssSelector("#payment-radio-2").click();
        driver.findElement(oNSteps3IAgree).click();
        driver.findElement(oNStep3Pay).click();

        TimeUnit.SECONDS.sleep(20);
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        TimeUnit.SECONDS.sleep(15);
        driver.findElementByXPath("//*[@id=\"loginSection\"]/div/div[2]").click();
        TimeUnit.SECONDS.sleep(15);
        driver.findElementById("email").sendKeys("paul.shtefan-buyer@gmail.com");
        TimeUnit.SECONDS.sleep(15);
        driver.findElementByXPath("//*[@id=\"splitEmail\"]/div[3]").click();
        TimeUnit.SECONDS.sleep(15);
        driver.findElementByName("login_password").sendKeys("i2vBBwGuTlfboB9JwspQ");
        driver.findElementByName("btnLogin").click();
        TimeUnit.SECONDS.sleep(15);
        driver.findElementById("confirmButtonTop").click();
        }

        @Test
    public void RegisteredStep3Inquiry() throws Exception {


        LoginPap();
        driver.get("https://client.urgentpapers.org/my/new_inquiry");


        driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[2]/select/optgroup[1]/option[8]").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[3]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[3]/label[2]/select/optgroup[1]/option[4]").click();
        for (int i = 1; i <= 3; i++) {

            driver.findElement(oNSteps2Topic).sendKeys("as dfg hjkl");
            driver.findElement(oNsteps2PaperDetails).sendKeys(x+"");
            driver.findElement(oNsteps2PaperDetails).sendKeys("  ");
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElementByXPath("//*[@id=\"details\"]/div[9]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[9]/label[2]/select/option[3]").click();
        driver.findElement(oNSteps2NumberOfRef).sendKeys("2");
        driver.findElement(oNSteps3).click();

        Select level = new Select(driver.findElement(By.name("academic_level")));
        level.selectByIndex(2);
        driver.findElement(oNSteps3NumberOfPages).sendKeys(x + "2");
        driver.findElement(oNSteps3NumberOfProblem).sendKeys(y+"4");
        driver.findElement(oNSteps3NumberOfQuestions).sendKeys(z + "1");
        driver.findElement(oNSteps3NumberOfSlides).sendKeys(a+"3");
        Select deadlines = new Select(driver.findElement(By.name("deadline")));
        deadlines.selectByIndex(s);
        driver.findElementByCssSelector("#payment-radio-2").click();
        driver.findElement(oNSteps3IAgree).click();
        driver.findElement(oNStep3Pay).click();

    }
}
