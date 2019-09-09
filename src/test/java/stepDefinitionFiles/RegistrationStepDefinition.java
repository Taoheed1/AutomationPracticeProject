package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModels.RegistrationObjectModel;
import testData.DataSet;

public class RegistrationStepDefinition {
    WebDriver driver=null;

    public RegistrationStepDefinition (BaseStepDefinition baseStepDefinition){
        this.driver = baseStepDefinition.driver;
    }

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        driver.get(DataSet.registerPageURL);
    }

    @When("User enters a valid details into fields")
    public void user_enters_a_valid_details_into_fields() {

     RegistrationObjectModel.email(null).sendKeys("mk@yahoo.com");
     //RegistrationObjectModel.
    }

    @When("User clicks on submit button")
    public void user_clicks_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("confirm that an appropriate username message has appeared, after account is created")
    public void confirm_that_an_appropriate_username_message_has_appeared_after_account_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
