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

    public static WebElement quickView(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/div[1]/a/i"));
    }

    public static WebElement quickViewproduct(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"product_reference\"]/span"));
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
}
