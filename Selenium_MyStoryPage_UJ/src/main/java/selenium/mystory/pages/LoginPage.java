package selenium.mystory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    private WebElement addLoginLink;

    public LoginPage(WebDriver driver){
    super(driver);
    }

    public AddLoginPage goToLoginPage(){
    clickElement(addLoginLink);
    return new AddLoginPage(driver);
    }
}
