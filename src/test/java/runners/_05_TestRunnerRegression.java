package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@SmokeTest or @Regression",// In which scenarios these tags will be run
        // If and is written instead of or, it will run both smoke and regression tags.
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"},
        plugin= {"json:target/cucumber/cucumber.json"}, // JSON report for Jenkins
        dryRun = false
)

public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
