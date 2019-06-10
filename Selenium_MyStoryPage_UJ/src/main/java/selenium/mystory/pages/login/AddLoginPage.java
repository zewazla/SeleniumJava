package selenium.mystory.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.mystory.pages.AbstractPage;

public class AddLoginPage extends AbstractPage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
    private WebElement saveButton;

    public AddLoginPage(WebDriver driver) {
        super(driver);
    }

    public AddLoginPage fillAddLoginForm(String email, String passwd) {
        fillField(emailField, email);
        fillField(passwordField, passwd);
        return this;
    }

    public LoginPage submitAddLoginForm() {
        clickElement(saveButton);
        return new LoginPage(driver);
    }
}
