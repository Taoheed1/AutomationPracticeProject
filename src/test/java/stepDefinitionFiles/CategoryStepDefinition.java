package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjectModels.HomePage;
import testData.DataSet;
import utilities.DriverUtilities;

public class CategoryStepDefinition {

    WebDriver driver;

    public CategoryStepDefinition(BaseStepDefinition baseStepDefinition){
        this.driver = baseStepDefinition.driver;
    }

    @Given("the user on home page")
    public void the_user_on_home_page() {
        driver.get(DataSet.homeURL);
    }

    // first feature
    @When("the user clicks on Women tab")
    public void the_user_clicks_on_Women_tab() {
        HomePage.womenCategory(driver).click();
    }

    @Then("redirect them to women category")
    public void redirect_them_to_women_category() {
        Assert.assertEquals("Women", HomePage.subCategory(driver).getText());
    }

    // second feature
    @When("the user clicks on Dresses tab")
    public void the_user_clicks_on_Dresses_tab() {
        HomePage.dressesCategory(driver).click();
    }

    @Then("redirect them to Dresses category")
    public void redirect_them_to_Dresses_category() {
        Assert.assertEquals("DRESSES ", HomePage.categoryName(driver).getText());
    }
}
