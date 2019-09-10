package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private static WebElement element = null;

    public static WebElement CartLink(WebDriver driver) {
//        element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a"));
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
//        element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/input[1]"));
//        element = driver.findElement(By.className("cart_quantity_input form-control grey"));
        element = driver.findElement(By.cssSelector("input[name='quantity_1_1_0_0']"));
        return element;
    }

    public static WebElement TotalProductPrice(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"total_product_price_1_1_0\"]"));
        return element;
    }

    public static WebElement DropdownCart(WebDriver driver) {
//        element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div"));
        element = driver.findElement(By.cssSelector("div[class='shopping_cart']"));
        return element;
    }


}
