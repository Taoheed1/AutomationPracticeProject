package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class RegistrationObjectModel {

    private static WebElement element = null;


    public static WebElement email(WebDriver driver) {
        return driver.findElement(By.id("email_create"));
    }

    public static WebElement create_an_account_button(WebDriver driver) {
        //return driver.findElement(By.id("SubmitCreate"));

        // return driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/div/div[3]/input[2]"));

        return driver.findElement(By.cssSelector("button[name='SubmitCreate']"));
    }

    public static WebElement sub_heading(WebDriver driver) {
        // return driver.findElement(By.cssSelector(""));
        //*[@id="account-creation_form"]/div[1]/h3
        return driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3"));
    }

    public static WebElement title_mr_radio_buttons(WebDriver driver) {

        //return driver.findElement(By.cssSelector("div[id='uniform-id_gender1']"));
//        return (WebElement) driver.findElements(By.name("id_gender1"));//gets the class group called color
        return (WebElement) driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));

    }


    public static WebElement firstname(WebDriver driver) {
    // return driver.findElement(By.cssSelector("input[id='customer_firstname']"));
        return driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
    }

    public static WebElement secondname(WebDriver driver) {
        return driver.findElement((By.xpath("//*[@id=\"customer_lastname\"]")));
    }

    public static WebElement fpassword(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
    }


    public static WebElement mobilephone(WebDriver driver) {
        return driver.findElement(By.name("phone_mobile"));
    }

    public static WebElement birth_days(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\\\"days\\\"]"));
    }

    public static WebElement birth_month(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        return element;
    }

    public static WebElement full_address(WebDriver driver) {
        return driver.findElement(By.id("address1"));
    }

    public static WebElement addresscity(WebDriver driver) {
        return driver.findElement(By.id("city"));
    }

    public static WebElement addresspostcode(WebDriver driver) {
        return driver.findElement(By.id("postcode"));
    }

    public static WebElement aliasaddress(WebDriver driver) {
        return driver.findElement(By.id("alias"));
    }


    public static WebElement registerbutton(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
    }

    public static WebElement logout_registration_account (WebDriver driver) {
       return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
    }



    public static void registration(WebDriver driver) {


        RegistrationObjectModel.title_mr_radio_buttons(driver).click();
        RegistrationObjectModel.firstname(driver).sendKeys("John");
        RegistrationObjectModel.secondname(driver).sendKeys("Albert");
        RegistrationObjectModel.fpassword(driver).sendKeys("123456");
        RegistrationObjectModel.full_address(driver).sendKeys("alfred address, PopBox, Companyname, hi");
        RegistrationObjectModel.addresscity(driver).sendKeys("Los Angeles");
        RegistrationObjectModel.addresspostcode(driver).sendKeys("10001");
        RegistrationObjectModel.mobilephone(driver).sendKeys("12345678912");

        WebElement dayDropdownElement = driver.findElement(By.id("days"));
        Select dayDropdown = new Select(dayDropdownElement);
        dayDropdown.selectByValue("4");

        Select monthDropdown = new Select(RegistrationObjectModel.birth_month(driver));
        monthDropdown.selectByValue("8");

        WebElement yearDropdownElement = driver.findElement(By.id("years"));
        Select yearDropdown = new Select(yearDropdownElement);
        yearDropdown.selectByValue("1997");

        WebElement stateDropdownElement = driver.findElement(By.id("id_state"));
        Select stateDropdown = new Select(stateDropdownElement);
        stateDropdown.selectByIndex(3);

        RegistrationObjectModel.aliasaddress(driver).sendKeys("moadd");
        RegistrationObjectModel.registerbutton(driver).click();
    }

    public static void registration_without_postcode(WebDriver driver) {
        RegistrationObjectModel.title_mr_radio_buttons(driver).click();
        RegistrationObjectModel.firstname(driver).sendKeys("John");
        RegistrationObjectModel.secondname(driver).sendKeys("Albert");
        RegistrationObjectModel.fpassword(driver).sendKeys("123456");
        RegistrationObjectModel.full_address(driver).sendKeys("alfred address, PopBox, Companyname, hi");
        RegistrationObjectModel.addresscity(driver).sendKeys("Los Angeles");
        RegistrationObjectModel.addresscity(driver).sendKeys("Los Angeles");
        RegistrationObjectModel.mobilephone(driver).sendKeys("12345678912");
        //RegistrationObjectModel.email(driver).sendKeys("mohammad566@gmail.co.uk");

        WebElement dayDropdownElement = driver.findElement(By.id("days"));
        Select dayDropdown = new Select(dayDropdownElement);
        dayDropdown.selectByValue("4");

        Select monthDropdown = new Select(RegistrationObjectModel.birth_month(driver));
        monthDropdown.selectByValue("8");

        WebElement yearDropdownElement = driver.findElement(By.id("years"));
        Select yearDropdown = new Select(yearDropdownElement);
        yearDropdown.selectByValue("1997");

        WebElement stateDropdownElement = driver.findElement(By.id("id_state"));
        Select stateDropdown = new Select(stateDropdownElement);
        stateDropdown.selectByIndex(3);

        RegistrationObjectModel.aliasaddress(driver).sendKeys("moadd");
    }


}
