package selenium.test.project.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook_CSSfromHtml_usingHashTag {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://pl-pl.facebook.com/");
        driver.findElement(By.cssSelector("input#email")).sendKeys("hello");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("1234");
        driver.findElement(By.cssSelector("input#u_0_a")).click();
    }
}