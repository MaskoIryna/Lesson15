package Helper;

import com.codeborne.selenide.WebDriverConditions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


import java.io.File;
import java.io.IOException;

public class ScreenShooter implements ITestListener {
    private WebDriver driver;


    @Override
    public void onTestFailure(ITestResult result) {

         File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String fileName = result.getName() + "screenshot.png";
        File destFile = new File("D:\\" + fileName);
        try {
            FileUtils.copyFile(screenshot,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
