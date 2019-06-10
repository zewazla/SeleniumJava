package selenium.mystory.pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.mystory.pages.AbstractPage;
import selenium.mystory.pages.contactUs.ContactUsPage;
import selenium.mystory.pages.login.LoginPage;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    private WebElement loginMenuLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/p")
    private WebElement addInfoNewsletter;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    private WebElement contactUsLink;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
    private WebElement newProductLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[4]/div/div[1]/div/a[1]/img")
    private WebElement dressesLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/h1")
    private WebElement addInfoSearch;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")
    private WebElement cartLink;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLoginPage() {
        clickElement(loginMenuLink);
        return new LoginPage(driver);
    }

    public ContactUsPage goToContactUsPage() {
        clickElement(contactUsLink);
        return new ContactUsPage(driver);
    }

    public boolean isInfoAddNewsletterDisplayed() {
        return addInfoNewsletter.isDisplayed();
    }

    public boolean isInfoSearchDisplayed() {
        return addInfoSearch.isDisplayed();
    }

}
