package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderConfirmationPage extends PageObject {


    public String OrderConfirmationPageTitle(){
        return find(By.cssSelector("h1[class='page-heading']")).getText();
    }

    public String getOrderPrice(){
        return find(By.cssSelector("span[class='price'] strong")).getText();
    }

    public String getOrderReference(){
        return $("//strong[text()='RTP']/following-sibling::br[1]").getText();
    }
}
