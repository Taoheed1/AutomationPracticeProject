package stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjectModels.LoginPage;
import testData.DataSet;

public class LoginStepDefinition {
    WebDriver driver;

    public LoginStepDefinition(BaseStepDefinition baseStepDefinition){
        this.driver = baseStepDefinition.driver;
    }

    @Given("user opens the chrome and on the login page")
    public void user_opens_the_chrome_and_on_the_login_page() {

        driver.get(DataSet.loginPage);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This step will open chrome and navigates to login page");
        //throw new cucumber.api.PendingException();
    }
//username
    @When("login with an invalid username")
    public void login_with_an_invalid_username() {
        // Write code here that turns the phrase above into concrete actions

        LoginPage.email(driver);

        System.out.println("This step puts the wrong username");
        //throw new cucumber.api.PendingException();
    }

    @Then("authentication errorOne will display")
    public void authentication_error_will_display() {
        LoginPage.clickLogin(driver).click();
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Invalid email address.", LoginPage.loginError(driver).getText());
        System.out.println("This step displays error");
    }
//password error
    @When("login with an invalid password")
    public void login_with_an_invalid_password() {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.password(driver);
        System.out.println("This step wrong password");
        throw new cucumber.api.PendingException();
    }

    @Then("authentication errorTwo will display")
    public void authenticationErrorTwoWillDisplay() {
        LoginPage.clickLogin(driver).click();
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("An email address required.", LoginPage.loginError(driver).getText());
        System.out.println("This step displays error");
    }

//valid login
    @When("login with valid username and password")
    public void login_with_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.validuserpass(driver);

        System.out.println("This step enters valid login and submits");

    }

    @Then("the user should see username in the account page")
    public void the_user_should_see_username_in_the_account_page() {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.clickLogin(driver).click();
        Assert.assertEquals("Jubin Joy", LoginPage.loginError(driver).getText());
        System.out.println("This step ables to go to user account page");
    }



//forget password
    @When("user clicks on forget password")
    public void user_clicks_on_forget_password() {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.forgetPass(driver);
        System.out.println("This step clicks on link forget password");

    }

    @When("user provides username and retrive password")
    public void user_provides_username_and_retrive_password() {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.forUsername(driver);
        LoginPage.successfullSent(driver).click();
        System.out.println("This step provides username and send request change");

    }

    @Then("sends the confirmation email")
    public void sends_the_confirmation_email() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("A confirmation email has been sent to your address: JJoy@spartaglobal.com", LoginPage.successfullSent(driver).getText();
        System.out.println("This step displays message of password change request");
    }

}
