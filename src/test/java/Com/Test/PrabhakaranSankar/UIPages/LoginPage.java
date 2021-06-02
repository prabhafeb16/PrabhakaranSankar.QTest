package Com.Test.PrabhakaranSankar.UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {



    public void doLogin(String username, String password ){
        $("#email").sendKeys(username);
        $("#passwd").sendKeys(password);
        $("#SubmitLogin").click();

    }

    public void doLogin(){
        $("#email").sendKeys("prabhafeb16@gmail.com");
        $("#passwd").sendKeys("Test@1234");
        $("#SubmitLogin").click();

    }

    public String accountPageIsVisible(){
        return $("div#center_column h1").getText();
    }

    public void goToContactsUsPage(){
        $(By.linkText("Contact us")).click();
    }

}
