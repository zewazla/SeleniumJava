package selenium.test.project.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Rediff_CSS_regular_expression {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("username");
        driver.findElement(By.cssSelector("input#password")).sendKeys("password");
        driver.findElement(By.xpath("//input[contains(@name, 'proceed')]")).click();


    }
}

