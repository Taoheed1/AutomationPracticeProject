package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentShippingPage {

    private static WebElement element = null;

    public static WebElement termsAndConditionsCheckbox(WebDriver driver) {
        element = driver.findElement(By.id("cgv"));
        return element;
    }

    public static WebElement termsAndConditionsAlertWindow(WebDriver driver) {
        element = driver.findElement(By.className("fancybox-error"));
        return element;
    }

    public static WebElement deliveryOptionPrice(WebDriver driver) {
        element = driver.findElement(By.className("delivery_option_price"));
        return element;
    }

    public static WebElement termsAndConditions(WebDriver driver) {
        element = driver.findElement(By.className("iframe"));
        return element;
    }
}
