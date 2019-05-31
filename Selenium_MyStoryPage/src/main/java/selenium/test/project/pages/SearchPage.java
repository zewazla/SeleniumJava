package selenium.test.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage{

    @FindBy(id = "search" )
    private WebElement searchField;

    @FindBy (xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")
    private WebElement searchButton;

    public SearchPage(WebDriver driver){
        super(driver);
    }

    public void fillSearchForm (String search){
        fillField(searchField, search);
    }

    public DashboardPage submitSearchForm(){
        clickElement(searchButton);
        return new DashboardPage(driver);
    }

}
