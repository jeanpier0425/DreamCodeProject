package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/apiDreamCode.feature",
        //tags = "@Post",
        glue = "StepDefinitions"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
