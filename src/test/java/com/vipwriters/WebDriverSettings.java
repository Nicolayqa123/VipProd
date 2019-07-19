package com.vipwriters;

import com.PageWriter.Lending;
import com.PageWriter.SignUp;
import com.Screenshot;

import com.SeleniumRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

import io.qameta.allure.model.TestRunResult;
import junit.framework.TestResult;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.beans.Statement;
import java.io.File;
import java.io.IOException;
import io.qameta.allure.Attachment;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

//@RunWith(SeleniumRunner.class)
public class WebDriverSettings   {

   // public PhantomJSDriver driver;
  // public  RemoteWebDriver driver;

    public FirefoxDriver driver;

    //  public ChromeDriver driver;
//  public InternetExplorerDriver driver;
    //  @FindBy(xpath = ("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"))
    //  public WebElement password;

    //  @FindBy(xpath= ("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"))
    //  public WebElement login;


    // String mail = "nicolayqa@gmail.com";
    // String pass = "nicolayqa";


    public String mailPro = "Kallyan2@ya.ru";
    public String passPro = "123456";
    public String mail = "Kallyan2@ya.ru"; // Nicolayqa@gmail.com
    public String pass = "123456";
    public String Writer_StageUrl = "https://writer.urgentpapers.org";
    public String Writer_ProdUrl = "https://vip-writers.com";
    public String ProPapers_StageUrl = "https://client.urgentpapers.org/";
    public String ProPapers_ProdUrl = "https://pro-papers.com";





    /*@Rule
    public TestWatcher screenshotOnFailure = new TestWatcher() {

    };
*/


   /* @Rule
    public TestWatcher watcher = new TestWatcher() {

        @Override
        protected void starting(Description description) {
            System.setProperty("webdriver.gecko.driver", "C://Programms/geckodriver.exe");
            driver = new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", "C://Programms/chromedriver.exe");
            //  driver = new ChromeDriver();
            System.setProperty("webdriver.ie.driver", "C://Programms/IEDriverServer.exe");
            // driver = new InternetExplorerDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        }

        @Override
        protected void finished(Description description) {
            makeScreenshotOnFailure();
            driver.quit();
        }

        @Override
        protected void failed(Throwable e, Description description) {
            makeScreenshotOnFailure();
        }

        @Attachment("Screenshot on failure")
        public byte[] makeScreenshotOnFailure() {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        }

    };
*/








   /* private static WebDriver getFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver", "//src/main/resources/geckodriver");
        return new FirefoxDriver();
    }*/




    @Rule
    public TestWatcher watcher = new TestWatcher() {

        @Override
        protected void starting(Description description) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
            driver.manage().window().setSize(new Dimension(1500, 960));

        }

        @Override
        protected void finished(Description description) {
            driver.quit();
        }

        @Override
        protected void failed(Throwable e, Description description) {
            String newAutoTest = "TestFailure";
            File screenshot = ((TakesScreenshot) driver).
                    getScreenshotAs(OutputType.FILE);
            String path = "C:\\Programms\\GitHub\\VipWriter\\screenshot\\" + getClass() + screenshot.getName();
            try {
                FileUtils.copyFile(screenshot, new File(path));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }







    };



    Random r = new Random();
    int x = r.nextInt(90000) + 1;
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char letter = abc.charAt(r.nextInt(abc.length()));
    public void Screen() throws Exception {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("target\\surefire"+ scrFile.getName() +".png"));
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    protected byte[] saveAllureScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

    @Attachment(type = "image/png")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment
    public static byte[] getBytes(String resourceName) throws IOException {
        return Files.readAllBytes(Paths.get("src/main/resources", resourceName));
    }




