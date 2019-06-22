package selenium.test.project.autoSuggestive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_currentDate {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        //  //a[@value='MAA']  this xpath have two option. We have to tell Selenium to click second xpath
        //   write in your code --> (//a[@value='MAA'])[2]

        // //a[@value='BLR']

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();



        //actual date have unic class: class="ui-state-default ui-state-highlight ui-state-active"
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();



    }
}