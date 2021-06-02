package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.AccPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AccPageSteps {

    private AccPage accPage;

    @Then("He selects Order history option")
    public void selectOrderHistpory(){
        Assert.assertTrue(accPage.getAccPageTitle().contains("My account - My Store"));
        accPage.orderHistory();
    }

    @When("User select Personal Informaiton option from my Account page")
    public void selectPersonalInformation(){
        Assert.assertTrue(accPage.getAccPageTitle().contains("My account - My Store"));
        accPage.personalInformation();
    }

    @Then("He updates First Name field")
    public void updateFirstNameField(){
        Assert.assertTrue(accPage.veriyPersonalInformaitonPageTitle().contains("YOUR PERSONAL INFORMATION"));
        accPage.updatefirstName();
        accPage.updateCurrentPassword();
        accPage.enterNewPassword();
        accPage.confirmPassword();
        accPage.savePersonalInfoChanges();
    }

    @And("He Validated the change")
    public void verifyUpdatedFirstNameField(){
        System.out.println(accPage.getUpdatedName());
        Assert.assertTrue(accPage.getUpdatedName().contains("Your personal information has been successfully updated."));
    }





}
