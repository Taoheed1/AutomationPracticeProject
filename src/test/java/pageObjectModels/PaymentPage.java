package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentPage {

    private static WebElement element = null;

    public static WebElement productReference(WebDriver driver) {
        element = driver.findElement(By.className("cart_ref"));
//        List<WebElement> elements = element.
        return element;
    }

    public static WebElement productPrice(WebDriver driver) {
        element = driver.findElement(By.id("total_product_price_4_16_212081"));
        return element;
    }

    public static WebElement totalProductPrice(WebDriver driver) {
        element = driver.findElement(By.id("total_product"));
        return element;
    }

    public static WebElement payByBankWire(WebDriver driver) {
        element = driver.findElement(By.className("bankwire"));
        return element;
    }

    public static WebElement payByCheque(WebDriver driver) {
        element = driver.findElement(By.className("cheque"));
        return element;
    }



}
