package selenium.test.project.myStoryPage_css_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStoryPage_newsletter {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector("input#newsletter-input")).sendKeys("email@email.com");
        driver.findElement(By.xpath("//button[@name='submitNewsletter']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='page']/div[2]/div/p")).getText());
    }
}