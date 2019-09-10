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

    public static WebElement NewsLetterField(WebDriver driver){
        return driver.findElement(By.id("newsletter-input"));
    }

    public static WebElement successAlert(WebDriver driver){
        return driver.findElement(By.cssSelector("p[class='alert alert-success']"));
    }

    public static WebElement NewsletterButton(WebDriver driver){
        return driver.findElement(By.cssSelector("button[name='submitNewsletter']"));
    }

    public static WebElement errorAlert(WebDriver driver){
        return driver.findElement(By.cssSelector("p[class='alert alert-danger']"));
    }
}
