package stepDefinitionFiles;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.DriverUtilities;

import java.util.concurrent.TimeUnit;

public class BaseStepDefinition {

    protected WebDriver driver = null;

    @Before
    public void setUp() throws Exception {
        DriverUtilities myDriverUtilities = new DriverUtilities();
        driver = myDriverUtilities.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
