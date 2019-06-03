package selenium.mystory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class AbstractTest {

    public static WebDriver driver;

    @BeforeSuite
    public void setUpSuite(){
        //setting driver properties
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //wait for element to load
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //navigate to mail.google.com
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @AfterSuite
    public void tearDownSuite(){
        driver.quit();
    }

}
