package testSuites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featureFiles",
        glue = "stepDefinitionFiles",
        //tags={"@S"},
        plugin = {"html:target/cucumber-html-reports"}
)

public class CucumberTestRunner {
}
