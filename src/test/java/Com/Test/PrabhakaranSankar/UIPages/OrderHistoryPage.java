package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


import java.util.List;


public class OrderHistoryPage extends PageObject {

    public String OrderHistoryTitle(){
        return find(By.cssSelector("h1[class='page-heading bottom-indent']")).getText();
    }

    public boolean totalOrder(String RefNumber) {
       List <WebElementFacade> orders=  findAll("(//a[@class='color-myaccount'])");
        int OrderCount = orders.size();
        for (int i =0; i<= OrderCount; i++){
            String orderNumber = orders.get(i).getText();
            if(RefNumber.contains(orderNumber));{
                return true;
            }
    }
        return false;
    }
}
