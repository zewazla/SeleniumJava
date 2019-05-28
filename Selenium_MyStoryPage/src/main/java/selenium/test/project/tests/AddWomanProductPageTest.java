package selenium.test.project.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import selenium.test.project.pages.AbstractPage;
import selenium.test.project.pages.AddWomanProductPage;
import selenium.test.project.pages.DashboardPage;
import selenium.test.project.pages.WomanProductPage;


public class AddWomanProductPageTest extends AbstractPage {

    public AddWomanProductPageTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void successAddWomanPageTest() {
        // Wejście w środowiska
        DashboardPage dashboardPage = new DashboardPage(driver);
        WomanProductPage womanPage;
        womanPage = dashboardPage.goToWomanPage();
        // Wejscie w dodawanie środowiska
        AddWomanProductPage addWomanPage = womanPage.goToAddWomanPage();
    }
}
