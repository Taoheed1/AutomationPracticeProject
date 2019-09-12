package testData;

import java.util.Random;

public class DataSet {

    static Random rand = new Random();
    public static int rand_int = rand.nextInt(999999);

    public static String homeURL = "http://automationpractice.com/index.php";
    public static String registerPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    public static String tShirtCategoryURL = homeURL + "?id_category=5&controller=category";
    public static String tShirtLinkXpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a";
    public static String dressesURL = homeURL + "?id_category=8&controller=category";
    public static String email = "mohammad" + rand_int + "@gmail.co.uk";
<<<<<<< HEAD
    public static String loginPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

=======
    public static String password = "qwerty";
    public static String proceedToShippingPageXpath = "//*[@id=\"center_column\"]/form/p/button/span";
    public static String proceedToPaymentPageXpath = "//*[@id=\"form\"]/p/button/span";
>>>>>>> master
}
