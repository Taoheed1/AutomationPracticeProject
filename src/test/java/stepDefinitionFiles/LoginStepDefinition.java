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
    //initial page
    @Given("user opens the chrome and on the login page")
    public void user_opens_the_chrome_and_on_the_login_page() {
        driver.get(DataSet.registerPageURL);

        System.out.println("This step will open chrome and navigates to login page");
    }

    //wrong user name
    @When("login with an invalid username")
    public void login_with_an_invalid_username() {

        LoginPage.email(driver);
        System.out.println("This step puts the wrong username");
    }

    @Then("authentication errorOne will display")
    public void authentication_errorOne_will_display() {

        LoginPage.clickLogin(driver).click();
        Assert.assertEquals("Invalid email address.", LoginPage.loginError(driver).getText());
        System.out.println("This step displays error");
    }

    //wrong password
    @When("login with an invalid password")
    public void login_with_an_invalid_password() {

        LoginPage.password(driver);
        System.out.println("This step wrong password");
    }

    @Then("authentication errorTwo will display")
    public void authentication_errorTwo_will_display() {

        LoginPage.clickLogin(driver).click();
        Assert.assertEquals("An email address required.", LoginPage.loginError(driver).getText());
        System.out.println("This step displays password error");
    }

    //forget password link
    @When("user clicks on forget password")
    public void user_clicks_on_forget_password() {

        LoginPage.forgetPass(driver).click();
        System.out.println("This step clicks on link forget password");
    }

    @And("user provides username and retrive password")
    public void user_provides_username_and_retrive_password() {

        LoginPage.forUsername(driver);
        LoginPage.successfullSent(driver).click();
        System.out.println("This step provides username and send request change");
    }

    @Then("sends the confirmation email")
    public void sends_the_confirmation_email() {

        Assert.assertEquals("A confirmation email has been sent to your address: JJoy@spartaglobal.com",
                LoginPage.successfullRequest(driver).getText());
        LoginPage.backToLogin(driver).click();
        System.out.println("This step displays message of password change request");
    }

    //valid login
    @When("login with valid username and password")
    public void login_with_valid_username_and_password() {

        LoginPage.validuser(driver);
        LoginPage.validpass(driver);
        System.out.println("This step enters valid login and submits");
    }

    @Then("the user should see username in the account page")
    public void the_user_should_see_username_in_the_account_page() {

        LoginPage.clickLogin(driver).click();

        Assert.assertEquals("Jubin Joy", LoginPage.loginError2(driver).getText());
        System.out.println("This step ables to go to user account page");
    }

    //logout
    @When("user clicks logout")
    public void user_clicks_logout() {

        LoginPage.logOut(driver).click();
        System.out.println("This step logs out");
    }
    @Then("user account should logout")
    public void user_account_should_logout() {

        driver.navigate().back();
        System.out.println("Navigate back");
    }
}
