package selenium.test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogoutButtonDisplayed() {
        return driver.findElement(
                By.xpath(
                        "//html/body/header/div[2]/div[2]/a/span"
                )
        ).isDisplayed();
    }
}
