package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@SmokeTest",
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"}, // plugin normally absent; added for jenkins
        dryRun = false
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests{
}
