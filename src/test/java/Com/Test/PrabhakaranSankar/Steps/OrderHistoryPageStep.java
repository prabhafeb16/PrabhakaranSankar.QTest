package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.OrderConfirmationPage;
import Com.Test.PrabhakaranSankar.UIPages.OrderHistoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.util.List;

public class OrderHistoryPageStep {

    public OrderHistoryPage orderHistoryPage;
    public OrderConfirmationPage orderConfirmationPage;
    @Then("He will be navigate to OrderHistory page")
    public void OrderHistoryPage(){
        Assert.assertTrue(orderHistoryPage.OrderHistoryTitle().contains("ORDER HISTORY"));
    }

    @And("He see the place order reference number")
    public void verifyPlacedOrderDisplayed(){
//        String OrderRef= orderConfirmationPage.getOrderReference();
       String OrderRef="RUUZAFKGT";
    Assert.assertTrue(orderHistoryPage.totalOrder(OrderRef));
}
}
