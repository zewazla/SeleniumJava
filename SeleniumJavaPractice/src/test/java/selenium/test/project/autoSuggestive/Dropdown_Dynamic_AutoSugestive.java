package selenium.test.project.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Dynamic_AutoSugestive {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.fly.com/");

        WebElement from = driver.findElement(By.id("searchinput-from"));

        from.sendKeys("MUMBAI");
        Thread.sleep(2000);
        from.sendKeys(Keys.ENTER);


        WebElement to = driver.findElement(By.id("searchinput-to"));

        to.sendKeys("DEL");
        Thread.sleep(2000);

        for(int i = 1; i<5; i++){
            to.sendKeys(Keys.ARROW_DOWN);
        }
        to.sendKeys(Keys.ENTER);

    }

}