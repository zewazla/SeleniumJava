package selenium.test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Wskazanie zewnętrznego pliku drivera dla przeglądarki CHROME
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe"
        );
        //Stworzenie i zainicjalizowanie obiektu DRIVER przeglądarką CHROME
        driver = new ChromeDriver();
        // Ustawienie globalnego timeouta na 5 sekund
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Ustawienie zmaksymalizowanego okna
        driver.manage().window().maximize();
        // przejście na wskazaną stronę
        driver.get("http://demo.testarena.pl");
    }

    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("administrator@testarena.pl","sumXQQ72$L");

        DashboardPage dashboardPage = loginPage.submitLoginForm();

        Assert.assertTrue(
                dashboardPage.isLogoutButtonDisplayed()
        );
    }

    @AfterClass
    public void tearDown() {
        //Zamknięcie przeglądarki
        driver.quit();
    }
}