package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private static WebElement element = null;

    public static WebElement CartLink(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a[title='View my shopping cart']"));
        return element;
    }

    public static WebElement CartTitle(WebDriver driver) {
        element = driver.findElement(By.cssSelector("h1[id='cart_title']"));
        return element;
    }

    public static WebElement AddItemButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_1_1_0_0\"]"));
        return element;
    }

    public static WebElement QuantityWindow(WebDriver driver) {
        element = driver.findElement(By.cssSelector("input[name='quantity_1_1_0_0']"));
        return element;
    }

    public static WebElement TotalProductPrice(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"total_product_price_1_1_0\"]"));
        return element;
    }

    public static WebElement DropdownCart(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a[title='View my shopping cart']"));
        return element;
    }

    public static WebElement ProceedToCheckout(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a[title='Proceed to checkout']"));
        return element;
    }

    public static WebElement TotalPrice(WebDriver driver) {
        element = driver.findElement(By.cssSelector("span[id='total_price']"));
        return element;
    }

    public static WebElement ProductName(WebDriver driver) {
        element = driver.findElement(By.cssSelector("tr[id='product_1_1_0_0']")).findElement(By.cssSelector("p[class='product-name']"));
        return element;
    }

    public static WebElement RemoveItemDropdown(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a[title='View my shopping cart']")).findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a"));
        return element;
    }

    public boolean CompareTextFromElement(WebElement element, String string) {
        boolean actualResult;

        if (element.getText().contains(string)) {
            actualResult = true;
        } else {
            actualResult = false;
        }

        return actualResult;
    }
}
