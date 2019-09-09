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

    public static WebElement categoryName(WebDriver driver){
        return driver.findElement(By.className("cat-name"));
    }
}
