package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductDetialPageSteps {
    private ProductDetailPage productDetailPage;

    @Then("He add the product to basket")
    public void selectAddToCartButton(){
        productDetailPage.selectAddToCart();
    }

    @And("He proceed to checkout")
    public void proceedToCheckout(){
        Assert.assertTrue(productDetailPage.miniCart());
        productDetailPage.proceedToCheckout();

    }


}
