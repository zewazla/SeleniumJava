package selenium.test.project.myStoryPage_css_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStoryPage_login {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector("a[class*='login']")).click();
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("email");
        driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("password");
        driver.findElement(By.id("SubmitLogin")).click();

    }
}