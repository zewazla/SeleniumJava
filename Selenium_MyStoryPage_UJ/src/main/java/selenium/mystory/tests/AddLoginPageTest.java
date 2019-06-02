package selenium.mystory.tests;

import org.testng.annotations.Test;
import selenium.mystory.pages.AddLoginPage;
import selenium.mystory.pages.DashboardPage;
import selenium.mystory.pages.LoginPage;

public class AddLoginPageTest extends AbstractTest {

    @Test
    public void successAddLoginTest(){
        DashboardPage dashboardPage = new DashboardPage(driver);
        LoginPage loginPage = dashboardPage.goToLoginPage();
        AddLoginPage addLoginPage = loginPage.goToLoginPage();
        addLoginPage = addLoginPage.fillAddLoginForm("tgq35996@cndps.com", "qwerty1234");
        loginPage = addLoginPage.submitAddLoginForm();

    }
}
