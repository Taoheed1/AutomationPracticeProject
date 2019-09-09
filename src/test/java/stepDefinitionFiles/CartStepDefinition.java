package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjectModels.CartPage;
import testData.DataSet;

import java.util.concurrent.TimeUnit;

public class CartStepDefinition {

    private WebDriver driver = null;

    public CartStepDefinition(BaseStepDefinition baseStepDefinition) {
        this.driver = baseStepDefinition.driver;
    }

    @Given("a user is on the home page")
    public void a_user_is_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(DataSet.homeURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("a user clicks on the shopping cart")
    public void a_user_clicks_on_the_shopping_cart() {
        // Write code here that turns the phrase above into concrete actions
        CartPage.CartLink(driver).click();
    }

    @Then("the user should be taken to the shopping cart page")
    public void the_user_should_be_taken_to_the_shopping_cart_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        String actualCartTitle = CartPage.CartTitle(driver).getText();
        String expectedCartTitle = "SHOPPING-CART SUMMARY";

        Assert.assertEquals(expectedCartTitle, actualCartTitle);
    }

}
