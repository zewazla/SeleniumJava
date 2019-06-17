package selenium.test.project.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Dynamic_ParentChild_spicejetCom {

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
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();







    }
}