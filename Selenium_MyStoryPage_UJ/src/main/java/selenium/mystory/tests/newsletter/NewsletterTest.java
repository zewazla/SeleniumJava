package selenium.mystory.tests.newsletter;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.mystory.pages.DashboardPage;
import selenium.mystory.pages.newsletter.NewsletterPage;
import selenium.mystory.tests.AbstractTest;

public class NewsletterTest extends AbstractTest {

    @Test
    public void successAddNewsletterTest(){
        NewsletterPage newsletterPage = new NewsletterPage(driver);
        newsletterPage.fillNewsletterForm("inm86240@cndps.com");
        DashboardPage dashboardPage = newsletterPage.submitNewsletterForm();

        Assert.assertTrue(dashboardPage.isInfoAddNewsletterDisplayed());
    }
}
