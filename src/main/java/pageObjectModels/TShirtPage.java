package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TShirtPage {

    private static WebElement element = null;

    public static WebElement TShirtAddToCartButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a[data-id-product='1']"));
        return element;
    }

    public static WebElement ProceedToCheckoutButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a[title='Proceed to checkout']"));
        return element;
    }

}
