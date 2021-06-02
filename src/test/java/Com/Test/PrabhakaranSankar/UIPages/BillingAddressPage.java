package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BillingAddressPage extends PageObject {

    public String pageTitle(){
        return find(By.cssSelector("h1[class='page-heading']")).getText();
    }

    public void proceedToCheckout(){
        $("button[class='button btn btn-default button-medium'] span").click();
    }
}
