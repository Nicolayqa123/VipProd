package com.vipwriters;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PageTERMSOFUSE extends WebDriverSettings {
    @Test
    public void Terms () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/termsofuse");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        assertEquals("1.1.\n" +
                "“Account” is an electronic account of the Writer at the Website.\n" +
                "1.2.\n" +
                "“Agreement” is an agreement between the Company and the Writer that includes all provisions of these Terms of Use\n" +
                "1.3.\n" +
                "“Available Orders” is a list of Orders placed by the Clients that have not been assigned to any Writers.\n" +
                "1.4.\n" +
                "“Beneficiary Information” is information the Writer should provide in order to activate a chosen Payment Method.\n" +
                "1.5.\n" +
                "“Client” is a person who orders a Product.\n" +
                "1.6.\n" +
                "“Company” is the entity “Odoxe Limited.” that provides access to Available Orders for the Writers as stated in this Agreement.\n" +
                "1.7.\n" +
                "“Content” is information that is provided in the Product.\n" +
                "1.8.\n" +
                "“Deadline” is the time by which the Product should be submitted by the Writer.\n" +
                "1.9.\n" +
                "“Delivery” is an act of sending the final Product to the Client.\n" +
                "1.10.\n" +
                "“Draft” is a preliminary version of the final Product.\n" +
                "1.11.\n" +
                "“Fine” is a sum of money imposed as a penalty.\n" +
                "1.12.\n" +
                "“Order” is a request from the Client to complete a Product.\n" +
                "1.13.\n" +
                "“Payment Date” is dates when the Writer’s Balance is written off and money is transferred to the Writer via chosen Payment Method.\n" +
                "1.14.\n" +
                "“Payment Method” is a type of money transferred service the Company uses to transfer the money to the Writer.\n" +
                "1.15.\n" +
                "“Plagiarism” is using text or thoughts of another author without proper citation.\n" +
                "1.16.\n" +
                "“Product” is the document the Writer submits as a result of completing the Order.\n" +
                "1.17.\n" +
                "“Reachable” is the Writer’s availability at the time the Writer is working on the Order.\n" +
                "1.18.\n" +
                "“Refund” is an act of returning the money to the Client due to the failure to meet the Client’s requirements.\n" +
                "1.19.\n" +
                "“Revision” is the process of re-writing the Product in case the Client’s requirements are not met.\n" +
                "1.20.\n" +
                "“Support” is the Company’s representatives who assist Writers in communicating with the Client.\n" +
                "1.21.\n" +
                "“Website” is VIP-Writers.com.\n" +
                "1.22.\n" +
                "“Writer” is a person working for the Company who completes Orders placed by the Clients on a freelance basis.", driver.findElement(By.id("collapseOne")).getText());
        TimeUnit.SECONDS.sleep(1);
        driver.findElementByXPath("//*[@id=\"headingTwo\"]/h4/a").click();
        jse.executeScript("scroll(0, 1050);");

        assertEquals("2.1.\n" +
                "The subject of these Terms of Use is regulation of any actions between the Company, Writers and Clients.\n" +
                "2.2.\n" +
                "This Agreement has no expiration date.", driver.findElement(By.id("collapseTwo")).getText());
        jse.executeScript("scroll(0, 250);");
        TimeUnit.SECONDS.sleep(1);

        driver.findElementByXPath("//*[@id=\"headingThree\"]/h4/a").click();
        jse.executeScript("scroll(0, 1000);");
        assertEquals("3.1.\n" +
                "The Company is obliged to:\n" +
                "3.1.1.\n" +
                "Provide access to Available Orders (if there are available orders) to all Active Writers.\n" +
                "3.1.2.\n" +
                "Make payments on Payment Dates (as stated in clause 7.4.) and via chosen Payment methods.\n" +
                "3.1.3.\n" +
                "Contact Clients if necessary.\n" +
                "3.1.4.\n" +
                "Resolve Disputes that may arise between Clients and Writers.\n" +
                "3.1.5.\n" +
                "Keep all information confidential as stated in Privacy Policy.\n" +
                "3.1.6.\n" +
                "Before setting the Writer’s account on Probation, the Company is obliged to send an official warning via email.\n" +
                "3.1.7.\n" +
                "In a month after the Writer’s account was set on Probation, the Company is obliged to check the Writer’s activity and decide whether Status can be changed back to VIP.\n" +
                "3.2.\n" +
                "The Company may:\n" +
                "3.2.1.\n" +
                "Terminate the cooperation with Writers as stated in clause 6.2.1.\n" +
                "3.2.2.\n" +
                "Fine the writers for violating the Company’s rules as stated in clause 5.\n" +
                "3.2.3.\n" +
                "Check the Products and send them for revision if such Products do not comply with the requirements stated in clause 4 (Requirements for products)\n" +
                "3.2.4.\n" +
                "Decide whether the Writer can be promoted to the position of VIP-Plus/VIP-Premium Writer.\n" +
                "3.2.5.\n" +
                "Assign the Writer if the Company received a Writer’s Application for the Order.\n" +
                "3.2.6.\n" +
                "In case of Dispute decide whether the Writer is responsible for not following the requirements, and the Writer can be fined as stated in clause 5.\n" +
                "3.2.7.\n" +
                "The Company may set the Writer’s account on Probation in case the Writer fails to meet the requirements specified in clauses 4.1.-4.6. for three or more times during one month.\n" +
                "3.3.\n" +
                "The Writer is obliged to:\n" +
                "3.3.1.\n" +
                "Transfer copyright for all Products to the Company.\n" +
                "3.3.2.\n" +
                "Provide valid phone numbers and e-mail addresses to the Company.\n" +
                "3.3.3.\n" +
                "Keep all information about the Products in full confidentiality.\n" +
                "3.3.4.\n" +
                "Use one account to access the Website.\n" +
                "3.3.5.\n" +
                "Follow all instructions provided by the Clients.\n" +
                "3.3.6.\n" +
                "Submit high-quality and plagiarism-free Products that meet all Clients’ requirements.\n" +
                "3.3.7.\n" +
                "Revise Products for free:\n" +
                "If the order is sent for revision within 14 days after the Product was delivered to the Client.\n" +
                "In case the final paper is plagiarized, there will be no time-frame for the revision\n" +
                "3.3.8.\n" +
                "Provide Drafts if requested by the Company or Client.\n" +
                "3.3.9.\n" +
                "Be Reachable.\n" +
                "3.3.10.\n" +
                "Be available any time (24/7).\n" +
                "3.3.11.\n" +
                "Deliver the Product within the given Deadline.\n" +
                "3.3.12.\n" +
                "Follow all requirements to Products as stated in clause 4.\n" +
                "3.3.13.\n" +
                "Confirm working on the Order to be officially assigned to this Order.\n" +
                "3.3.14.\n" +
                "Follow business communication rules.\n" +
                "3.3.15.\n" +
                "Follow all formatting styles standards as stated in clause 4.10.\n" +
                "3.3.16.\n" +
                "Any violation can result in imposing the Fine as stated in clause 5.\n" +
                "3.4.\n" +
                "The Writer is prohibited to:\n" +
                "3.4.1.\n" +
                "Sell or share Products with any third parties.\n" +
                "3.4.2.\n" +
                "Plagiarize the Products. Plagiarizing the Product will result in a Fine as stated in clause 5.\n" +
                "3.4.3.\n" +
                "Use fake or multiple Accounts.\n" +
                "3.4.4.\n" +
                "Sell Account or share access to the Account with any third parties.\n" +
                "3.4.5.\n" +
                "Contact Clients if any personal information was provided by the Clients.", driver.findElement(By.id("collapseThree")).getText());
        TimeUnit.SECONDS.sleep(1);

        driver.findElementByXPath("//*[@id=\"headingFour\"]/h4/a").click();
        jse.executeScript("scroll(0, 700);");

        assertEquals("4.1.\n" +
                "Content should be original and well-written.\n" +
                "4.2.\n" +
                "Content should meet all Client’s requirements.\n" +
                "4.3.\n" +
                "Content should be plagiarism-free.\n" +
                "4.4.\n" +
                "Content must not contain any grammatical and/or punctuation errors.\n" +
                "4.5.\n" +
                "The final Product must be of the required amount of pages, but not less than 275 words per double-spaced page.\n" +
                "4.6.\n" +
                "Specific requirements\n" +
                "4.6.1.\n" +
                "Text should be typed on A4 pages, margins should be 1” on all sides.\n" +
                "4.6.2.\n" +
                "Font should be 12pt, Times New Roman.\n" +
                "4.6.3.\n" +
                "Page number should be inserted in the right upper corner.\n" +
                "4.6.4.\n" +
                "All formatting style requirements should be met (APA, MLA, Chicago/Turabian, Harvard, etc.).\n" +
                "4.6.5.\n" +
                "Not following instructions and/or requirements can result in imposing the Fine as stated in clause 5.", driver.findElement(By.id("collapseFour")).getText());
        jse.executeScript("scroll(0, 1000);");
        TimeUnit.SECONDS.sleep(1);

        driver.findElementByXPath("//*[@id=\"headingFive\"]/h4/a").click();
        assertEquals("5.1.\n" +
                "Violation of the conditions stated in this Agreement, will result in the fines as below:\n" +
                "5.2.\n" +
                "Plagiarism – 25% of the price for the Order.\n" +
                "5.3.\n" +
                "Bad grammar and/or punctuation – 10% of the price for the Order.\n" +
                "5.4.\n" +
                "Wrong formatting – 10% of the price for the Order.\n" +
                "5.5.\n" +
                "Low quality – 30% of the price for the Order.\n" +
                "5.6.\n" +
                "Failure to precisely meet all instructions provided by Client - 20% of the price for the Order.\n" +
                "5.7.\n" +
                "Not reachable - $1.\n" +
                "5.8.\n" +
                "Lateness for less than an hour – 5% of the price for the Order.\n" +
                "5.9.\n" +
                "Lateness for more than an hour – 10% of the price for the Order.\n" +
                "5.10.\n" +
                "Lateness that resulted in cancellation of the Order – 100% of the price for the Order.\n" +
                "5.11.\n" +
                "Retraction – 50% of the price for the Order.\n" +
                "5.12.\n" +
                "Failure to ask for clarifications of Order requirements within 25% of the initial deadline – 15% of the price for the Order.\n" +
                "5.13.\n" +
                "The Client can file a Dispute if:\n" +
                "The paper was plagiarized;\n" +
                "Instructions were not followed;\n" +
                "Wrong paper was uploaded;\n" +
                "If more than 50% of Multiple Choice Questions were not solved.\n" +
                "5.14.\n" +
                "In case a 100% refund is issued to the Client, the Writer will be fined as follows:\n" +
                "The paper was plagiarized – 200% fine;\n" +
                "Instructions were not followed – 150% fine;\n" +
                "Wrong paper was uploaded – 100% fine;\n" +
                "If more than 50% of Multiple Choice Questions were not solved – 50% fine.\n" +
                "5.15.\n" +
                "In case a partial refund is issued to the client, the Writer’s payment for a disputed Order may be recalculated by the Company.\n" +
                "5.16.\n" +
                "All fines can be disputed within 5 (five) business days after it was imposed.", driver.findElement(By.id("collapseFive")).getText());
        jse.executeScript("scroll(0, 1000);");
        TimeUnit.SECONDS.sleep(1);

        driver.findElementByXPath("//*[@id=\"headingSix\"]/h4/a").click();
        assertEquals("6.1.\n" +
                "The Company activates the Writer’s Account in case the Writer meets all Registration requirements\n" +
                "Registration requirements are:\n" +
                "Successful completion of the test;\n" +
                "Uploading a high-quality sample essay on the given topic;\n" +
                "Uploading a picture of a valid diploma.\n" +
                "6.2.\n" +
                "It will take up to 10 business days for the company to activate the account after the moment the writer finishes the Registration procedure.\n" +
                "6.3.\n" +
                "The Company may decide not to activate the Writer’s account if some requirements are not met.\n" +
                "6.4.\n" +
                "The Company may ask the Writer to re-write the essay or to re-upload the diploma if needed.\n" +
                "6.5.\n" +
                "The Company may set the account of the newly activated Writer on Probation if some flaws in the sample essay were noticed.\n" +
                "6.6.\n" +
                "The Company may decide to terminate the Writer’s Account if:\n" +
                "The Writer violates clauses 9.2. (Discloses information about Products), 9.3. (Sells or shares Products with any third parties), 3.4.3. (Uses fake or multiple Accounts);\n" +
                "The Writer constantly violates clause 4. (Requirements to Products);\n" +
                "If the Writer’s Account is terminated, all pending Payments will be made on the following Payment Date.", driver.findElement(By.xpath("collapseSix")).getText());
        jse.executeScript("scroll(0, 1000);");
        TimeUnit.SECONDS.sleep(1);

        driver.findElementByXPath("//*[@id=\"headingSeven\"]/h4/a").click();
        assertEquals("7.1.\n" +
                "The Writer should provide the Beneficiary Information to the Company. If no Beneficiary information is provided, the Company will not be able to process the Payment to the Writer.\n" +
                "7.2.\n" +
                "When the Product is delivered to the Client, the Writer receives the Payment for it and the Payment is added to the Writer’s Balance.\n" +
                "7.3.\n" +
                "The Writer’s Balance is written off on the Payment Date if the Writer’s Balance exceeds $100.\n" +
                "7.4.\n" +
                "Payment Date is between 1st and 5th of every month.\n" +
                "7.5.\n" +
                "Due to some unexpected circumstances, the Payment can be made on other date. The Writer will be notified if the Payment Date has been changed.\n" +
                "7.6.\n" +
                "The Writer may choose the Payment Method. Information about Payment Methods is provided in the “Payments” section at the Website.\n" +
                "7.7.\n" +
                "The Writer may request early withdrawal of balance notwithstanding clauses 7.3 and 7.4 of these Terms of Use. In this case, the Writer will have to pay a 20 percent early withdrawal penalty. The Writer may request early withdrawal by contacting Support. The Company reserves the right to decline an early withdrawal request.\n" +
                "7.8.\n" +
                "In case the Writer’s account is set on Probation, the Writer receives 80% of his/her regular salary. The Writer on Probation will see the final price when applying for the Order.", driver.findElement(By.id("collapseSeven")).getText());
        jse.executeScript("scroll(0, 1000);");
        TimeUnit.SECONDS.sleep(1);

        driver.findElementByXPath("//*[@id=\"headingEight\"]/h4/a").click();
        assertEquals("8.1.\n" +
                "The Company keeps all information confidential as stated in Privacy Policy.", driver.findElement(By.id("collapseEight")).getText());
        jse.executeScript("scroll(0, 1000);");
        TimeUnit.SECONDS.sleep(1);

        driver.findElementByXPath("//*[@id=\"headingNine\"]/h4/a").click();
        assertEquals("9.1.\n" +
                "All Products submitted by the Writer and received by the Company become the property of the Company.\n" +
                "9.2.\n" +
                "The Writer has no right to publish the Products.\n" +
                "9.3.\n" +
                "The Writer has no right to sell or share the Products with any third parties.\n" +
                "9.4.\n" +
                "If the Writer violates clauses 9.2. and/or 9.3., the Writer’s Account will be terminated.", driver.findElement(By.id("collapseEight")).getText());

    }
}
