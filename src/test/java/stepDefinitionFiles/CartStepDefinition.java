package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjectModels.CartPage;
import pageObjectModels.TShirtPage;
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

    @Given("user is on a product page")
    public void user_is_on_a_product_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");

    }

    @When("the user clicks {string} button")
    public void the_user_clicks_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        Actions actions = new Actions(driver);
        TShirtPage.TShirtAddToCartButton(driver).click();
//        actions.moveToElement(TShirtPage.TShirtAddToCartButton(driver)).perform();
    }

    @Then("the user should see that product within their shopping cart")
    public void the_user_should_see_that_product_within_their_shopping_cart() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        TShirtPage.ProceedToCheckoutButton(driver).click();

        String expectedCartTitle = "SHOPPING-CART SUMMARY";
        CartPage.CartTitle(driver).getText().contains(expectedCartTitle);


//        Assert.assertEquals(expectedCartTitle, actualCartTitle);

        String expectedProductName = "Faded Short Sleeve T-shirts";
//        String actualProductName = driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-orange']")).getCssValue();
        String  actualProductName = driver.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[2]/p/a")).getText();
        Assert.assertEquals(expectedProductName, actualProductName);

    }

}
