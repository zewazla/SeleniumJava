package selenium.mystory.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.mystory.pages.AbstractPage;
import selenium.mystory.pages.login.AddLoginPage;

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
