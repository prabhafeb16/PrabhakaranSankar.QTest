package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.OrderSummaryPage;
import Com.Test.PrabhakaranSankar.UIPages.PaymentPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class OrderSummaryPageStep {

    public OrderSummaryPage orderSummaryPage;
    public PaymentPage paymentPage;

    public void veriyOrderTotal(){
        Assert.assertTrue(orderSummaryPage.totalPrice().contains(paymentPage.getTotalOrderPrice()));
    }

    @And("From Order Summary page user place the order")
    public void placeOrder(){
        Assert.assertTrue(orderSummaryPage.OrderSummaryPageTitle().equalsIgnoreCase("Order summary"));
        orderSummaryPage.iConfirmMyOrder();
    }
}
