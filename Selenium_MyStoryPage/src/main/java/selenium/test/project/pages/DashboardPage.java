package selenium.test.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends AbstractPage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    public WomanPage goToWomanPage() {
        WebElement addWomanLink = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
        clickElement(addWomanLink);
        return new WomanPage(driver);
    }

}
