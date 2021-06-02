package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class PaymentPage extends PageObject {

    public String paymentPageTitle(){
        return find(By.cssSelector("h1[class='page-heading']")).getText();
    }

    public void payByBank(){
        WebElementFacade element = find(By.cssSelector("a[title='Pay by bank wire']"));
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("arguments[0].click();", element);
    }


    public String getTotalOrderPrice(){
        return find(By.cssSelector("span[id='total_price']")).getText();
    }
}
