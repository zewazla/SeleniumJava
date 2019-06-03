package selenium.mystory.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.mystory.pages.DashboardPage;
import selenium.mystory.pages.NewsletterPage;

public class NewsletterTest extends AbstractTest {

    @Test
    public void successAddNewsletterTest(){
        NewsletterPage newsletterPage = new NewsletterPage(driver);
        newsletterPage.fillNewsletterForm("administrator@testarena.pl");
        DashboardPage dashboardPage = newsletterPage.submitNewsletterForm();

        Assert.assertTrue(dashboardPage.isInfoAddNewsletterDisplayed());
    }
}
