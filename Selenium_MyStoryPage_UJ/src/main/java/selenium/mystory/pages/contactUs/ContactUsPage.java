package selenium.mystory.pages.contactUs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.mystory.pages.AbstractPage;

public class ContactUsPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    private WebElement addContactUsLink;

    public ContactUsPage(WebDriver driver) {
        super((driver));
    }

    public AddContactUsPage goToContactUsPage() {
        clickElement(addContactUsLink);
        return new AddContactUsPage(driver);
    }

}

