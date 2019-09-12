package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

    public static WebElement search_field (WebDriver driver)
    {
        return driver.findElement(By.id("search_query_top"));
    }

    public static void click_search_button(WebDriver driver) {
    }
}
