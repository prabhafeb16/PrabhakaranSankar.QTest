package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;

public class AccPage extends PageObject {

    public void isLogoExist(){
        shouldBeVisible(By.className("logo"));
    }

    public String doSearch(String searchKey, String productName){
        typeInto($("#search_query_top"),searchKey );
        waitForTextToAppear(productName);
        clickOn($("//li[text()='"+productName+"']"));
        return find(By.tagName("h1")).getText();
    }

    public String getAccPageTitle(){
        return getTitle();
    }

    public void orderHistory(){
        $("a[title='Orders'] span").click();
    }

    public void personalInformation(){
        $("a[title='Information'] span").click();
    }

    public String veriyPersonalInformaitonPageTitle(){
        return find(By.cssSelector("h1[class='page-subheading']")).getText();
    }

    public void updatefirstName(){
        find(By.cssSelector("input[name='firstname']")).clear();
        find(By.cssSelector("input[name='firstname']")).sendKeys("prabha");
    }

    public void updateCurrentPassword(){
        find(By.cssSelector("input[name='old_passwd']")).sendKeys("Test@1234");
    }

    public void enterNewPassword(){
        find(By.cssSelector("input[name='passwd']")).sendKeys("Test@1234");
    }
    public void confirmPassword(){
        find(By.cssSelector("input[name='confirmation']")).sendKeys("Test@1234");
    }

    public void savePersonalInfoChanges(){
        find(By.cssSelector("button[name='submitIdentity'] span")).click();
    }

    public String timestamp(){
        Date date = new Date();
        Timestamp ts=new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println(formatter.format(ts));
        return formatter.format(ts);
    }

    public String getUpdatedName(){
        return find(By.cssSelector("p[class='alert alert-success']")).getText();
    }
}
