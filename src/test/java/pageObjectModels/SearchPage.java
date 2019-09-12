package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitionFiles.BaseStepDefinition;

public class SearchPage {

    public static WebDriver driver=null;

    public SearchPage(BaseStepDefinition driverbase)
    {
        this.driver=driverbase.driver;
    }

    public static WebElement search_field(WebDriver driver)
    {
        return driver.findElement(By.id("search_query_top"));
    }

    public static WebElement click_search_button(WebDriver driver)

    {
        return driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
    }

    public static WebElement search_product_result(WebDriver driver)
    {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]"));
    }



}
