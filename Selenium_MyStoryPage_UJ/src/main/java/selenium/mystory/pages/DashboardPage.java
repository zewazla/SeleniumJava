package selenium.mystory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    private WebElement loginMenuLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/p")
    private WebElement addInfoNewsletter;

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    public LoginPage goToLoginPage(){
    clickElement(loginMenuLink);
    return new LoginPage(driver);
    }
    public boolean isInfoAddNewsletterDisplayed() {
        return addInfoNewsletter.isDisplayed();
    }
}
