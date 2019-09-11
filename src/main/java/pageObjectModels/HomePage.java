package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static WebElement womenCategory(WebDriver driver){
        return driver.findElement(By.linkText("WOMEN"));
    }

    public static WebElement womenCategoryName(WebDriver driver){
        return driver.findElement(By.className("cat-name"));
    }

    public static WebElement dressesCategory(WebDriver driver){
        return driver.findElement(By.linkText("DRESSES"));
    }

    public static WebElement dressesCategoryName(WebDriver driver){
        return driver.findElement(By.className("cat-name"));
    }

    public static WebElement tShirtCategory(WebDriver driver){
        return driver.findElement(By.linkText("T-SHIRTS"));
    }

    public static WebElement tShirtCategoryName(WebDriver driver){
        return driver.findElement(By.className("cat-name"));
    }

    public static WebElement quickViewproduct(WebDriver driver){
        return driver.findElement(By.id("our_price_display"));
    }

    public static WebElement allocateProduct(WebDriver driver){
        return driver.findElement(By.cssSelector("img[src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']"));
    }

    public static WebElement product(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]/img"));
    }

    public static WebElement productModel(WebDriver driver){
        return driver.findElement(By.className("editable"));
    }

    public static WebElement productEye(WebDriver driver){
        return driver.findElement(By.cssSelector("a[class='quick-view-mobile'][href='http://automationpractice.com/index.php?id_product=4&controller=product']"));
    }

    public static WebElement quickViewButton(WebDriver driver){
        return driver.findElement(By.cssSelector("a[class='quick-view'][href='http://automationpractice.com/index.php?id_product=4&controller=product'][rel='http://automationpractice.com/index.php?id_product=4&controller=product']"));
    }
}
