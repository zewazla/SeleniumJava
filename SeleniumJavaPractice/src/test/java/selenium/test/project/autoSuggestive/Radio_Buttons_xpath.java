package selenium.test.project.autoSuggestive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Buttons_xpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");

        driver.findElement(By.xpath("//input[@value='Milk']")).click();

        //how to find number of radio buttons? just print it size:
        //System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());


    }


}

