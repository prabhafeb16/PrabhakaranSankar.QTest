package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductDetailPage extends PageObject {
    public void selectAddToCart(){
        $("//span[text()='Add to cart']").click();
       // $(By.xpath("//span[text()='Add to cart']")).click();
    }

    public boolean miniCart(){
        return find(By.id("layer_cart")).isCurrentlyEnabled();
    }

    public void proceedToCheckout(){
        waitFor((WebElementFacade) find(By.cssSelector("a[title='Proceed to checkout'] span")));
        $("a[title='Proceed to checkout'] span").click();
    }
}
