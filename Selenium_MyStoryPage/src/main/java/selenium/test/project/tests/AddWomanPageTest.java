package selenium.test.project.tests;

import org.testng.annotations.Test;
import selenium.test.project.pages.DashboardPage;
import selenium.test.project.pages.WomanPage;


public class AddWomanPageTest extends AbstractTest {

    @Test
    public void successAddWomanPageTest() {
        // Wejście w środowiska
        DashboardPage dashboardPage = new DashboardPage(driver);
        WomanPage womanPage = dashboardPage.goToWomanPage();

    }
}
