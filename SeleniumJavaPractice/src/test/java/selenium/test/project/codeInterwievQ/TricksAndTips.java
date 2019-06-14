package selenium.test.project.codeInterwievQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TricksAndTips {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=eu");
        driver.findElement(By.cssSelector("#username")).sendKeys("username");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        driver.findElement(By.cssSelector("#Login")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());

    }
}