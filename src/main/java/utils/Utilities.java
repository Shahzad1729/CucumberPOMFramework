package utils;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Utilities {

    public static String screenshotName;

    public static void captureScreenshot(String details) throws IOException {
        Date d=new Date();
        screenshotName=d.toString().replace(":","_").replace(" ","_")+".jpg";
        File scrFile=((TakesScreenshot)SeleniumDriver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,new File(System.getProperty("user.dir")+"\\target\\ExtentReports\\"+screenshotName));

        SeleniumDriver.getExtentTest().log(Status.INFO,details, MediaEntityBuilder.createScreenCaptureFromPath(screenshotName).build());
    }
}
