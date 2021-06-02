package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public String doSearch(String searchKey, String productName){
        typeInto($("#search_query_top"),searchKey );
        waitForTextToAppear(productName);
        clickOn($("//li[text()='"+productName+"']"));
        return find(By.tagName("h1")).getText();

    }

    public void myAccountButton(){
        $("a[title='View my customer account'] span").click();
    }

}
