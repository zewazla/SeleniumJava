package selenium.test.project.xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_xpath_with_relationship {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("xpath child parent");
        driver.findElement(By.xpath("//div[@class='gb_Nd gb_f gb_dg gb_4f']/div[2]/a")).click();


    }
}

