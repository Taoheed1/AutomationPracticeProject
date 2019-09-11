package stepDefinitionFiles;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pageObjectModels.HomePage;

public class ProductViewStepDefinition {

    WebDriver driver;
    JavascriptExecutor js;
    Actions action;

    public ProductViewStepDefinition(BaseStepDefinition baseStepDefinition){
        this.driver = baseStepDefinition.driver;
        this.js = (JavascriptExecutor) driver;
        action = new Actions(driver);
    }

    @When("the user click on quick view for a product")
    public void the_user_click_on_quick_view_for_a_product() {
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,800)");
        WebElement element = HomePage.allocateProduct(driver);
        action.moveToElement(element).perform();
        HomePage.quickViewButton(driver).click();
    }

    @Then("the pop up should present details about that product")
    public void the_pop_up_should_present_details_about_that_product() {
        driver.switchTo().frame(2);
        Assert.assertEquals("$50.99", HomePage.quickViewproduct(driver).getText());
    }

    // second scenario
    @When("the user clicks on a product")
    public void the_user_clicks_on_a_product() {
        js.executeScript("window.scrollBy(0,700)");
        HomePage.product(driver).click();
    }

    @Then("redirect to the product page")
    public void redirect_to_the_product_page() {
        Assert.assertEquals("demo_3", HomePage.productModel(driver).getText());
    }

    // Third scenario
    @When("the user clicks on eye symbol for a product")
    public void the_user_clicks_on_eye_symbol_for_a_product() {
        HomePage.productEye(driver).click();
    }

}
