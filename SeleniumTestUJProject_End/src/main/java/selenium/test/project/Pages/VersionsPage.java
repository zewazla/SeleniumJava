package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VersionsPage extends AbstractPage {

    @FindBy(xpath = "//html/body/div[1]/section/article/nav/ul/li/a")
    private WebElement addVersionLink;

    @FindBy(id = "j_info_box")
    private WebElement infoBox;

    public VersionsPage(WebDriver driver){
        super(driver);
    }

    public AddVersionPage goToAddVersionPage(){
        clickElement(addVersionLink);
        return new AddVersionPage(driver);
    }

    public boolean isInfoBoxDisplayed(){
        return infoBox.isDisplayed();
    }
}