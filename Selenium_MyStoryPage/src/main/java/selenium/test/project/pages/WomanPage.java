package selenium.test.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomanPage extends AbstractPage {
    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]")
    private WebElement addWomanLink;


    public WomanPage(WebDriver driver) {
        super(driver);
    }

    public AddWomanPage goToAddWomanPage() {
        clickElement(addWomanLink);
        return new AddWomanPage(driver);
    }

}

