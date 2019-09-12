package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjectModels.RegistrationObjectModel;
import testData.DataSet;

public class RegistrationStepDefinition {

    private WebDriver driver = null;
    private String email = null;

    public RegistrationStepDefinition(BaseStepDefinition baseStepDefinition) {
        this.driver = baseStepDefinition.driver;
        email = DataSet.email;
    }

    //First feature
    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        driver.get(DataSet.registerPageURL);
    }

    @When("User enters a valid email")
    public void user_enters_a_valid_email() {
        RegistrationObjectModel.email(driver).sendKeys(email);
    }

    @When("User clicks on create account button")
    public void user_clicks_on_create_account_button() {
        RegistrationObjectModel.create_an_account_button(driver).click();
    }

    @Then("redirect Them into detail page")
    public void redirect_Them_into_detail_page() {

        Assert.assertEquals("Test failed due to text mismatch", "YOUR PERSONAL INFORMATION", RegistrationObjectModel.sub_heading(driver).getText());
    }

    @When("user enters valid details in to fields")
    public void user_enters_valid_details_in_to_fields() throws InterruptedException {
        RegistrationObjectModel.registration(driver);
    }

    @Then("confirm that an appropriate username message has appeared")
    public void confirm_that_an_appropriate_username_message_has_appeared() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("Test failed due to text mismatch", "MY ACCOUNT", driver.findElement(By.xpath(RegistrationObjectModel.succesful_registration_message_xpath)).getText());
        RegistrationObjectModel.logout_registration_account(driver).click();
    }


    //second feature
    @Given("User is on the registration page-two")
    public void user_is_on_the_registration_page_two() {
        driver.get(DataSet.registerPageURL);
    }

    @When("User enters the same email for registration-two")
    public void user_enters_the_same_email_for_registration_two() {
        RegistrationObjectModel.email(driver).sendKeys(email);
    }

    @When("User clicks on create account button-two")
    public void user_clicks_on_create_account_button_two() {
        RegistrationObjectModel.create_an_account_button(driver).click();
    }

    @Then("present an error message")
    public void present_an_error_message() {
        Assert.assertEquals("Test failed due to text mismatch", "An account using this email address has already been registered. Please enter a valid password or request a new one.", driver.findElement(By.xpath(RegistrationObjectModel.User_enters_the_same_email_for_registration_xpath)).getText());
    }

    //Third scenario
    @Given("User is on the registration page-three")
    public void user_is_on_the_registration_page_three() {
        driver.get(DataSet.registerPageURL);
    }

    @When("User leaves the email field blank")
    public void user_leaves_the_email_field_blank() {
        RegistrationObjectModel.email(driver).sendKeys("");
    }

    @When("User clicks on create account button-three")
    public void user_clicks_on_create_account_button_three() {
        RegistrationObjectModel.create_an_account_button(driver).click();
    }

    @Then("present an error message-three")
    public void present_an_error_message_three() {

        String error_message="Invalid email address.";
        Assert.assertEquals(error_message,driver.findElement(By.xpath(RegistrationObjectModel.user_leaves_the_email_field_blank_xpath)).getText());
    }

    //fourth feature
    @Given("User is on the registration page-four")
    public void user_is_on_the_registration_page_four() {
        driver.get(DataSet.registerPageURL);
    }

    @When("User enters a valid email-four")
    public void user_enters_a_valid_email_four() {
        RegistrationObjectModel.email(driver).sendKeys("mohammad0886@gmail.co.uk");
    }

    @When("User clicks on create account button-four")
    public void user_clicks_on_create_account_button_four() {
        RegistrationObjectModel.create_an_account_button(driver).click();
    }

    @When("user fills in all the fields")
    public void user_fills_in_all_the_fields() {
       RegistrationObjectModel.registration_without_postcode(driver);
    }

    @Then("confirm that an error message has appeared for the postcode format")
    public void confirm_that_an_error_message_has_appeared_for_the_postcode_format() {

        RegistrationObjectModel.addresspostcode(driver).sendKeys("1000");
        RegistrationObjectModel.registerbutton(driver).click();
        String postcode_error_message="The Zip/Postal code you've entered is invalid. It must follow this format: 00000";
        Assert.assertEquals(postcode_error_message,driver.findElement(By.xpath(RegistrationObjectModel.wrong_postcode_format_error_message_xpath)).getText());
    }




}
