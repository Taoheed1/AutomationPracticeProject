package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPaymentPage {


    private static WebElement element = null;

    public static WebElement addressDropdown(WebDriver driver) {
        element = driver.findElement(By.id("id_address_delivery"));
        return element;
    }

    public static WebElement addressesEqualCheckbox(WebDriver driver) {
        element = driver.findElement(By.id("addressesAreEquals"));
        return element;
    }

    public static WebElement updateDeliveryAddress(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[7]/a/span"));
        return element;
    }

    public static WebElement updateBillingAddress(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[7]/a/span"));
        return element;
    }

    public static WebElement addNewAddress(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/p/a/span"));
        return element;
    }

    public static WebElement commentField(WebDriver driver) {
        element = driver.findElement(By.className("form-control"));
        return element;
    }

    public static WebElement proceedToCheckout(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
        return element;
    }

}