    public void WritersLogin() throws Exception {
     //   TimeUnit.SECONDS.sleep(15);
        driver.get(Writer_ProdUrl);
        Lending.loginForm(driver).click();
        Lending.userName(driver).sendKeys(mail);
        Lending.password(driver).sendKeys(pass);
        Lending.loginButton(driver).click();
        TimeUnit.SECONDS.sleep(15);

    }
    public void TestFileDrop() throws Exception {
        setClipboardData("\\Test.docx");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        TimeUnit.SECONDS.sleep(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void WritersLoginNic() {
        driver.get("https://writer.urgentpapers.org");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        username.sendKeys("NicolayQa@gmail.com");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        password.sendKeys("nicolayqa");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginButton.click();
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
    public void RegisteredWriter() throws InterruptedException {

        Random r = new Random();
        int x = r.nextInt(1000) + 1;

        String regmail = x + "test@test.com";
        String regpass = "Password123";



            driver.get("https://writer.urgentpapers.org/signUp/aboutMe");

            SignUp.signUpForm(driver).click();
            SignUp.firsName(driver).sendKeys("Nicolay");
            SignUp.lastName(driver).sendKeys("QAtest");
            SignUp.language(driver).sendKeys("england");
            SignUp.genderMale(driver).click();
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0, 250);");
            TimeUnit.SECONDS.sleep(3);
            SignUp.next(driver).click();

            TimeUnit.SECONDS.sleep(2);

            SignUp.primaryEmail(driver).sendKeys(regmail);
            SignUp.cityName(driver).sendKeys("Ukraine");
            driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[2]/div[2]/span").click();
            driver.findElementByXPath("/html/body/span/span/span[1]/input").sendKeys("Ukraine");
            driver.findElementByXPath("/html/body/span/span/span[2]").click();
            SignUp.phone(driver).sendKeys("50124" + x);
            jse.executeScript("scroll(0, 250);");
            TimeUnit.SECONDS.sleep(2);
            SignUp.next(driver).click();

            TimeUnit.SECONDS.sleep(5);

            driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span").click();
            driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Art");
            driver.findElementByXPath("/html/body/span/span/span").click();
            driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Culture");
            driver.findElementByXPath("/html/body/span/span/span").click();
            driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Music");
            driver.findElementByXPath("/html/body/span/span/span").click();
            SignUp.specialization(driver).sendKeys("Test");
            SignUp.styles(driver).click();
            SignUp.academicDegree(driver).click();
            jse.executeScript("scroll(0, 250);");
            SignUp.next(driver).click();

            TimeUnit.SECONDS.sleep(2);

            SignUp.newpass(driver).sendKeys(regpass);
            SignUp.rePassword(driver).sendKeys(regpass);
            SignUp.iHaveRead(driver).click();
            jse.executeScript("scroll(0, 250);");
            SignUp.finish(driver).click();
            TimeUnit.SECONDS.sleep(7);


    }
    public void RegisteredRefWriter() throws InterruptedException {

        Random r = new Random();
        int x = r.nextInt(1000) + 1;

        String regmail = x + "test@test.com";
        String regpass = "Password123";



        driver.get("https://writer.urgentpapers.org/signUp?writer=10013");

        SignUp.firsName(driver).sendKeys("Nicolay");
        SignUp.lastName(driver).sendKeys("QAtest");
        SignUp.language(driver).sendKeys("england");
        SignUp.genderMale(driver).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        TimeUnit.SECONDS.sleep(3);
        SignUp.next(driver).click();

        TimeUnit.SECONDS.sleep(2);

        SignUp.primaryEmail(driver).sendKeys(regmail);
        SignUp.cityName(driver).sendKeys("Ukraine");
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[2]/div[2]/span").click();
        driver.findElementByXPath("/html/body/span/span/span[1]/input").sendKeys("Ukraine");
        driver.findElementByXPath("/html/body/span/span/span[2]").click();
        SignUp.phone(driver).sendKeys("50124" + x);
        jse.executeScript("scroll(0, 250);");
        TimeUnit.SECONDS.sleep(2);
        SignUp.next(driver).click();

        TimeUnit.SECONDS.sleep(5);

        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Art");
        driver.findElementByXPath("/html/body/span/span/span").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Culture");
        driver.findElementByXPath("/html/body/span/span/span").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[1]/div/span/span[1]/span/ul/li/input").sendKeys("Music");
        driver.findElementByXPath("/html/body/span/span/span").click();
        SignUp.specialization(driver).sendKeys("Test");
        SignUp.styles(driver).click();
        SignUp.academicDegree(driver).click();
        jse.executeScript("scroll(0, 250);");
        SignUp.next(driver).click();

        TimeUnit.SECONDS.sleep(2);

        SignUp.newpass(driver).sendKeys(regpass);
        SignUp.rePassword(driver).sendKeys(regpass);
        SignUp.iHaveRead(driver).click();
        jse.executeScript("scroll(0, 350);");
        SignUp.finish(driver).click();
        TimeUnit.SECONDS.sleep(7);


    }
    public void LoginPap() throws Exception {
        driver.get(ProPapers_ProdUrl);

        driver.findElement(loginClient).click();
        driver.findElement(loginClientUserName).sendKeys(mail);
        driver.findElement(loginClientPassword).sendKeys(pass);
        driver.findElement(loginClientSubmit).click();
        TimeUnit.SECONDS.sleep(10);
    }
    public void LoginPapRef() throws Exception {
        driver.get("https://client.urgentpapers.org/");

        driver.findElement(loginClient).click();
        driver.findElement(loginClientUserName).sendKeys("asd123asd@ya.ru");
        driver.findElement(loginClientPassword).sendKeys("123456");
        driver.findElement(loginClientSubmit).click();
        TimeUnit.SECONDS.sleep(10);
    }
    public void RegisteredStep2() throws Exception {

        LoginPap();
        driver.get("https://client.urgentpapers.org/my/new_order");
        String asdf = driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[1]").getText();
        WebElement topic11 = driver.findElementByXPath("//*[@id=\"details\"]/div[5]/textarea");

        driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[2]/select/optgroup[1]/option[8]").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[3]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[3]/label[2]/select/optgroup[1]/option[4]").click();
        for (int i = 1; i <= 3; i++) {

            driver.findElement(oNSteps2Topic).sendKeys("as dfg hjkl");
            driver.findElement(oNsteps2PaperDetails).sendKeys("asdfghjkl");
            driver.findElement(oNsteps2PaperDetails).sendKeys("  ");
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElementByXPath("//*[@id=\"details\"]/div[9]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[9]/label[2]/select/option[3]").click();
        driver.findElement(oNSteps2NumberOfRef).sendKeys("2");
        TimeUnit.SECONDS.sleep(10);
        driver.findElement(oNSteps3).click();
        TimeUnit.SECONDS.sleep(10);
    }
    public void RegisteredStep3Inquiry() throws Exception {
        Random r = new Random();
        int x = r.nextInt(20) + 1;
        int y = r.nextInt(20) + 1;
        int z = r.nextInt(20) + 1;
        int a = r.nextInt(20) + 1;
        int s = r.nextInt(9) + 1;
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
    public void RegisteredStep3NewOrder()throws Exception{

        Random r = new Random();
        int x = r.nextInt(20) + 1;
        int y = r.nextInt(20) + 1;
        int z = r.nextInt(20) + 1;
        int a = r.nextInt(20) + 1;
        int s = r.nextInt(9) + 1;

        RegisteredStep2();
        Select level = new Select(driver.findElement(By.name("academic_level")));
        level.selectByIndex(2);
        driver.findElement(oNSteps3NumberOfPages).sendKeys(x + "2");
        driver.findElement(oNSteps3NumberOfProblem).sendKeys(y + "4");
        driver.findElement(oNSteps3NumberOfQuestions).sendKeys(z + "1");
        driver.findElement(oNSteps3NumberOfSlides).sendKeys(a + "3");
        Select deadlines = new Select(driver.findElement(By.name("deadline")));
        deadlines.selectByIndex(s);
        driver.findElementByCssSelector("#payment-radio-2").click();
        driver.findElement(oNSteps3IAgree).click();
        driver.findElement(oNStep3Pay).click();


    }
    public void LoginSupport()throws Exception{
        driver.get("https://support.urgentpapers.org/signIn");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/form/div[1]/div/div/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/form/div[2]/div/div/input"));
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/form/div[4]/div/button"));
        TimeUnit.SECONDS.sleep(2);
        login.sendKeys("boosters@test.com");
        password.sendKeys("Fg7XJz44Nz");
        signIn.click();
        TimeUnit.SECONDS.sleep(5);
    }
    public void DetaileOrderPap  () throws Exception {
        LoginPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(currentOrdersOrder10292).click();

    }
    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }



    public By login1 = By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a");
    public By username1 = By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input");
    public By passworf1 = By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input");
    public By loginButton1 = By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input");
    public By sendMailUs = By.xpath("//*[@id=\"contactUsForm\"]/div[5]/div/button");




    public By loginClient = By.cssSelector("#navbar > div > div.desktop-nav > ul > li.nav-item.nav-right-buttons > button");
    public By loginClientUserName = By.id("login-email");
    public By loginClientPassword = By.id("login-password");
    public By loginClientSubmit = By.cssSelector(".login-submit");
    public By resetPasswordClient = By.cssSelector("forgotbutton");
    public By resetPasswordCMail = By.id("reset-email");
    public By resetPasswordCSend = By.id("reset-password");
    public By contacteUsClient = By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[5]/a");
    public By contacteUsClientMessage = By.name("message");
    public By contacteUsClientCallBack = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/form/button[1]");
    public By contacteUsClientEmail = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/form/button[2]");
    public By currentOrders = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[1]/div[2]/ul[1]/li[1]/a");
    public By currentOrdersOrder10292 = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(48) > td:nth-child(1) > a:nth-child(1)");
    public By addNewMessage = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div/button");
    public By aNMWriter = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div[2]/div/label[1]");
    public By aNMSupport = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div[2]/div/label[2]");
    public By aNMText = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div[2]/textarea");
    public By aNMSendMessage = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div[2]/button");
    public By addNewFile = By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/div/button");
    public By aNFWriter = By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/div/div/label[1]");
    public By aNFSupport = By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/div/div/label[2]");
    public By aNFUpload = By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/div[2]/button");
    public By sortById = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div/table/thead/tr/th[1]");
    public By sortByTopic = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div/table/thead/tr/th[2]");
    public By previousOrders = By.cssSelector("#mm-0 > div.my-accound > div > div.my-info > div.all-orders > ul.info-orders > li.li > a > span");
    public By order10272 = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(26) > td:nth-child(1) > a:nth-child(1)");
    public By profile = By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[1]/a");
    public By profileChangePassword = By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div[1]/div[2]/a[1]");
    public By profileChPCurrentPassword = By.name("current");
    public By profileChPNewPassword = By.name("new");
    public By profileChPRepeatNewPassword = By.name("repeat");
    public By profileChPButton = By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/form/div/div[4]/button");
    public By profileName = By.name("firstName");
    public By profileLastName = By.name("lastName");
    public By profileMail = By.name("email");
    public By profilePhone = By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[5]/td[2]/div/input");
    public By profileCountry = By.id("select2-countryCode-ou-container");
    public By profileSaveChanges = By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button");
    public By orderNow = By.xpath("//*[@id=\"navbar\"]/div/div[1]/ul/li[6]/a[1]");
    public By oNFirstName = By.id("sign-up-first-name");
    public By oNLastName = By.id("order-input-2");
    public By oNMail = By.id("sign-up-email");
    public By onConfirmMail = By.cssSelector("#customer > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)");
    public By oNPassword = By.cssSelector("div.form-group:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
    public By oNComfPassword = By.name("passwordConfirm");
    public By oNPhone = By.id("sign-up-phone");
    public By oNStep2 = By.id("sign-up-submit-button");
    public By oNSteps2Topic = By.name("topic");
    public By oNsteps2PaperDetails = By.name("paper_details");
    public By oNSteps2NumberOfRef = By.name("number_of_references");
    public By oNSteps3 = By.cssSelector("button.btn:nth-child(15)");
    public By oNSteps3NumberOfPages = By.id("numberOfPages");
    public By oNSteps3NumberOfProblem = By.name("number_of_problems");
    public By oNSteps3NumberOfSlides = By.name("number_of_slides");
    public By oNSteps3NumberOfQuestions = By.name("number_of_questions");
    public By oNSteps3IAgree = By.name("agree");
    public By oNStep3Pay = By.cssSelector("button.btn:nth-child(19)");



    public void CheckTitle_gb() {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Great Britain");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
   /* public void CheckTitle_cu() {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Canada");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }*/
    public void CheckTitle_au () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Australia");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_cn () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers China");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);

    }
    public void CheckTitle_sa () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers KSA");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_ae () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers UAE");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_qa () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Qatar");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_ie () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Ireland");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_hk () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Hong Kong");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_sg () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Singapore");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_nl () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Nederland");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_kw () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Kuwait");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_lb () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Lebanon");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_om () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Oman");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_nz () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers New Zeland");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_il () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Israel");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_de () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Germany");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_fr () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers France");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_jp () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Japan");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_se () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Sweden");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_dk () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Denmark");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_mt () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Malta");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_bn () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Brunei Darussalam");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }


    int z = r.nextInt(43) + 1;
    int b = r.nextInt(9) + 1;
    String [] AmerName = {"Liam","Emma","Noah","Olivia","Mason","Ava","Ethan","Sophia","Logan","Isabella","Lucas","Mia","Jackson","Charlotte","Aiden","Amelia","Oliver","Emily","Jacob","Madison","Elijah","Harper","Alexander","Abigail" ,"James","Avery","Benjamin","Lily" ,"Jack","Ella","Luke","Chloe" ,"William","Evelyn","Michael","Sofia" ,"Owen","Aria","Daniel","Ellie" ,"Carter","Aubreyn","Gabriel","Scarlett"};
    String [] AmerLastName = {"Smith","Johnson","Williams","Brown","Jones","Davis","Taylor","Wilson","Robinson","Wright"};
    String names = AmerName[z];
    String lastName = AmerLastName[b];




  }