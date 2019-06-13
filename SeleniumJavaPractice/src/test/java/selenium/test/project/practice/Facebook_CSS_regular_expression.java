package selenium.test.project.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook_CSS_regular_expression {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://pl-pl.facebook.com/");
        driver.findElement(By.cssSelector("input[name*= 'email']")).sendKeys("hello");
        driver.findElement(By.cssSelector("input[name*= 'pass']")).sendKeys("1234");
        driver.findElement(By.cssSelector("input[value*= 'Zaloguj się']")).click();
    }
}

