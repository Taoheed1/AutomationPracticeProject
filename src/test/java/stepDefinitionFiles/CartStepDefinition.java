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

import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class CartStepDefinition {

    private WebDriver driver = null;

    public CartStepDefinition(BaseStepDefinition baseStepDefinition) {
        this.driver = baseStepDefinition.driver;
    }

    @Given("a user is on the home page")
    public void a_user_is_on_the_home_page() {
        driver.get(DataSet.homeURL);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("a user clicks on the shopping cart")
    public void a_user_clicks_on_the_shopping_cart() {
        CartPage.CartLink(driver).click();
    }

    @Then("the user should be taken to the shopping cart page")
    public void the_user_should_be_taken_to_the_shopping_cart_page() {
        String actualCartTitle = CartPage.CartTitle(driver).getText();
        String expectedCartTitle = "SHOPPING-CART SUMMARY";

        Assert.assertEquals(expectedCartTitle, actualCartTitle);
    }

    @Given("user is on a product page")
    public void user_is_on_a_product_page() {
        driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");

    }

    @When("the user clicks {string} button")
    public void the_user_clicks_button(String string) {
        Actions actions = new Actions(driver);
        TShirtPage.TShirtAddToCartButton(driver).click();
    }

    @Then("the user should see that product within their shopping cart")
    public void the_user_should_see_that_product_within_their_shopping_cart() {
        TShirtPage.ProceedToCheckoutButton(driver).click();

        String expectedCartTitle = "SHOPPING-CART SUMMARY";
        CartPage.CartTitle(driver).getText().contains(expectedCartTitle);

        String expectedProductName = "Faded Short Sleeve T-shirts";
        String  actualProductName = driver.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[2]/p/a")).getText();
        Assert.assertEquals(expectedProductName, actualProductName);

    }

    @Given("user is viewing the shopping cart page")
    public void user_is_viewing_the_shopping_cart_page() {
        driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
        TShirtPage.TShirtAddToCartButton(driver).click();
        TShirtPage.ProceedToCheckoutButton(driver).click();
//        TShirtPage.ContinueShoppingButton(driver).click();
        String expectedCartTitle = "SHOPPING-CART SUMMARY";
        CartPage.CartTitle(driver).getText().contains(expectedCartTitle);



    }

    @When("the user clicks the {string} button on a product to add another item to the basket")
    public void the_user_clicks_the_button_on_a_product_to_add_another_item_to_the_basket(String string) {

        String sValue = CartPage.TotalProductPrice(driver).getText().replaceAll("\\$", "");
        double dValue = Double.parseDouble(sValue);
        CartPage.AddItemButton(driver).click();
        driver.navigate().refresh();
    }

    @Then("the total number of products within the basket should increase")
    public void the_total_number_of_products_within_the_basket_should_increase() {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String value = CartPage.QuantityWindow(driver).getAttribute("value");
        Assert.assertEquals("2", value);
        String sValue = CartPage.TotalProductPrice(driver).getText().replaceAll("\\$", "");
        double dValue = Double.parseDouble(sValue);
        Assert.assertEquals(33.02, dValue, 0.001);

        String x = CartPage.DropdownCart(driver).findElement(By.cssSelector("a[title='View my shopping cart']")).getText();
        System.out.println(x);

        Actions actions = new Actions(driver);
        actions.moveToElement( CartPage.DropdownCart(driver));
//        String attribute = CartPage.DropdownCart(driver).findElement(By.cssSelector(".ajax_cart_block_remove_link")).getAttribute("href");
//        CartPage.DropdownCart(driver).findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?controller=cart&delete%3D1%26id_product%3D%7B%24product_id_product%7D%26ipa%3D%7B%24product_id_product_attribute%7D%26id_address_delivery%3D%7B%24product_id_address_delivery%7D%26token%3D%7B%24static_token%7D=']")).click();
        String link = CartPage.DropdownCart(driver).findElement(By.cssSelector("a[title='remove this product from my cart']")).getAttribute("href");
        driver.get(link);
        System.out.println(link);
        driver.navigate().refresh();
//        System.out.println(attribute);
        x = CartPage.DropdownCart(driver).findElement(By.cssSelector("a[title='View my shopping cart']")).getText();
        System.out.println(x);
    }

}
