package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEnvironmentPage extends AbstractPage {

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(id = "save")
    private WebElement saveButton;

    public AddEnvironmentPage(WebDriver driver) {
        super(driver);
    }

    public AddEnvironmentPage fillAddEnvironmentForm(String name, String description){
        fillField(nameField,name);
        fillField(descriptionField,description);
        return this;
    }

    public EnvironmentsPage submitAddEnvironmentForm(){
        clickElement(saveButton);
        return new EnvironmentsPage(driver);
    }
}
