package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.OrderConfirmationPage;
import Com.Test.PrabhakaranSankar.UIPages.OrderSummaryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class OrderConfirmationPageStep {
    public OrderSummaryPage orderSummaryPage;
    public OrderConfirmationPage orderConfirmationPage;

    @Then("He will be in OrderConfirmation page")
    public void verifyOrderConfirmationPage(){
        Assert.assertTrue(orderConfirmationPage.OrderConfirmationPageTitle().contains("ORDER CONFIRMATION"));
    }
}

