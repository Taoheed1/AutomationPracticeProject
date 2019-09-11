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
    private String  email=null;
//    private int rand = new Random().nextInt(1000);
//    private  final int random_generated = rand;

    public RegistrationStepDefinition (BaseStepDefinition baseStepDefinition){
        this.driver = baseStepDefinition.driver;
        email=DataSet.email;
    }

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        driver.get(DataSet.registerPageURL);
    }

@When("User enters a valid email")
    public void user_enters_a_valid_email() {
   // RegistrationObjectModel.email(driver).sendKeys("johndoe" + DataSet.rand_int+"@test.com");
    RegistrationObjectModel.email(driver).sendKeys(email);
   // System.out.println(random_generate);
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

    @Given("User is on the registration page-two")
    public void user_is_on_the_registration_page_two() {
        System.out.println("begin");
        driver.get(DataSet.registerPageURL);
    }

    @When("User enters the same email for registration-two")
    public void user_enters_the_same_email_for_registration_two() {
        System.out.println("middle");
        RegistrationObjectModel.email(driver).sendKeys(email);
    }

    @When("User clicks on create account button-two")
    public void user_clicks_on_create_account_button_two() {
        RegistrationObjectModel.create_an_account_button(driver).click();
    }

    @Then("present an error message")
    public void present_an_error_message() {
        Assert.assertEquals("Not all good","An account using this email address has already been registered. Please enter a valid password or request a new one.",driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText());
    }
}
