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

//    @When("User enters a valid details into fields")
//    public void user_enters_a_valid_details_into_fields() {
//
//
//
//     RegistrationObjectModel.firstname(null).sendKeys("john");
//     RegistrationObjectModel. create_an_account_button(null).click();
//
////        RegistrationObjectModel.title_mr_radio_buttons(null).click();
////        RegistrationObjectModel.title_mrs_radio_buttons(null).click();
//     //RegistrationObjectModel.secondname(null).sendKeys("kool");
//
//    }
//
@When("User enters a valid email")
    public void user_enters_a_valid_email() {
        RegistrationObjectModel.email(driver).sendKeys("johndoe123@test.com");

        }

    @When("User clicks on create account button")
    public void user_clicks_on_create_account_button() {
        RegistrationObjectModel.create_an_account_button(driver).click();
    }

    @Then("redirect Them into detail page")
    public void redirect_Them_into_detail_page() {

    }

    @When("user enters valid details in to fields")
    public void user_enters_valid_details_in_to_fields() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("confirm that an appropriate username message has appeared")
    public void confirm_that_an_appropriate_username_message_has_appeared() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
