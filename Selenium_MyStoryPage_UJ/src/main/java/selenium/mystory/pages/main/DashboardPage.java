package selenium.mystory.pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.mystory.pages.AbstractPage;
import selenium.mystory.pages.addNewProductToCart.NewProductPage;
import selenium.mystory.pages.contactUs.ContactUsPage;
import selenium.mystory.pages.login.LoginPage;

public class DashboardPage extends AbstractPage {


    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    private WebElement loginMenuLink;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    private WebElement logoutButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/p")
    private WebElement addInfoNewsletter;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    private WebElement contactUsLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/h1")
    private WebElement addInfoSearch;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p")
    private WebElement infoSendMessageBox;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/ul/li[2]/a")
    private WebElement bestsellers;

    @FindBy(xpath = "//*[@id=\"blockbestsellers\"]/li[1]/div/div[2]/h5/a")
    private WebElement chooseDresses;




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


    public boolean isLogoutButtonDisplayed() {
        return logoutButton.isDisplayed();
    }

    public boolean isInfoAddNewsletterDisplayed() {
        return addInfoNewsletter.isDisplayed();
    }

    public boolean isInfoSearchDisplayed() {
        return addInfoSearch.isDisplayed();
    }

    public boolean isInfoSendMessageDisplayed() {
        return infoSendMessageBox.isDisplayed();
    }


    public NewProductPage goToNewProductPage() {
        clickElement(bestsellers);
        clickElement(chooseDresses);
        return new NewProductPage(driver);
    }


}

