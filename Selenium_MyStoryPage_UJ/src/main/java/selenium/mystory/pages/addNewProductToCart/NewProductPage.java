package selenium.mystory.pages.addNewProductToCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.mystory.pages.AbstractPage;

public class NewProductPage extends AbstractPage {


    @FindBy(id = "color_15")
    private WebElement chooseColor;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
    private WebElement addToCartButton;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2")
    private WebElement infoAddNewProduct;

    public NewProductPage(WebDriver driver){
        super(driver);
    }

    public NewProductPage submitAddNewProductToCartForm(){
        clickElement(chooseColor);
        clickElement(addToCartButton);
        return new NewProductPage(driver);
    }

    public boolean isInfoBoxNewProductDisplayed() {
        return infoAddNewProduct.isDisplayed();
    }



}
