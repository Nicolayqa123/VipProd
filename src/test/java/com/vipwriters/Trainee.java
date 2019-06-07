package com.vipwriters;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Trainee extends WebDriverSettings {





    /*private WebElement signUp = driver.findElementByXPath("/html/body/div/div/div/div[1]/header/div/div[2]/nav/ul/li[11]/a");
    private WebElement firstName = driver.findElementByName("firstName");
    private WebElement lastName = driver.findElementByName("lastName");
    private WebElement language = driver.findElementByName("languageSpoken");
    private WebElement gender = driver.findElementByCssSelector("div.row-fluid:nth-child(3) > div:nth-child(1) > span:nth-child(2) > label:nth-child(1) > input:nth-child(1)");
    private WebElement next = driver.findElementByClassName("btn btn-red");

*/
    /*DesiredCapabilities capability = DesiredCapabilities.firefox();
    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);*/

    public Trainee() throws MalformedURLException {
    }

   /* @Test
    public void Te4st () throws Exception{

        driver.get("https://writer.urgentpapers.org");
        TimeUnit.SECONDS.sleep(5);
        signUp.click();
        firstName.sendKeys(letter + "");
        lastName.sendKeys("test2");
        language.sendKeys("Russian");
        gender.click();
        next.click();
    }
*/

    @Test
    public void asddsa455() throws Exception {
             driver.get("https://pro-papers.com");
    }

    @Test
    public void LoginPapTest() throws Exception {
        driver.get("https://client.urgentpapers.org/");

        driver.findElement(loginClient).click();
        driver.findElement(loginClientUserName).sendKeys("nicolaychiuri@gmail.com");
        driver.findElement(loginClientPassword).sendKeys("nicolay");
        driver.findElement(loginClientSubmit).click();
        TimeUnit.SECONDS.sleep(10);
    }








   /* @FindBy(xpath = "//*[@id=\"wrapper\"]")
    WebElement contacteUs;


    Random r = new Random();
    int x = r.nextInt(1000) + 1;



    public void contacte() throws InterruptedException {

        driver.get("https://writer.urgentpapers.org");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        contacteUs.click();


    }



    public void OnlineForm123 () {
        driver.get("https://writer.urgentpapers.org");

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
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.id("tawkchat-status-message"));
        builder.moveToElement(element).build().perform();


    //      driver.findElementByXPath("//*[@id=\"tawkchat-minified-link-container\"]").click();

  //      driver.findElementByXPath("//*[@id=\"prechat0Field\"]").sendKeys("Bob");
  //      driver.findElementByXPath("//*[@id=\"prechat1Field\"]").sendKeys("bob@gmail.com");
  //      driver.findElementByXPath("//*[@id=\"prechat2Field\"]").sendKeys("456123");
  //      driver.findElementByXPath("//*[@id=\"prechat3Field\"]").sendKeys("Hellou");
  //      driver.findElementByXPath("//*[@id=\"formSubmit\"]").click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 250);");

    }

    public void OnlineForm155555 () {
        driver.get("https://writer.urgentpapers.org");

        login.click();
        loginUserName.sendKeys(mail);
        loginPassword.sendKeys(pass);
        loginSubmit.click();

    }


*/




}










