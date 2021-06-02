package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage loginPage;

    @Given("User navigate to DummySite Login page")
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Then("He Login as a registered {string} and {string} successfully")
    public void loginAsUser(String username, String password){
        loginPage.doLogin(username, password);
    }

    @Step
    public void loginAsUser(){
        loginPage.doLogin();
    }

    @And("He should be in login page")
    public void userShouldBeLogin(){
        Assert.assertTrue(loginPage.accountPageIsVisible().equals("MY ACCOUNT"));
    }

    @Step
    public void navigateToContactsUsPage(){
        loginPage.goToContactsUsPage();
    }



}
