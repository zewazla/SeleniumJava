package selenium.test.project.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_loop_for_click {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://fly.pl/");
        driver.findElement(By.id("input-AD")).click();
        Thread.sleep(2000);
        /*
        driver.findElement(By.xpath("//button[@class='plus']")).click();
        driver.findElement(By.xpath("//button[@class='plus']")).click();
        driver.findElement(By.xpath("//button[@class='plus']")).click();
        */

        //create the loop for 3 click on website

        int i = 1;
        while(i<4){
             driver.findElement(By.xpath("//button[@class='plus']")).click(); //3 times
             i++;
         }

        driver.findElement(By.xpath("//button[@class='btn btn-fly btn-block bold']")).click();





    }
}