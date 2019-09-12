package pageObjectModels;

//qweimport jdk.jfr.Timespan;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    public static WebElement element = null;
    //wrong email
    public static WebElement email(WebDriver driver) {
        element = driver.findElement(By.id("email"));
        element.sendKeys("gaterssr");
        return element;
    }

    public static WebElement clickLogin(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
        return element;
    }

   //wrong password
    public static WebElement password(WebDriver driver) {
        element = driver.findElement(By.id("passwd"));
        element.sendKeys("asdajsd");
        return element;
    }
    //error check1
    public static WebElement loginError(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
        //element.getText();
        return element;
    }
        //valid user and pass
    public static WebElement validuserpass(WebDriver driver) {
        element = driver.findElement(By.id("passwd"));
        element.sendKeys("JJoy@spartaglobal.com");
        element = driver.findElement(By.id("passwd"));
        element.sendKeys("Qwert12?");
        return element;
    }

    //error check2
    public static WebElement loginError2(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
        //element.getText();
        return element;
    }

    //forget password
    public static WebElement forgetPass(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
        return element;
    }

    //adds user name
    public static WebElement forUsername(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        element.sendKeys("JJoy@spartaglobal.com");
        return element;
    }

    //error check3
    public static WebElement successfullSent(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button"));
//*[@id="center_column"]/div/p/text()
        return element;
    }


}
