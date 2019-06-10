package selenium.mystory.pages.contactUs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.mystory.pages.AbstractPage;

public class AddContactUsPage extends AbstractPage {

    @FindBy(id = "id_contact")
    private WebElement subjectHeading;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[1]/div/select/option[2]")
    private WebElement customerService;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "message")
    private WebElement messageField;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/fieldset/div[2]/button/span")
    private WebElement sendButton;

    public AddContactUsPage(WebDriver driver){
        super((driver));
    }

    public AddContactUsPage fillAddContactUsForm(String email, String message){
        fillField(emailField, email);
        fillField(messageField, message);
        return this;
    }

    public ContactUsPage submitAddContactUsForm(){
        clickElement(sendButton);
        return new ContactUsPage(driver);
    }

}


