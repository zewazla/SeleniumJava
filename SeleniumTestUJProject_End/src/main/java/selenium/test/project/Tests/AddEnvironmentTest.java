package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.AddEnvironmentPage;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.EnvironmentsPage;

import java.util.Date;

public class AddEnvironmentTest extends AbstractTest {

    @Test
    public void successAddEnvironmentTest(){
        // Wejście w środowiska
        DashboardPage dashboardPage = new DashboardPage(driver);
        EnvironmentsPage environmentsPage =
                dashboardPage.goToEnvironmentsPage();
        // Wejscie w dodawanie środowiska
        AddEnvironmentPage addEnvironmentPage =
                environmentsPage.goToAddEnvironmentPage();
        // Uzupełnienie formularza
        addEnvironmentPage =
                addEnvironmentPage.fillAddEnvironmentForm(
                        "Environment_" + new Date().getTime(),
                        "description");
        // Wysłąnie formularza
        environmentsPage =
                addEnvironmentPage.submitAddEnvironmentForm();
        // Sprawdzenie czy dodano
        //wykrzyknik w asercji powoduje fail
        Assert.assertTrue(!environmentsPage.isInfoBoxDisplayed());
    }
}
