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

    public static WebElement ContinueShoppingButton(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"));
        return element;
    }

}
