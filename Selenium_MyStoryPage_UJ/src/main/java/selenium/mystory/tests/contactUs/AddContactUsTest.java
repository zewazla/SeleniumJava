package selenium.mystory.tests.contactUs;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.mystory.pages.main.DashboardPage;
import selenium.mystory.pages.contactUs.AddContactUsPage;
import selenium.mystory.pages.contactUs.ContactUsPage;
import selenium.mystory.tests.AbstractTest;

public class AddContactUsTest extends AbstractTest {

    @Test
    public void successAddContactUsTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ContactUsPage contactUsPage = dashboardPage.goToContactUsPage();
        AddContactUsPage addContactUsPage = contactUsPage.goToContactUsPage();
        addContactUsPage = addContactUsPage.fillAddContactUsForm("tgq35996@cndps.com", "Write some text");
        contactUsPage = addContactUsPage.submitAddContactUsForm();


        Assert.assertTrue(dashboardPage.isInfoSendMessageDisplayed());
    }
}

