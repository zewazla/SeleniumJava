package selenium.test.project.codeInterwievQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleCSS_Salesforce_login {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=eu");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("username");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");
        driver.findElement(By.cssSelector("input[id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div[id='error']")).getText());

    }
}