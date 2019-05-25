package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "//html/body/header/div[2]/div[2]/a/span")
    private WebElement logoutButton;

    @FindBy(xpath = "//html/body/aside/div/ul/li[4]")
    private WebElement environmentsMenuLink;

    @FindBy(xpath = "//html/body/aside/div/ul/li[5]")
    private WebElement versionsMenuLink;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoutButtonDisplayed() {
        return logoutButton.isDisplayed();
    }

    public EnvironmentsPage goToEnvironmentsPage(){
        clickElement(environmentsMenuLink);
        return new EnvironmentsPage(driver);
    }

    public VersionsPage goToVersionsPage(){
        clickElement(versionsMenuLink);
        return new VersionsPage(driver);
    }
}
