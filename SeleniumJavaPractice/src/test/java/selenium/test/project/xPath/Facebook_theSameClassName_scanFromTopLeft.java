package selenium.test.project.xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook_theSameClassName_scanFromTopLeft {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://pl-pl.facebook.com/");
        driver.findElement(By.className("inputtext")).sendKeys("hello");
        driver.findElement(By.className("inputtext")).sendKeys("1234");

    }
}