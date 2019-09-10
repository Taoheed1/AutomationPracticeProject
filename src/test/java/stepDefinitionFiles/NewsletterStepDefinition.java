package stepDefinitionFiles;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjectModels.HomePage;
import testData.DataSet;

public class NewsletterStepDefinition {

    WebDriver driver;
    String email = null;

    public NewsletterStepDefinition(BaseStepDefinition baseStepDefinition){
        this.driver = baseStepDefinition.driver;
        email = DataSet.email;
    }

    // first scenario
    @When("the user enters a valid email")
    public void the_user_enters_a_valid_email() {
        HomePage.NewsLetterField(driver).sendKeys(email);
        HomePage.NewsletterButton(driver).click();
    }

    @Then("present a success alert")
    public void present_a_success_alert() {
        Assert.assertEquals("Newsletter : You have successfully subscribed to this newsletter.", HomePage.successAlert(driver).getText());
    }

    // Second scenario
    @When("the user enters an invalid email")
    public void the_user_enters_an_invalid_email() {
        HomePage.NewsLetterField(driver).sendKeys("hello");
        HomePage.NewsletterButton(driver).click();
    }

    @Then("present an error alert")
    public void present_an_error_alert() {
        Assert.assertEquals("Newsletter : Invalid email address.", HomePage.errorAlert(driver).getText());
    }

    // Third scenario
    @When("the user enters a registered email")
    public void the_user_enters_a_registered_email() {
        HomePage.NewsLetterField(driver).sendKeys(email);
        HomePage.NewsletterButton(driver).click();
    }

    @Then("present a danger alert")
    public void present_a_danger_alert() {
        Assert.assertEquals("Newsletter : This email address is already registered.", HomePage.errorAlert(driver).getText());
    }
}
