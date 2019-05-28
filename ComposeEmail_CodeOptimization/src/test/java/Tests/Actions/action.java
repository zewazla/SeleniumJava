package Tests.Actions;

import Tests.Actions.CssSelectors.selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class action extends selectors {
    WebDriver driver;
    public void navigateURL(String URL){

        //setting driver properties
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Lenovo\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        //navigate to mail.google.com
        driver.navigate().to(URL);

        //maximize window
        driver.manage().window().maximize();
    }

    public void waitDriverForGivenSeconds(int sec){
        //wait for element to load
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public void loginGmail(){
        //enter email id
        driver.findElement(By.cssSelector(email)).sendKeys("seleniumisfun@gmail.com");

        //click on next button
        driver.findElement(By.cssSelector(next)).click();
}

    public void enterPassword(){
        //enter password
        driver.findElement(By.cssSelector(password)).sendKeys("Seleniumisfun;");

        //click next button
        driver.findElement(By.cssSelector(signIn)).click();
    }

    public void composeEmail(){
        //COMPOSE EMAIL
        //click compose button
        driver.findElement(By.xpath(composeButton)).click();

        //wait for loading page
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //input person
        driver.findElement(By.cssSelector(mailTo)).sendKeys("seleniumisfun@gmail.com");

        //input subject mail
        driver.findElement(By.cssSelector(mailSubject)).sendKeys("Test");

        //input message
        driver.findElement(By.cssSelector(mailMessage)).sendKeys("Test Selenium Web Driver");

        //click send button
        driver.findElement(By.id(sentButton)).click();

    }

    public void CloseAndQuitDriver(){
        driver.close();
        driver.quit();
    }
}
