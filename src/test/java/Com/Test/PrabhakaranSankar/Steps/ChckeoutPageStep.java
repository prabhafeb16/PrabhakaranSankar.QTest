package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.CheckoutPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class ChckeoutPageStep {
    public CheckoutPage checkoutPage;

    @And("User in checkout page he proceed to billing address page")
    public void ContinueToPayment(){
        Assert.assertTrue(checkoutPage.cartTitle().contains("SHOPPING-CART SUMMARY"));
        checkoutPage.proceedToCheckout();
    }
}
