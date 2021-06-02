package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.ShippingPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class ShippingPageStep {
    public ShippingPage shippingPage;

    @And("From shipping page he proceed to payment page")
    public void proceedToChckout(){
        Assert.assertTrue(shippingPage.shippingPageTitle().equalsIgnoreCase("Shipping"));
        shippingPage.selectTermAndServices();
        shippingPage.proceedToCheckout();
    }
}
