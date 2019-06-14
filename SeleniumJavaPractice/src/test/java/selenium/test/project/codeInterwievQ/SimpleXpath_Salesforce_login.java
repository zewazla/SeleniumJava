package selenium.test.project.codeInterwievQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleXpath_Salesforce_login {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=eu");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());

    }
}