package selenium.test.project.tests;

import org.testng.annotations.Test;
import selenium.test.project.pages.DashboardPage;
import selenium.test.project.pages.SearchPage;

public class SearchTest extends AbstractTest {

    @Test
    public void successSearchTest(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.fillSearchForm("women dresses");

        DashboardPage dashboardPage = searchPage.submitSearchForm();






    }
}
