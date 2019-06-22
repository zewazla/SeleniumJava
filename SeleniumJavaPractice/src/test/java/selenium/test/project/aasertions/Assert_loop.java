package selenium.test.project.aasertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert_loop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
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

        /*int i = 1;
        while(i<4){
             driver.findElement(By.xpath("//button[@class='plus']")).click(); //3 times
             i++;
         }*/

        for(int i = 1; i<5; i++){
            driver.findElement(By.xpath("//button[@class='plus']")).click();
        }

        System.out.println(driver.findElement(By.id("input-AD")).getText());

        Assert.assertEquals(driver.findElement(By.id("input-AD")).getText(), "6 dorośli\n" +
                "DOROŚLI\n" +
                "6\n" +
                "WYBIERZ");

    }
}