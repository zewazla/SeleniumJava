package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddVersionPage extends AbstractPage {

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(id = "save")
    private WebElement saveButton;

    public AddVersionPage(WebDriver driver) {
        super(driver);
    }

    public AddVersionPage fillAddVersionForm(String name, String description){
        fillField(nameField,name);
        fillField(descriptionField,description);
        return this;
    }

    public VersionsPage submitAddVersionForm(){
        clickElement(saveButton);
        return new VersionsPage(driver);
    }
}
