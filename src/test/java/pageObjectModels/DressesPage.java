package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressesPage {

    public static WebElement addProduct(WebDriver driver, String productNumber){
       return driver.findElement(By.cssSelector("a[data-id-product='" + productNumber + "'][class='add_to_compare'][href='http://automationpractice.com/index.php?id_product="+ productNumber +"&controller=product']"));
    }

    public static WebElement compare(WebDriver driver){
        return driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-default button button-medium bt_compare bt_compare']"));
    }

    public static WebElement pageHeading(WebDriver driver){
        return driver.findElement(By.className("page-heading"));
    }

    public static WebElement listLayout(WebDriver driver){
        return driver.findElement(By.cssSelector("a[title='List']"));
    }
}
