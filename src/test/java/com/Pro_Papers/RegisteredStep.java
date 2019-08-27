package com.Pro_Papers;

import com.PageClient.Lending;
import com.PageClient.Order_Sign_Up;
import com.PageClient.Registered;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class RegisteredStep extends WebDriverSettings {

    Random r = new Random();
    protected int x = r.nextInt(90000) + 1;
    protected int v = r.nextInt( 300) + 1;
    protected int z = r.nextInt(4) + 1;
    protected int va = r.nextInt(50);
    protected int vb = r.nextInt(100);
    public String regmail = x + "test@test.com";
    public String regpass = "Password123";
    private String testText = "test text";

    int n = r.nextInt(4) + 1;
    int b = r.nextInt(9) + 1;

    protected String[] subjectChoose = {"Architecture", "Art history", "Aviation", "Classic English literature", "Culture", "Drama", "Film studies", "Literature", "Music", "Philosophy", "Poetry", "Religious studies", "Shakespeare studies", "Theater studies", "World literature", "Business", "Human Resource Management", "Investments", "Management", "Marketing", "C++", "Communication", "Java programming", "Linear programming", "Programming", "Accounting", "Economics", "Finance", "Engineering", "Geology", "Technology", "History", "Political science", "World affairs", "English", "Criminal Law", "Law", "Anthropology", "Astronomy", "Biochemistry", "Biology", "Chemistry", "Ecology", "Environmental studies", "Genetics", "Geography", "Medicine", "Nursing", "Physics", "Mathematics", "MATLAB", "SPSS", "Statistics", "Civics", "Cognitive Science", "Criminology", "Education", "Family and consumer science", "Health", "Journalism", "Psychology", "Sociology", "Women and gender studies",
    };
    protected String subjectList = subjectChoose[va];
    protected String[] paper_typeChoose = {"Admission essay", "Article review", "Article", "Dissertation proposal", "Dissertation", "Essay", "Research paper", "Research proposal", "Term paper", "Thesis", "Other", "Business plan", "Business feasibility plan", "Investor business plan", "One-page business plan", "Operations business plan", "Start-up Business Plan", "Scholarship essay", "Admission essay", "Application letter", "Personal statement", "Business School application essay", "Graduate School application essay", "Law School application essay", "MBA admission essay", "MBA application essay", "Medical School application essay", "Study abroad application essay", "Cover letter", "Military cover letter", "Referral cover letter", "Cold-contact cover letter", "Entry level cover letter", "Executive cover letter", "Internship cover letter", "CV", "Academic CV", "Executive CV", "Internship CV", "Military CV", "Dissertation", "Dissertation abstract", "Dissertation chapter", "Dissertation conclusion", "Dissertation hypothesis", "Dissertation introduction", "Dissertation methodology", "Dissertation proposal", "Dissertation results", "Dissertation discussion", "Literature review", "Annotated bibliography", "Argumentative essay", "Course work", "Creative writing", "Essay", "Literature review", "Presentation", "Report", "OtherEssay", "Analytical essay", "Cause and Effect essay", "Comparative essay", "Compare and contrast essay", "Creative writing essay", "Deductive essay", "Definition essay", "Descriptive essay", "Exploratory essay", "Expository essay", "Informal essay", "Literary essay", "Literature essay", "MBA essay", "Military essay", "Narrative essay", "Persuasive essay", "Reflective essay", "Response essay", "Short essay", "Algebra homework help", "College homework help", "English homework help", "Homework for kids", "Maths homework help", "School homework help (middle & high)", "Science homework help", "Article", "Biography", "Case study", "Critical thinking", "Term paper", "Multiple choice questions", "Annotated bibliography", "Book critique", "Capstone project", "Coursework", "Critical analysis", "Grant proposal", "Journal critique", "Powerpoint presentation", "Problem solution", "Reaction paper", "Speech", "Other", "Problem solving", "Lab report", "Business report", "Engineering report", "Experience report", "Feasibility report", "Formal report", "Investigation report", "Policy report", "Progress report", "Research report", "Science report", "Short report", "Technical report", "Workplace report", "Research paper", "Research proposal", "Research thesis", "Research outline", "Research summary", "Resume", "Chronological resume", "Combination (combined) resume", "Entry level resume", "Functional resume", "Internship resume", "Military resume", "Article review", "Book review", "Movie review", "Critical appraisal", "Critical review", "Meta-analysis", "Peer review", "Systematic review", "Thesis", "Thesis proposal", "Thesis statement", "Analytical thesis statement", "Project thesis", "Thesis abstract", "Thesis conclusion", "Thesis discussion", "Thesis introduction", "Thesis methodology",
    };
    protected String paper_typeList = paper_typeChoose[vb];
    @Test
    public void New_Client_firstPage() throws Exception {

        int a = r.nextInt(20) + 1;


        // LoginPap();
       // driver.get(ProPapers_ProdUrl);
        driver.get(ProPapers_StageUrl);
        //   driver.get("https://client.urgentpapers.org/order");
        Lending.Order_Now(driver).click();
        Registered.paper_type(driver).sendKeys(paper_typeList);
        Registered.subject(driver).sendKeys(subjectList);
        Registered.topic(driver).sendKeys("Test order Test");
        Select paper_format = new Select(driver.findElement(By.name("paper_format")));
        paper_format.selectByValue(String.valueOf(z));
//        Registered.number_of_references(driver).sendKeys("" + b);
        Registered.paper_details(driver).sendKeys("Test test test tes tes ");
        Registered.nextStep(driver).click();
        TimeUnit.SECONDS.sleep(2);
//        assertEquals("Our Extras:", driver.findElement(By.cssSelector("div.col-xl-3:nth-child(3) > p:nth-child(1)")).getText());

        Select level = new Select(driver.findElement(By.name("academic_level")));
        level.selectByIndex(2);
        //   driver.findElement(oNSteps3NumberOfPages).sendKeys(x + "");
        //   driver.findElement(oNSteps3NumberOfProblem).sendKeys(y + "");
        driver.findElement(oNSteps3NumberOfQuestions).sendKeys(z + "");
        driver.findElement(oNSteps3NumberOfSlides).sendKeys(a + "");
        //    Select deadlines = new Select(driver.findElement(By.name("deadline")));
        //    deadlines.selectByIndex(s);
//        driver.findElementByCssSelector("#payment-radio-2").click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 3050);");
        Registered.pay(driver).click();
        Order_Sign_Up.Mail_Order(driver).sendKeys(v + "test@ya.ru");
        Order_Sign_Up.Password_Order(driver).sendKeys("123456");
        Order_Sign_Up.Phone_Order(driver).sendKeys("050" + v + "5457");
        Order_Sign_Up.TermsOU_Order(driver).click();
        Order_Sign_Up.Pay_Order(driver).click();
        TimeUnit.SECONDS.sleep(5);

    }

    @Test
    public void NewOrder() throws Exception {

         LoginPap();
        driver.get("https://client.urgentpapers.org/order");
        Lending.Order_Now(driver).click();
        Registered.paper_type(driver).sendKeys(paper_typeList);
        Registered.subject(driver).sendKeys(subjectList);
        Registered.topic(driver).sendKeys("Test order Test");
        Select paper_format = new Select(driver.findElement(By.name("paper_format")));
        paper_format.selectByValue(String.valueOf(z));
//      Registered.number_of_references(driver).sendKeys("" + b);
        Registered.paper_details(driver).sendKeys("Test test test tes tes ");
        Registered.nextStep(driver).click();
        TimeUnit.SECONDS.sleep(5);
        assertEquals("Our Extras:", driver.findElement(By.cssSelector("div.col-xl-3:nth-child(3) > p:nth-child(1)")).getText());
    }


}
