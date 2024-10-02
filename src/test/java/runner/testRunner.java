package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/features",
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber7Jvm","json:target/json-report.json", "html:target/html-report"},
        glue = {"utility", "step_definition"}
)

public class testRunner{


}
