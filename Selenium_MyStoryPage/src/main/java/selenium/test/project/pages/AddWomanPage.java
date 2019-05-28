package selenium.test.project.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddWomanPage extends AbstractPage {


    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
    private WebElement womanButton;


    public AddWomanPage(WebDriver driver) {
        super(driver);
    }

    //otworzenie podstrony woman
    public WomanPage openAddWomanPage() {
        clickElement(womanButton);
        return new WomanPage(driver);

    }
}