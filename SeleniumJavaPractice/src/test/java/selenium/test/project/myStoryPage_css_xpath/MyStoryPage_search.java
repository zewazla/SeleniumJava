package selenium.test.project.myStoryPage_css_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStoryPage_search {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("chiffon");
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='row']/div[2]/h1/span")).getText());
    }
}