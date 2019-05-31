package selenium.test.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomanPage extends AbstractPage {
    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]")
    private WebElement addWomanLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img")
    private WebElement addProductToCart;



    public WomanPage(WebDriver driver) {
        super(driver);
    }

    public AddWomanPage goToAddWomanPage() {
        clickElement(addWomanLink);
        return new AddWomanPage(driver);
    }

    public WomanPage submitAddWomanForm(){
        clickElement(addProductToCart);
        return new WomanPage(driver);
    }
}

