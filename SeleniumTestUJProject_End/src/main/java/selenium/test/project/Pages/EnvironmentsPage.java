package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnvironmentsPage extends AbstractPage {

    @FindBy(xpath = "//html/body/div[1]/section/article/nav/ul/li/a")
    private WebElement addEnvironmentLink;

    @FindBy(id = "j_info_box")
    private WebElement infoBox;

    public EnvironmentsPage(WebDriver driver){
        super(driver);
    }

    public AddEnvironmentPage goToAddEnvironmentPage(){
        clickElement(addEnvironmentLink);
        return new AddEnvironmentPage(driver);
    }

    public boolean isInfoBoxDisplayed(){
        return infoBox.isDisplayed();
    }
}