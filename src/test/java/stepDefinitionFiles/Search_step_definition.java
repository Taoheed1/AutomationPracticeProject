package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjectModels.Search;
import pageObjectModels.SearchPage;
import testData.DataSet;

import static pageObjectModels.Search.search_field;

public class Search_step_definition {

    private WebDriver driver =null;

    public Search_step_definition(BaseStepDefinition setupdriver)
    {
        this.driver=setupdriver.driver;
    }


    @Given("User is on the shopping website")
    public void user_is_on_the_shopping_website() {
        driver.get(DataSet.homeURL);
    }

    @When("User clicks on search field")
    public void user_clicks_on_search_field() {
        Search.search_field(driver).click();

    }

    @When("User enters the name of product they are looking for")
    public void user_enters_the_name_of_product_they_are_looking_for() {
        search_field(driver).sendKeys("shirt");
    }

    @When("User click on search button")
    public void user_click_on_search_button() {
        SearchPage.click_search_button(driver).click();
    }

    @Then("confirm that an appropriate product name message has appeared")
    public void confirm_that_an_appropriate_product_name_message_has_appeared() {

        String search_result_message="1 result has been found.";

        Assert.assertEquals(search_result_message,SearchPage.search_product_result(driver).getText());
    }
}
