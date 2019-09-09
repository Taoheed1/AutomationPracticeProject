package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationObjectModel {
    private static WebDriver driver=null;

    public static WebElement email (WebElement email)
    {
        email= driver.findElement(By.id("email_create"));
        return email;
    }

    public static WebElement [] title_radio_buttons ()
    {
        WebElement [] element = new WebElement[2];

        element[0]= driver.findElement(By.id("id_gender1"));
        element[1]= driver.findElement(By.id("id_gender2"));

        return element;
    }

    public static WebElement firstname (WebElement firstnameelement)
    {
        firstnameelement= driver.findElement(By.className("customer_firstname"));
        return firstnameelement;
    }

    public static WebElement secondname (WebElement secondnameelement)
    {
        secondnameelement= driver.findElement(By.className("customer_lastname"));
        return secondnameelement;
    }

    public static WebElement secondemail (WebElement emailelement)
    {
        emailelement= driver.findElement(By.id("email"));
        return emailelement;
    }

    public static WebElement fpassword (WebElement passelement)
    {
        passelement= driver.findElement(By.className("passwd"));
        return passelement;
    }

    public static WebElement [] birth ()
    {
        WebElement [] e = new WebElement [3];
        e[0]= driver.findElement(By.className("days"));
        e[1] = driver.findElement(By.className("months"));
        e[2] = driver.findElement(By.className("years"));

        return e;
    }

    public static WebElement firstnamesecondtime (WebElement firstnameelement)
    {
        firstnameelement= driver.findElement(By.className("firstname"));
        return firstnameelement;
    }


    public static WebElement secondnamesecondtime (WebElement secondnameelement)
    {
        secondnameelement= driver.findElement(By.className("lastname"));
        return secondnameelement;
    }

    public static WebElement addresscity (WebElement cityelement)
    {
        cityelement= driver.findElement(By.id("city"));
        return cityelement;
    }

    public static WebElement addressstate (WebElement stateelement)
    {
        stateelement= driver.findElement(By.id("id_state"));
        return stateelement;
    }

    public static WebElement addresspostcode (WebElement postcodeelement)
    {
        postcodeelement= driver.findElement(By.id("postcode"));
        return postcodeelement;
    }

    public static WebElement addresscountry (WebElement countryelement)
    {
        countryelement= driver.findElement(By.id("id_country"));
        return countryelement;
    }

    public static WebElement phone (WebElement mobileelement)
    {
        mobileelement= driver.findElement(By.id("phone_mobile"));
        return mobileelement;
    }

    public static WebElement registerbutton (WebElement registerelement)
    {
        registerelement= driver.findElement(By.xpath("*[@id=\"submitAccount\"]/span/i"));
        return registerelement;
    }


}
