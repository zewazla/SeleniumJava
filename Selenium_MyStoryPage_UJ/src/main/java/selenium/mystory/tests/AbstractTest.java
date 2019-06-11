package selenium.mystory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import selenium.mystory.utils.CustomPath;
import selenium.mystory.utils.CustomScreenshot;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AbstractTest {

    public static WebDriver driver;
    protected static CustomScreenshot customScreenshot;




    @BeforeSuite
    public void setUpSuite() {

        customScreenshot = new CustomScreenshot();
        System.setProperty("webdriver.chrome.driver", new CustomPath().getResourcesPath("chromedriver.exe"));
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.navigate().to("http://automationpractice.com/index.php");
    }
    @AfterMethod
    public void tearDownMethod(ITestResult result){
        if ( result.getStatus() == ITestResult.FAILURE){
            customScreenshot.makeScreenshot(
                    driver,
                    new Date().getTime() + "_" +
                            result.getMethod().getMethodName()
            );
        }
    }

    @AfterSuite
    public void tearDownSuite() {
        driver.quit();
    }

}
