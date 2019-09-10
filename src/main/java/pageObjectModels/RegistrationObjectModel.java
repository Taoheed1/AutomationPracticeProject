package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationObjectModel {

    public static WebElement email (WebDriver driver) {
        return driver.findElement(By.id("email_create"));
    }

    public static WebElement create_an_account_button (WebDriver driver)
    {
       //return driver.findElement(By.id("SubmitCreate"));

       // return driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/div/div[3]/input[2]"));

       return  driver.findElement(By.cssSelector("button[name='SubmitCreate']"));
    }

    public static WebElement sub_heading (WebDriver driver)

    {
       // return driver.findElement(By.cssSelector("h3[class='page-subheading']"));
        return driver.findElement(By.xpath("//*[@id=\"noSlide\"]/h1"));
    }

    public static WebElement title_mr_radio_buttons(WebDriver driver) {

        //return driver.findElement(By.cssSelector("div[id='uniform-id_gender1']"));
//        return (WebElement) driver.findElements(By.name("id_gender1"));//gets the class group called color
        return (WebElement) driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));

    }


//    public static WebElement title_mrs_radio_buttons (WebDriver driver)
//    {
//       return driver.findElement(By.id("id_gender1"));
//    }
//

    public static WebElement firstname (WebDriver driver)
    {
//        return driver.findElement(By.cssSelector("input[id='customer_firstname']"));
        return driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
    }

    public static WebElement secondname (WebDriver driver)
    {
//      return driver.findElement(By.className("customer_lastname"));
      return driver.findElement((By.xpath("//*[@id=\"customer_lastname\"]")));
    }

    public static WebElement fpassword (WebDriver driver)
    {
        return driver.findElement(By.className("passwd"));
    }


//    public static WebElement [] birth ()
//    {
//        WebElement [] e = new WebElement [3];
//        e[0]= driver.findElement(By.className("days"));
//        e[1] = driver.findElement(By.className("months"));
//        e[2] = driver.findElement(By.className("years"));
//
//        return e;
//    }
//
//    public static WebElement firstnamesecondtime (WebElement firstnameelement)
//    {
//        firstnameelement= driver.findElement(By.className("firstname"));
//        return firstnameelement;
//    }
//
//
//    public static WebElement secondnamesecondtime (WebElement secondnameelement)
//    {
//        secondnameelement= driver.findElement(By.className("lastname"));
//        return secondnameelement;
//    }
//
//    public static WebElement addresscity (WebElement cityelement)
//    {
//        cityelement= driver.findElement(By.id("city"));
//        return cityelement;
//    }
//
//    public static WebElement addressstate (WebElement stateelement)
//    {
//        stateelement= driver.findElement(By.id("id_state"));
//        return stateelement;
//    }
//
//    public static WebElement addresspostcode (WebElement postcodeelement)
//    {
//        postcodeelement= driver.findElement(By.id("postcode"));
//        return postcodeelement;
//    }
//
//    public static WebElement addresscountry (WebElement countryelement)
//    {
//        countryelement= driver.findElement(By.id("id_country"));
//        return countryelement;
//    }
//
//    public static WebElement phone (WebElement mobileelement)
//    {
//        mobileelement= driver.findElement(By.id("phone_mobile"));
//        return mobileelement;
//    }
//
//    public static WebElement registerbutton (WebElement registerelement)
//    {
//        registerelement= driver.findElement(By.xpath("*[@id=\"submitAccount\"]/span/i"));
//        return registerelement;
//    }


}
