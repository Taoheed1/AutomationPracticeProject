package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjectModels.RegistrationObjectModel;
import testData.DataSet;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class RegistrationStepDefinition {
    private WebDriver driver = null;
    private int random_generated;

    public RegistrationStepDefinition (BaseStepDefinition baseStepDefinition){
        this.driver = baseStepDefinition.driver;
    }

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        driver.get(DataSet.registerPageURL);
    }

@When("User enters a valid email")
    public void user_enters_a_valid_email() {
    Random rand = new Random();
    int max=1000;
    random_generated= rand.nextInt(max);
    //System.out.println(random_generated);
    RegistrationObjectModel.email(driver).sendKeys("johndoe" + random_generated+"@test.com");
    }

    @When("User clicks on create account button")
    public void user_clicks_on_create_account_button() {
        RegistrationObjectModel.create_an_account_button(driver).click();
    }

    @Then("redirect Them into detail page")
    public void redirect_Them_into_detail_page() {

        Assert.assertEquals("You're wrong","YOUR PERSONAL INFORMATION",RegistrationObjectModel.sub_heading(driver).getText());

    }

    @When("user enters valid details in to fields")
    public void user_enters_valid_details_in_to_fields() throws InterruptedException{
        RegistrationObjectModel.registration(driver);
    }

    @Then("confirm that an appropriate username message has appeared")
    public void confirm_that_an_appropriate_username_message_has_appeared()  {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        Assert.assertEquals("Not all good","MY ACCOUNT",driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText());
    }





}
