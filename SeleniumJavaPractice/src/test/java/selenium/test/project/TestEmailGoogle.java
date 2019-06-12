package selenium.test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestEmailGoogle {
    public static void main(String[] args){

        //setting driver properties
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to mail.google.com
        driver.navigate().to("http://mail.google.com");

        //maximize window
        driver.manage().window().maximize();

        //wait for element to load
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //enter email id
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("seleniumisfun@gmail.com");

        //click on next button
        driver.findElement(By.cssSelector("#identifierNext")).click();

        //wait for page loading
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        //enter password
        driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Seleniumisfun;");

        //click next button
        driver.findElement(By.cssSelector("#passwordNext > content > span")).click();

        //wait for page loading
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }
}