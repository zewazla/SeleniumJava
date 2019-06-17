package selenium.test.project.autoSuggestive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Buttons_loop {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");

        int button = driver.findElements(By.xpath("//input[@name='group2']")).size();

        for (int i = 0; i < button; i++) {
            String text = driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");

            if (text.equals("Beer")){
                driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
            }


        }
    }
}

