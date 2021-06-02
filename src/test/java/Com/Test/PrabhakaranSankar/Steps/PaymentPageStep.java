package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.PaymentPage;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PaymentPageStep {

    public PaymentPage paymentPage;

    @When("User in Payment page he selects payment option as Bank transfer")
    public void selectPaymentMethod(){
       Assert.assertTrue(paymentPage.paymentPageTitle().equalsIgnoreCase("Please choose your payment method"));
       paymentPage.payByBank();
    }
}
