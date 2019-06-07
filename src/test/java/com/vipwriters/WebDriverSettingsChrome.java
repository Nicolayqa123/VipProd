package com.vipwriters;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class WebDriverSettingsChrome {



  // public FirefoxDriver driver;
    public ChromeDriver driver;
//  public InternetExplorerDriver driver;
  //  @FindBy(xpath = ("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"))
  //  public WebElement password;

  //  @FindBy(xpath= ("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"))
  //  public WebElement login;


   // String mail = "nicolayqa@gmail.com";
   // String pass = "nicolayqa";

   public String mail = "gennadii2@test.com";
   public String pass = "Password1";



    @Before
    public void setup()  {

          System.setProperty("webdriver.gecko.driver", "C://Programms/geckodriver.exe");
       //  driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C://Programms/chromedriver.exe");
        driver = new ChromeDriver();
         System.setProperty("webdriver.ie.driver", "C://Programms/IEDriverServer.exe");
      // driver = new InternetExplorerDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }
    @After
    public void close(){
        driver.quit();

    }
    public void WritersLogin()throws Exception {
        driver.get("https://writer.urgentpapers.org");

        WebElement login =  driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[2]/input"));
        WebElement password =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[3]/input"));
        WebElement loginButton =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[4]/input"));

        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        username.sendKeys(mail);
        password.sendKeys(pass);
        loginButton.click();


//  public WebDriverSettings(WebDriver driver) {


    }

    public void LoginPap()  {
        driver.get("https://commentality.com");
        driver.manage().window().maximize();


        driver.findElement(loginClient).click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(loginClientUserName).sendKeys("nicolaychiuri@gmail.com");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(loginClientPassword).sendKeys("nicolay");
        driver.findElement(loginClientSubmit).click();
    }



    @FindBy(xpath = "//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a")
    public WebElement login;

    @FindBy(css = ".input__user")
    public WebElement loginUserName;

    @FindBy(css = ".input__key")
    public WebElement loginPassword;

    @FindBy(css = ".btn")
    public WebElement loginSubmit;

    public By loginClient = By.cssSelector("button.green:nth-child(2)");
    public By loginClientUserName = By.id("login-email");
    public By loginClientPassword = By.id("login-password");
    public By loginClientSubmit = By.id("button-login");



}
//*[@id="message342"]/div[3]/div[2]/p/text()