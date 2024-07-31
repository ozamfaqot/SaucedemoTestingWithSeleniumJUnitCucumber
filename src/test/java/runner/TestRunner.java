package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "StepDefinition"},
        plugin = {"pretty", "html:target/soucedemo-testing-report.html", "json:cucumber.json"},
        tags = "@All"
)

public class TestRunner {
}
