package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.SeleniumDriver;

public class AfterActions {

    @After
    public static void tearDown(Scenario scenario) {
        WebDriver driver = SeleniumDriver.getDriver();

        // Capture screenshot if scenario is failed
        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(
                    OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", "Failed Step Screenshot");
        }

        SeleniumDriver.getExtentReports().flush();
        SeleniumDriver.tearDown();
    }
}
