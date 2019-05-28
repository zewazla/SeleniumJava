package selenium.test.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
    private WebElement addWomanPageLink;


    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    public WomanProductPage goToWomanPage() {
        clickElement(addWomanPageLink);
        return new WomanProductPage(driver);
    }

}
