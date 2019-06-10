package selenium.mystory.pages.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.mystory.pages.AbstractPage;
import selenium.mystory.pages.DashboardPage;

public class SearchPage extends AbstractPage {

    @FindBy(id = "search_query_top")
    private WebElement searchField;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")
    private WebElement submitButton;

    public SearchPage(WebDriver driver){
        super(driver);
    }

    public SearchPage fillSearchForm(String search){
        fillField(searchField, search);
        return this;
    }

    public DashboardPage submitSearchForm(){
        clickElement(submitButton);
        return new DashboardPage(driver);
    }
}

