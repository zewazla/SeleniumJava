package selenium.test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage fillLoginForm(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    public DashboardPage submitLoginForm() {
        driver.findElement(By.id("login")).click();
        return new DashboardPage(driver);
    }
}
