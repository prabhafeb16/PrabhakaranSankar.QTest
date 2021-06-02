package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.BillingAddressPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;

public class BillingAddressPageStep {
    public BillingAddressPage billingAddressPage;

    @Then("From billing address page he proceed to shipping Page")
    public void proceedToChckout(){
        Assert.assertTrue(billingAddressPage.pageTitle().equalsIgnoreCase("Addresses"));
        billingAddressPage.proceedToCheckout();
    }
}
