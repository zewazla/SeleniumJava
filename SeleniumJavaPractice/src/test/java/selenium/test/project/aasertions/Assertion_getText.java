package selenium.test.project.aasertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion_getText {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

        driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
        Assert.assertEquals(driver.switchTo().alert().getText(), "Are you sure you want to give us the deed to your house?");
        driver.switchTo().alert().accept();

    }


}

