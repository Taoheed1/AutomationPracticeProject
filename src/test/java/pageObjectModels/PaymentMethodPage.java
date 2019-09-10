package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentMethodPage {

    private static WebElement element = null;

    public static WebElement totalOrderAmount(WebDriver driver) {
        element = driver.findElement(By.id("amount"));
        return element;
    }

    public static WebElement orderCOnfirmationButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
        return element;
    }

    public static WebElement otherPaymentMethods(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/a"));
        return element;
    }

    public static WebElement orderConfirmationMessage(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong"));
        return element;
    }

    public static WebElement orderConfirmationAmount(WebDriver driver) {
        element = driver.findElement(By.className("price"));
        return element;
    }
}
