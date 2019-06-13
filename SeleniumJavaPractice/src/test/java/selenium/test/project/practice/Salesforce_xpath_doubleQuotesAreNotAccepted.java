package selenium.test.project.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Salesforce_xpath_doubleQuotesAreNotAccepted {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/?locale=eu");

        driver.get("https://login.salesforce.com/?locale=eu");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //double quotes are not accepted --> //*[@id="Login"]

    }
}