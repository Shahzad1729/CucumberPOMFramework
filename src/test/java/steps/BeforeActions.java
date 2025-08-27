package steps;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class BeforeActions{

    @BeforeAll
    public static void before_all()
    {
         SeleniumDriver.setupReport();
    }

    @Before
    public static void setup(Scenario scenario)
    {
        SeleniumDriver.setupDriver();
        SeleniumDriver.extentTest=SeleniumDriver.getExtentReports().createTest(scenario.getName());
        SeleniumDriver.setExtentTest(SeleniumDriver.extentTest);
    }
}
