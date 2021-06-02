package Com.Test.PrabhakaranSankar.Steps;

import Com.Test.PrabhakaranSankar.UIPages.ContactUsPage;
import net.thucydides.core.annotations.Step;

public class ContactUsPageSteps {

    private ContactUsPage contactUsPage;

    @Step
    public String fillContactsUsFormStep(){
        return contactUsPage.fillContactsUsPage();
    }

}
