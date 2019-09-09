package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static WebElement womenCategory(WebDriver driver){
        return driver.findElement(By.className("sf-with-ul"));
    }

    public static WebElement subCategory(WebDriver driver){
        return driver.findElement(By.className("navigation_page"));
    }

    public static WebElement dressesCategory(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
    }

    public static WebElement dressesCategoryName(WebDriver driver){
        return driver.findElement(By.className("cat-name"));
    }

    public static WebElement tshirtCategory(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
    }

    public static WebElement tshirtCategoryName(WebDriver driver){
        return driver.findElement(By.className("cat-name"));
    }
}
