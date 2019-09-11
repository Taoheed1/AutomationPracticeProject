package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjectModels.AddressPaymentPage;
import pageObjectModels.CartPage;
import pageObjectModels.ShippingPaymentPage;
import pageObjectModels.TShirtPage;
import testData.DataSet;

import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

public class PaymentStepDefinition {

    private WebDriver driver = null;

public PaymentStepDefinition(BaseStepDefinition baseStepDefinition) {
    this.driver = baseStepDefinition.driver;
}

    @Given("that I navigate to the register page")
    public void that_I_navigate_to_the_register_page() {
        driver.get(DataSet.authenticationURL);
    }

    @Given("I register an account")
    public void i_register_an_account() {
//        RegistrationObjectModel.registration(driver);
    }

    @Given("I log in with the account details")
    public void i_log_in_with_the_account_details() {
//        LoginPage.emailAddress(driver).sendkeys("something");
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("passwd")).sendKeys("");
        driver.findElement(By.id("SubmitLogin")).submit();
//        LoginPage.password(driver).sendkeys("something");
//        LoginPage.signIn(driver).submit();
    }

    @When("I add an item to the basket")
    public void i_add_an_item_to_the_basket() {
        driver.get(DataSet.tShirtCategoryURL);
        TShirtPage.TShirtAddToCartButton(driver).click();
    }

    @When("I click to proceed to payment")
    public void i_click_to_proceed_to_payment() {
        CartPage.ProceedToCheckout(driver).click();
    }

    @Then("I should be taken to the address page")
    public void i_should_be_taken_to_the_address_page() {
        assertThat(AddressPaymentPage.addressDropdown(driver).isDisplayed());
    }

    @Given("that I am on the address page")
    public void that_I_am_on_the_address_page() {
        throw new cucumber.api.PendingException();
    }

    @When("I go to the shipping page")
    public void i_go_to_the_shipping_page() {
        AddressPaymentPage.proceedToCheckout(driver);
    }

    @When("the terms of service radio button has not been clicked")
    public void the_terms_of_service_radio_button_has_not_been_clicked() {
        ShippingPaymentPage.termsAndConditionsCheckbox(driver);
    }

    @Then("I should see an alert when I try to continue")
    public void i_should_see_an_alert_when_I_try_to_continue() {
        boolean windowAppeared = ShippingPaymentPage.termsAndConditionsAlertWindow(driver).isDisplayed();
//        assertEquals(True, windowAppeared);
        assertTrue(windowAppeared);
    }

    @When("the terms of service button has been clicked")
    public void the_terms_of_service_button_has_been_clicked() {
        throw new cucumber.api.PendingException();
    }

    @Then("I should be directed to the next page")
    public void i_should_be_directed_to_the_next_page() {
        throw new cucumber.api.PendingException();
    }
}
