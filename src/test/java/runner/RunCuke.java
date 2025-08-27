package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeSuite;
import utils.SeleniumDriver;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@login-test",
        plugin = {
                "json:target/RunCuke/cucumber.json",
                "html:target/RunCuke/cucumber.html",
                "pretty"})

public class RunCuke extends AbstractTestNGCucumberTests {

}
