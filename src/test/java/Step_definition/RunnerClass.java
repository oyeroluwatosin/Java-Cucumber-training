package Step_definition;

// This Created class helps to run all our seperate java class to run all our test

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( strict = false,
        features = "src/test/resources/Features",
        plugin = {"pretty", "json:target/cucumber.json"},
        tags = {"~@ignore"}

)



public class RunnerClass {
}
