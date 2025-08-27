package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@Login",
        plugin = {
                "json:target/RunCuke/cucumber.json",
                "html:target/RunCuke/cucumber.html",
                "pretty"})

public class LoginTestRunner extends AbstractTestNGCucumberTests {

}
