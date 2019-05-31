package selenium.test.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "//html/body/header/div[2]/div[2]/a/span")
    private WebElement searchResult;

    @FindBy(id = "search_query_top" )
    private WebElement searchField;

    @FindBy (xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")
    private WebElement searchButton;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public WomanPage goToWomanPage() {
        WebElement addWomanLink = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
        clickElement(addWomanLink);
        return new WomanPage(driver);
    }


}
