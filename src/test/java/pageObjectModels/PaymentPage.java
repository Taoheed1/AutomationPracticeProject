package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentPage {

    private static WebElement element = null;

    public static WebElement payByBankWire(WebDriver driver) {
        element = driver.findElement(By.className("bankwire"));
        return element;
    }

    public static WebElement payByCheque(WebDriver driver) {
        element = driver.findElement(By.className("cheque"));
        return element;
    }

    public static WebElement orderSummaryMessage(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/p[1]/strong"));
        return element;
    }

    public static WebElement orderConfirmationButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
        return element;
    }


    public static WebElement orderConfirmationMessage(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong"));
        return element;
    }

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
    public static WebElement totalOrderAmount(WebDriver driver) {
        element = driver.findElement(By.id("amount"));
        return element;
    }

    public static WebElement otherPaymentMethods(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/a"));
        return element;
    }

    public static WebElement orderConfirmationAmount(WebDriver driver) {
        element = driver.findElement(By.className("price"));
        return element;
    }



}
