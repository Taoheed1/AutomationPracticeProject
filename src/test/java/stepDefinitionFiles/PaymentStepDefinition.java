package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModels.*;
import testData.DataSet;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

public class PaymentStepDefinition {

    private WebDriver driver = null;
//    String email = null;
    private int random_generated;


public PaymentStepDefinition(BaseStepDefinition baseStepDefinition) {
    this.driver = baseStepDefinition.driver;
//    this.email = "dummmy_count@hotmail.co.uk";
    random_generated = DataSet.rand_int;
}

    @Given("that I navigate to the register page")
    public void that_I_navigate_to_the_register_page() {
        driver.get(DataSet.registerPageURL);
    }

    @Given("I register an account")
    public void i_register_an_account() {
//        RegistrationObjectModel.email(driver).sendKeys(email);
//        RegistrationObjectModel.create_an_account_button(driver).click();
//        RegistrationObjectModel.registration(driver);
//        Random rand = new Random();
//        int max=1000;
//        random_generated= rand.nextInt(max);
//        RegistrationObjectModel.email(driver).sendKeys("johndoe" + random_generated+"@test.com");
//        RegistrationObjectModel.create_an_account_button(driver).click();
    }

    @Given("I log in with the account details")
    public void i_log_in_with_the_account_details() {
        driver.get(DataSet.registerPageURL);

        driver.findElement(By.id("email")).sendKeys("dummmy_count@hotmail.co.uk");
        driver.findElement(By.id("passwd")).sendKeys("qwerty");
        driver.findElement(By.id("SubmitLogin")).submit();
//        LoginPage.password(driver).sendkeys("something");
//        LoginPage.signIn(driver).submit();
    }

    @When("I add an item to the basket")
    public void i_add_an_item_to_the_basket() {
//        driver.get(DataSet.tShirtCategoryURL);
        driver.findElement(By.xpath(DataSet.tShirtLinkXpath)).click();
        TShirtPage.TShirtAddToCartButton(driver).click();
    }

    @When("I click to proceed to payment")
    public void i_click_to_proceed_to_payment() {
        CartPage.ProceedToCheckout(driver).click();
//        String link = CartPage.ProceedToCheckout(driver).getAttribute("href");
//        driver.navigate().to(link);
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        driver.findElement(By.id("email")).sendKeys("dummmy_count@hotmail.co.uk");
        driver.findElement(By.id("passwd")).sendKeys("qwerty");
        driver.findElement(By.id("SubmitLogin")).sendKeys(Keys.RETURN);
    }

    @Then("I should be taken to the address page")
    public void i_should_be_taken_to_the_address_page() {

//        driver.findElement(By.id("email")).sendKeys("dummmy_count@hotmail.co.uk");
//        driver.findElement(By.id("passwd")).sendKeys("qwerty");
//        driver.findElement(By.id("SubmitLogin")).submit();
//        assertThat(PaymentAddressPage.addressDropdown(driver).isDisplayed());
        String userDeliveryAddressHeader = "//*[@id=\"address_delivery\"]/li[1]/h3";
        assertEquals("YOUR DELIVERY ADDRESS", driver.findElement(By.xpath(userDeliveryAddressHeader)).getText());
    }

    @Given("that I am on the address page")
    public void that_I_am_on_the_address_page() {
//        driver.get("http://automationpractice.com/index.php?controller=order&step=1&multi-shipping=0");
//        driver.get(DataSet.homeURL);
        CartPage.CartLink(driver).click();
        String proceedToShippingPageXpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span";
        driver.findElement(By.xpath(proceedToShippingPageXpath)).click();
    }

    @When("I go to the shipping page")
    public void i_go_to_the_shipping_page() {
        PaymentAddressPage.proceedToCheckout(driver).click();
    }

    @When("the terms of service radio button has not been clicked")
    public void the_terms_of_service_radio_button_has_not_been_clicked() {
        String proceedToPaymentPageXpath = "//*[@id=\"form\"]/p/button/span";
        driver.findElement(By.xpath(proceedToPaymentPageXpath)).click();
    }

