package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.AddVersionPage;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.VersionsPage;

import java.util.Date;

public class AddVersionTest extends AbstractTest {

    @Test
    public void successAddVersionTest(){
        // Wejście w wersje
        DashboardPage dashboardPage = new DashboardPage(driver);
        VersionsPage versionsPage =
                dashboardPage.goToVersionsPage();
        // Wejscie w dodawanie wersji
        AddVersionPage addVersionPage =
                versionsPage.goToAddVersionPage();
        // Uzupełnienie formularza
        addVersionPage =
                addVersionPage.fillAddVersionForm(
                        "Version_" + new Date().getTime(),
                        "description");
        // Wysłąnie formularza
        versionsPage =
                addVersionPage.submitAddVersionForm();
        // Sprawdzenie czy dodano
        Assert.assertTrue(versionsPage.isInfoBoxDisplayed());
    }
}
