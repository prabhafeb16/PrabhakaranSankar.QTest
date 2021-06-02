package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    public String cartTitle(){
        return find(By.id("cart_title")).getText();

    }

    public void proceedToCheckout(){

        $("a[class='button btn btn-default standard-checkout button-medium'] span").click();
    }
}
