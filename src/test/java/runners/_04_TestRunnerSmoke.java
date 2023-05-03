package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@SmokeTest",
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"},
        plugin= {"json:target/cucumber/cucumber.json"}, // plugin normally absent; added for jenkins
        dryRun = false
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests{
}
