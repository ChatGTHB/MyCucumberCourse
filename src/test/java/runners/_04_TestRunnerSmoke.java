package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@SmokeTest",
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"},
        dryRun = false
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests{
}
