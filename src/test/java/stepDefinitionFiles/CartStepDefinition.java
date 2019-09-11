package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModels.CartPage;
import pageObjectModels.DressesPage;
import pageObjectModels.HomePage;
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
        driver.get(DataSet.homeURL);
    }

    @When("a user clicks on the shopping cart")
    public void a_user_clicks_on_the_shopping_cart() {
        CartPage.CartLink(driver).click();
    }

    @Then("the user should be taken to the shopping cart page")
    public void the_user_should_be_taken_to_the_shopping_cart_page() {
        String actualCartTitle = CartPage.CartTitle(driver).getText();
        String expectedCartTitle = "SHOPPING-CART SUMMARY";

        // Assert to check whether test has been redirected to shopping cart using previously declared variables.
        Assert.assertEquals(expectedCartTitle, actualCartTitle);
    }

    @Given("user is on a product page")
    public void user_is_on_a_product_page() {

        // Load driver onto a product category page and add an item to basket. In this case a product from the T-shirt category.
        driver.get(DataSet.tShirtCategoryURL);

    }

    @When("the user clicks {string} button")
    public void the_user_clicks_button(String string) {
        TShirtPage.TShirtAddToCartButton(driver).click();
    }

    @Then("the user should see that product within their shopping cart")
    public void the_user_should_see_that_product_within_their_shopping_cart() {

        // Go to shopping cart.
        TShirtPage.ProceedToCheckoutButton(driver).click();

        // Check test is on the shopping cart page.
        String expectedCartTitle = "SHOPPING-CART SUMMARY";
//        CartPage.CartTitle(driver).getText().contains(expectedCartTitle);

        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        boolean actualResult;

        if (CartPage.CartTitle(driver).getText().contains(expectedCartTitle)) {
            actualResult = true;
        } else {
            actualResult = false;
        }

        Assert.assertEquals(true, actualResult);

        // Check to see if selected item is within the shopping cart.
        String expectedProductName = "Faded Short Sleeve T-shirts";
        String  actualProductName = driver.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[2]/p/a")).getText();
        Assert.assertEquals(expectedProductName, actualProductName);

    }

    @Given("user is viewing the shopping cart page")
    public void user_is_viewing_the_shopping_cart_page() {

        // Begin test by going to a product page and adding item to basket. In this case the T-shirt category.
        driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
        TShirtPage.TShirtAddToCartButton(driver).click();

        // Proceed to shopping cart page.
        TShirtPage.ProceedToCheckoutButton(driver).click();

        // Check that test is now on shopping cart page
        String expectedCartTitle = "SHOPPING-CART SUMMARY";
//        CartPage.CartTitle(driver).getText().contains(expectedCartTitle);

        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        boolean actualResult;

        if (CartPage.CartTitle(driver).getText().contains(expectedCartTitle)) {
            actualResult = true;
        } else {
            actualResult = false;
        }

        Assert.assertEquals(true, actualResult);

    }

    @When("the user clicks the {string} button on a product to add another item to the basket")
    public void the_user_clicks_the_button_on_a_product_to_add_another_item_to_the_basket(String string) {

        String sValue = CartPage.TotalProductPrice(driver).getText().replaceAll("\\$", "");
        double dValue = Double.parseDouble(sValue);
        Assert.assertEquals(16.51, dValue, 0.001);

        // Click the add item button.
        CartPage.AddItemButton(driver).click();
        // refresh driver
        driver.navigate().refresh();
    }

    @Then("the total number of products within the basket should increase")
    public void the_total_number_of_products_within_the_basket_should_increase() {

        // Get string of the quantity of item and compare to expected
        String value = CartPage.QuantityWindow(driver).getAttribute("value");
        Assert.assertEquals("2", value);

        // Get string of the total (price of the item * quantity) and compare
        String sValue = CartPage.TotalProductPrice(driver).getText().replaceAll("\\$", "");
        double dValue = Double.parseDouble(sValue);
        Assert.assertEquals(33.02, dValue, 0.001);
    }

    @Given("a user has added items to their cart")
    public void a_user_has_added_items_to_their_cart() {
        driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
        TShirtPage.TShirtAddToCartButton(driver).click();

        // Proceed to shopping cart page.
        TShirtPage.ProceedToCheckoutButton(driver).click();
    }

    @When("the user clicks the {string} button on the dropdown next to the item")
    public void the_user_clicks_the_button_on_the_dropdown_next_to_the_item(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().refresh();
        Actions actions = new Actions(driver);
        actions.moveToElement(CartPage.DropdownCart(driver)).perform();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a")));
        CartPage.DropdownCart(driver).findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a")).click();

    }

    @Then("the item should be cleared from the shopping cart")
    public void the_item_should_be_cleared_from_the_shopping_cart() {

        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        boolean actualResult;

        if (CartPage.DropdownCart(driver).getText().contains("empty")) {
            actualResult = true;
        } else {
            actualResult = false;
        }

        Assert.assertEquals(true, actualResult);
    }

    @Given("user has added one item to the cart and is at the cart page")
    public void user_has_added_one_item_to_the_cart_and_is_at_the_cart_page() {
        driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
        TShirtPage.TShirtAddToCartButton(driver).click();

        // Proceed to shopping cart page.
        TShirtPage.ProceedToCheckoutButton(driver).click();
    }

    @When("the user decides to go and find another item to add to cart")
    public void the_user_decides_to_go_and_find_another_item_to_add_to_cart() {
        HomePage.dressesCategory(driver).click();
        DressesPage.addItemToCart(driver).click();
        DressesPage.proceedToCheckout(driver).click();
    }

    @Then("when the user returns to the cart the correct number and total price of items appear")
    public void when_the_user_returns_to_the_cart_the_correct_number_and_total_price_of_items_appear() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();

        double expectedTotal = 44.51;
        String actualTotalString = CartPage.TotalPrice(driver).getText().replaceAll("\\$", "");
        double actualTotal = Double.parseDouble(actualTotalString);
        Assert.assertEquals(expectedTotal, actualTotal, 0.001);
    }

}
