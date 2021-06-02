package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ShippingPage extends PageObject {

    public String shippingPageTitle(){
        return find(By.cssSelector("h1[class='page-heading']")).getText();
    }

    public void selectTermAndServices(){
//        $("span input[type='checkbox']").click();
        WebElementFacade element = find(By.cssSelector("span input[type='checkbox']"));
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("arguments[0].click();", element);    }

    public void proceedToCheckout(){
        $("button[class='button btn btn-default standard-checkout button-medium'] span").click();
    }
}
