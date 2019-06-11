package selenium.mystory.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.mystory.pages.login.AddLoginPage;
import selenium.mystory.pages.main.DashboardPage;
import selenium.mystory.pages.login.LoginPage;
import selenium.mystory.tests.AbstractTest;

public class AddLoginPageTest extends AbstractTest {

    @Test
    public void successAddLoginTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        LoginPage loginPage = dashboardPage.goToLoginPage();
        AddLoginPage addLoginPage = loginPage.goToLoginPage();
        addLoginPage = addLoginPage.fillAddLoginForm("tgq35996@cndps.com", "qwerty1234");
        loginPage = addLoginPage.submitAddLoginForm();

        Assert.assertTrue(dashboardPage.isLogoutButtonDisplayed());

    }
}
