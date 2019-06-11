package selenium.mystory.tests.addNewProductToCart;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.mystory.pages.addNewProductToCart.NewProductPage;
import selenium.mystory.pages.main.DashboardPage;
import selenium.mystory.tests.AbstractTest;

public class NewProductPageTest extends AbstractTest {

    @Test
    public void successAddNewProductToCartTest(){
        DashboardPage dashboardPage = new DashboardPage(driver);
        NewProductPage newProductPage = dashboardPage.goToNewProductPage();
        newProductPage = newProductPage.submitAddNewProductToCartForm();

        Assert.assertTrue(newProductPage.isInfoBoxNewProductDisplayed());
    }

}
