package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderSummaryPage extends PageObject {

    public String OrderSummaryPageTitle(){
        return find(By.cssSelector("h1[class='page-heading']")).getText();
    }

    public void iConfirmMyOrder(){
        $("button[class='button btn btn-default button-medium'] span").click();
    }

    public String totalPrice(){
        return find(By.cssSelector("p span[class='price']")).getText();
    }
}
