package selenium.mystory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterPage extends AbstractPage {

    @FindBy(id = "newsletter-input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/div/div[3]/footer/div/div[1]/div/form/div/button")
    private WebElement submitButton;

    public NewsletterPage(WebDriver driver){
    super(driver);
}

    public NewsletterPage fillNewsletterForm(String email){
    fillField(emailField, email);
    return this;
    }

    public DashboardPage submitNewsletterForm(){
    clickElement(submitButton);
    return new DashboardPage(driver);
    }
}

