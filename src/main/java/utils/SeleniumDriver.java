package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;
    private static WebDriver driver;

    public static final int timeout = 30;
    public static final int pageLoadTimeout = 50;

    public static WebDriverWait webDriverWait;

    public static ExtentTest extentTest;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extentReports;


    public static ExtentTest getExtentTest()
    {
        return extentTest;
    }

    public static void setExtentTest(ExtentTest test)
    {
        extentTest=test;
    }

    public static ExtentReports getExtentReports()
    {
        return extentReports;
    }

    private SeleniumDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }


    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setupDriver() {
        if (seleniumDriver == null) {
            seleniumDriver = new SeleniumDriver();
        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        seleniumDriver = null;
    }

    public static void scrollByPixel(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }


    public static void setupReport()
    {
        htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\target\\ExtentReports\\ExtentHtml.html");
        extentReports=new ExtentReports();
        extentReports.attachReporter(htmlReporter);

        extentReports.setSystemInfo("Selenium Version","v4");
    }

}
