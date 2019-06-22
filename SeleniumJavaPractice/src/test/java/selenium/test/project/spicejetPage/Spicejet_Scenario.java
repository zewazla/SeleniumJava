package selenium.test.project.spicejetPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet_Scenario {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();

        //choose From Bengaluru
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        //wait for 2 sec for page load
        Thread.sleep(2000);

        //choose To Chennai
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        //click actual date
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();


        //choose checkbox
        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();

        //choose number of passengers
        driver.findElement(By.cssSelector("div[id*='divpaxinfo']")).click();
        driver.findElement(By.id("hrefIncAdt")).click();





    }
}