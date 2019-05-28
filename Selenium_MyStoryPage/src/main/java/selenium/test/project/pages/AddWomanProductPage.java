package selenium.test.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddWomanProductPage extends AbstractPage {


    @FindBy(id = "open")
    private WebElement openButton;


    public AddWomanProductPage(WebDriver driver) {
        super(driver);
    }


    public WomanProductPage submitAddWomanForm(){
        clickElement(openButton);
        return new WomanProductPage(driver);
    }
}
