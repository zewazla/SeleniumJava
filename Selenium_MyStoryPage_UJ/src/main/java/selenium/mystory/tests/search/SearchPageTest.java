package selenium.mystory.tests.search;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.mystory.pages.main.DashboardPage;
import selenium.mystory.pages.search.SearchPage;
import selenium.mystory.tests.AbstractTest;

public class SearchPageTest extends AbstractTest {

    @Test
    public void successSearchPageTest(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.fillSearchForm("dresses");
        DashboardPage dashboardPage = searchPage.submitSearchForm();

        Assert.assertTrue(dashboardPage.isInfoSearchDisplayed());

    }
}
