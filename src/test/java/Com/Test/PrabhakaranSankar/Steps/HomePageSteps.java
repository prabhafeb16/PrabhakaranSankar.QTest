package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.HomePage;
import Com.Test.PrabhakaranSankar.UIPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomePageSteps {

    private LoginPage loginPage;
    private HomePage homePage;


    @Step
    public void userShouldBeLogin(){
        Assert.assertTrue(loginPage.accountPageIsVisible().equals("MY ACCOUNT"));
    }

    @Step
    public void navigateToContactsUsPage(){
        loginPage.goToContactsUsPage();
    }

    @When("User search for a {string} with a {string} from home page")
    public String searchProduct(String searchKey, String productName){
        return homePage.doSearch(searchKey, productName);
    }

    @Given("User navigate to MyAccount page")
    public void navigateToUserAccountPage(){
        homePage.myAccountButton();
    }
}