    @Then("I should see an alert when I try to continue")
    public void i_should_see_an_alert_when_I_try_to_continue() {
        boolean windowAppeared = PaymentShippingPage.termsAndConditionsAlertWindow(driver).isDisplayed();
        assertTrue(windowAppeared);
    }

    @When("the terms of service button has been clicked")
    public void the_terms_of_service_button_has_been_clicked() {
        PaymentShippingPage.termsAndConditionsCheckbox(driver).click();
        String proceedToPaymentPageXpath = "//*[@id=\"form\"]/p/button/span";
        driver.findElement(By.xpath(proceedToPaymentPageXpath)).click();
    }

    @Then("I should be directed to the next page")
    public void i_should_be_directed_to_the_next_page() {
        String paymentPageMessage = "PLEASE CHOOSE YOUR PAYMENT METHOD";
        String paymentPageMessageXpath = "//*[@id=\"center_column\"]/h1";
        assertEquals(paymentPageMessage, driver.findElement(By.xpath(paymentPageMessageXpath)).getText());
    }

    @Given("that I am on the shipping page")
    public void that_I_am_on_the_shipping_page() {
//        CartPage.CartLink(driver).click();
        String proceedToShippingPageXpath = "//*[@id=\"center_column\"]/form/p/button/span";
        driver.findElement(By.xpath(proceedToShippingPageXpath)).click();

//        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
    }

    @When("I go to the payment page")
    public void i_go_to_the_payment_page() {
        PaymentShippingPage.termsAndConditionsCheckbox(driver).click();
        String proceedToPaymentPageXpath = "//*[@id=\"form\"]/p/button/span";
        driver.findElement(By.xpath(proceedToPaymentPageXpath)).click();
    }

    @Then("I should be able to see the price of the delivery")
    public void i_should_be_able_to_see_the_price_of_the_delivery() {
        assertEquals("$19.25",driver.findElement(By.id("total_price")).getText());
    }

    @Given("that I am on the payment page")
    public void that_I_am_on_the_payment_page() {
//        String proceedToShippingPageXpath = "//*[@id=\"center_column\"]/form/p/button/span";
        driver.findElement(By.xpath(DataSet.proceedToShippingPageXpath)).click();
        PaymentShippingPage.termsAndConditionsCheckbox(driver).click();
//        String proceedToPaymentPageXpath = "//*[@id=\"form\"]/p/button/span";
        driver.findElement(By.xpath(DataSet.proceedToPaymentPageXpath)).click();
    }

    @When("I click to pay by bank wire")
    public void i_click_to_pay_by_bank_wire() {
        PaymentPage.payByBankWire(driver).click();
    }

    @Then("I should see an order summary saying that I chose to pay by bank wire")
    public void i_should_see_an_order_summary_saying_that_I_chose_to_pay_by_bank_wire() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement paymentMethodMessage = wait.until(ExpectedConditions.visibilityOf(PaymentPage.orderSummaryMessage(driver)));
        assertThat(PaymentPage.orderSummaryMessage(driver).getText().contains("bank wire"));
    }

    @When("I click to pay by cheque")
    public void i_click_to_pay_by_cheque() {
        PaymentPage.payByCheque(driver).click();
    }

    @Then("I should see an order summary saying that I chose to pay by cheque")
    public void i_should_see_an_order_summary_saying_that_I_chose_to_pay_by_cheque() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement paymentMethodMessage = wait.until(ExpectedConditions.visibilityOf(PaymentPage.orderSummaryMessage(driver)));
        assertThat(PaymentPage.orderSummaryMessage(driver).getText().contains("cheque"));
    }

    @Given("I have chosen a payment method")
    public void i_have_chosen_a_payment_method() {
        PaymentPage.payByBankWire(driver).click();
    }

    @When("I confirm my order")
    public void i_confirm_my_order() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement paymentMethodMessage = wait.until(ExpectedConditions.visibilityOf(PaymentPage.orderSummaryMessage(driver)));
        PaymentPage.orderConfirmationButton(driver).click();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {

        assertEquals("Your order on My Store is complete.",PaymentPage.orderConfirmationMessage(driver).getText());
    }
}
