package com.support;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Verification extends WebDriverSettings{

    Random r = new Random();
    int x = r.nextInt(10000) + 1;

    public String regmail = x + "test@test.com";
    public String regpass = "Password123";


    @Test
    public void VerificationClient () {

        driver.get("https://writer.urgentpapers.org/signUp/aboutMe");
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByCssSelector("div.row-fluid:nth-child(1) > div:nth-child(1) > input:nth-child(2)").sendKeys("Nicoas");
        driver.findElementByCssSelector("div.col-lg-6:nth-child(2) > input:nth-child(2)").sendKeys("test");
        driver.findElementByCssSelector("div.row-fluid:nth-child(2) > div:nth-child(1) > input:nth-child(2)").click();
        driver.findElementByCssSelector("div.row-fluid:nth-child(2) > div:nth-child(1) > input:nth-child(2)").sendKeys("england");
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[3]/div/span[1]/input").click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"aboutMe\"]").sendKeys("test test test test");
        driver.findElementByCssSelector("a.btn-red").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByCssSelector("a.btn-red").click();

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        jse.executeScript("window.scrollBy(0,-250)", "");

        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[1]/div[1]/input").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[1]/div[1]/input").sendKeys(regmail);
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[1]/div[2]/input").sendKeys(regmail);
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[2]/div[1]/input").sendKeys("Oslo");
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[2]/div[2]/span/input").sendKeys("Ukraine");
        driver.findElementByXPath("//*[@id=\"primaryPhone\"]").sendKeys("501245478");
        driver.findElementByXPath("//*[@id=\"alterPhone\"]").sendKeys("501245422");
        jse.executeScript("scroll(0, 250);");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[4]/div/span/input[1]").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/ul/li[3]/a").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"s2id_disciplines\"]/ul").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[1]").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"s2id_disciplines\"]/ul").click();
        driver.findElementByXPath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[3]").click();
        //*[@id="select2-drop"]/ul/li[1]/ul/li[1]

        //*[@id="select2-result-label-841"]
        //*[@id="select2-result-label-842"]
        //*[@id="select2-result-label-843"]
        driver.findElementByXPath("//*[@id=\"s2id_disciplines\"]/ul").click();
        driver.findElementByXPath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[2]").click();
        driver.findElementByXPath("//*[@id=\"s2id_disciplines\"]/ul").click();
        driver.findElementByXPath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[4]").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[2]/div/input").sendKeys("Cultura");
        jse.executeScript("scroll(0, 350);");
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[3]/div/div/input[1]").click();
        driver.findElementByXPath("//*[@id=\"citationStyles\"]/li[1]/input").click();
        driver.findElementByXPath("//*[@id=\"academicDegree\"]").click();
        driver.findElementByXPath("//*[@id=\"academicDegree\"]/option[4]").click();


        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/ul/li[3]/a").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByCssSelector("div.row-fluid:nth-child(1) > div:nth-child(1) > input:nth-child(2)").click();
        driver.findElementByCssSelector("div.row-fluid:nth-child(1) > div:nth-child(1) > input:nth-child(2)").sendKeys(regmail);

        driver.findElementByName("newpass").click();
        driver.findElementByName("newpass").sendKeys(regpass);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByName("rePassword").click();
        driver.findElementByName("rePassword").sendKeys(regpass);
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div/div[1]/div[4]/div/input").click();

        driver.findElementByXPath("//*[@id=\"learnedFrom\"]/li[1]/input").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/ul/li[2]/a").click();

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.get("https://support.vip-writers.commentality.com/signIn?returnTo=%2Fwriters%2F10251");
        driver.findElementByXPath("//*[@id=\"signinForm\"]/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("//*[@id=\"signinForm\"]/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("//*[@id=\"signinForm\"]/div/div[4]/button").click();

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"left-panel\"]/nav/ul/li[7]/ul/li[2]/a/span[1]").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByLinkText("All").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(regmail);
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr/td[3]/div[2]/button").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByLinkText("All").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(regmail);
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr/td[4]/div[2]/button").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByLinkText("All").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(regmail);
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr/td[5]/div[3]/button").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByLinkText("All").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(regmail);
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr/td[6]/div[3]/button").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByLinkText("All").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(regmail);
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr/td[7]/div[2]/button").click();

//*[@id="availableOrders"]/tbody/tr/td[4]/div[2]/button

    }
}
