package selenium.test.project.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_mystoryPage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\G\\Desktop\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=contact");
        Select subject = new Select(driver.findElement(By.id("id_contact")));
        subject.selectByValue("2");






    }
}