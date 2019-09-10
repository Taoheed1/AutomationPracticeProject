package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModels.HomePage;
import testData.DataSet;

import java.util.concurrent.TimeUnit;

public class ProductViewStepDefinition {

    WebDriver driver;
    JavascriptExecutor js;
    Actions action;

    public ProductViewStepDefinition(BaseStepDefinition baseStepDefinition){
        this.driver = baseStepDefinition.driver;
        this.js = (JavascriptExecutor) driver;
        action = new Actions(driver);
    }

    @Given("the user on home page")
    public void the_user_on_home_page() {
        driver.get(DataSet.homeURL);
    }

    @When("the user click on quick view for a product")
    public void the_user_click_on_quick_view_for_a_product() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,800)");
        WebElement element = HomePage.allocateProduct(driver);
        action.moveToElement(element).perform();
        WebElement view = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/div[1]/a/i")));
        // throws TimeoutException if it doesn't become visible after 30 seconds
        wait.until(ExpectedConditions.visibilityOf(element));

        action.moveToElement(HomePage.quickView(driver)).click();
//        ((JavascriptExecutor)driver).executeScript("document.getElementsByClassName('quick-view').click()");
//        HomePage.quickView(driver).click();
    }

    @Then("the pop up should present details about that product")
    public void the_pop_up_should_present_details_about_that_product() {
        Assert.assertEquals("demo_4", HomePage.quickViewproduct(driver).getText());
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

}
