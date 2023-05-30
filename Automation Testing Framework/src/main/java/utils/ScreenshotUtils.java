package utils;
import base.BaseSetup;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.ByteArrayInputStream;
import java.io.IOException;


public class ScreenshotUtils {
    static WebDriver driver= BaseSetup.getDriver();

    public static void takeScreenshot(WebDriver driver1){

        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        ByteArrayInputStream screenshotStream = new ByteArrayInputStream(screenshot);
        Allure.addAttachment("Screenshot", screenshotStream);
    }

}