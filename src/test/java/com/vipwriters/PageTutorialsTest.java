package com.vipwriters;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PageTutorialsTest extends WebDriverSettings {
    @Test
    public void Tutorial () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/tutorials");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        assertEquals("1.\n" +
                "Fill in the application form at the registration page:\n" +
                "We need your personal and contact information;\n" +
                "Also, you will have to choose disciplines of your proficiency.\n" +
                "2.\n" +
                "Verify your email address.\n" +
                "3.\n" +
                "Pass the test.\n" +
                "4.\n" +
                "Complete and upload an essay as a DOCX file.\n" +
                "5.\n" +
                "The essay has to:\n" +
                "Match the topic;\n" +
                "Be plagiarism-free;\n" +
                "Contain 275 words per page.\n" +
                "6.\n" +
                "Upload a photo of your diploma as a JPG file (you have to upload a DOCX file with translation of your diploma if it is not written in English).\n" +
                "7.\n" +
                "Our managers will review your application and will let you know whether you have passed within a business week.\n" +
                "8.\n" +
                "You will receive a phone call in order for us to verify your phone number.\n" +
                "9.\n" +
                "Congrats! Now you can apply for your first order!", driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div")).getText());
        jse.executeScript("scroll(0, 500);");

        driver.findElementByXPath("//*[@id=\"headingTwo\"]/h4/a").click();
        assertEquals("1.\n" +
                "Click the “Available orders” button on your Control panel to see the list of the available orders.\n" +
                "2.\n" +
                "To get more info about the order, go to the order page by clicking on its number.\n" +
                "3.\n" +
                "When applying for the order, you will have to provide the reason why we should assign this order to you.\n" +
                "4.\n" +
                "If the order is assigned to you, you will be notified by email and this order will appear in “My Orders” section.\n" +
                "5.\n" +
                "For us to be sure that you have started working on the order, you will have to click the “Confirm” button on the order page. Otherwise, we may reassign the order.\n" +
                "6.\n" +
                "When working on the order, you can communicate with the Client via messages and ask Support for any help you may need.\n" +
                "7.\n" +
                "When you are done working on the order, it is necessary to upload it to the Files section.\n" +
                "8.\n" +
                "If the paper is sent for revision, you will get an email notification and the status of the order will change to “Revision”\n" +
                "9.\n" +
                "When the final paper is delivered to the Client, the salary will be added to your balance.", driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div")).getText());

        driver.findElementByXPath("//*[@id=\"headingThree\"]/h4/a").click();
        assertEquals("1.\n" +
                "When your account is registered at VIP-Writers.com, you become a VIP Writer.\n" +
                "However, we would encourage you to complete the orders of the highest quality and when all requirements are met, you can apply for a promotion:\n" +
                "VIP-Plus – +15% to the salary;\n" +
                "VIP-Premium – +25% premium to all orders.\n" +
                "2.\n" +
                "If you application for a promotion was declined, you will be able to re-apply in 3 months.\n" +
                "Requirements you have to meet to apply for a VIP-Plus Writer position are the following:\n" +
                "Salary of more than $300 each month (at least 3 months in a row);\n" +
                "Uploading all orders on time;\n" +
                "No plagiarism;\n" +
                "3 positive feedbacks from our Clients.\n" +
                "3.\n" +
                "Requirements you have to meet to apply for a VIP-Premium Writer position are:\n" +
                "Salary of more than $400 each month (at least 4 months in a row);\n" +
                "Uploading all orders on time;\n" +
                "No plagiarism;\n" +
                "5 positive feedbacks from our Clients.\n" +
                "4.\n" +
                "Our Managers will review your application and you will receive an official email within the next 10 business days after we receive your application.", driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div")).getText());


    }
}
