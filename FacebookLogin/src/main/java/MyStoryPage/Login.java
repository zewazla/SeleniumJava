package FacebookLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args){

        //setting driver properties
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to mail.google.com
        driver.navigate().to("http://automationpractice.com/index.php");

        //maximize window
        driver.manage().window().maximize();






    }
}