package selenium.test.project.autoSuggestive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar_getAttribute_afterAndBeforeClickingRadioButton {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.spicejet.com/");

        
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));        //print attribute before clicking radio button
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));        //print attribute after ckicking radio button

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("2"))           //logic
        {
            System.out.println("is enable");
            Assert.assertTrue(true);
        }
        else
        {
            System.out.println("is disable");
            Assert.assertFalse(false);
        }
    }
}