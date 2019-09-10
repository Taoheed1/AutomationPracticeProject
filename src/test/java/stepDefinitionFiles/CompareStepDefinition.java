package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pageObjectModels.DressesPage;
import testData.DataSet;

public class CompareStepDefinition {

    WebDriver driver;
    JavascriptExecutor js;

    public CompareStepDefinition(BaseStepDefinition baseStepDefinition){
        this.driver = baseStepDefinition.driver;
        js = (JavascriptExecutor)driver;
    }

    @Given("the user on the dresses page")
    public void the_user_on_the_dresses_page() {
        driver.get(DataSet.dressesURL);
    }

    @When("the user adds two dresses to compare")
    public void the_user_adds_two_dresses_to_compare() {

        DressesPage.listLayout(driver).click();
        js.executeScript("window.scrollBy(0,840)");
        DressesPage.addProduct(driver, "4").click();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        DressesPage.addProduct(driver, "5").click();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @When("click on compare button")
    public void click_on_compare_button() {
        DressesPage.compare(driver).click();
    }

    @Then("redirect the user to compare products page")
    public void redirect_the_user_to_compare_products_page() {
        Assert.assertEquals("PRODUCT COMPARISON", DressesPage.pageHeading(driver).getText());
    }

}
