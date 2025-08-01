package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenshotUtil {

    public static byte[] takeScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public static void takeScreenshot(WebDriver driver, String scenario) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path destinationPath = Path.of("build/screenshots", scenario + ".png");
            Files.createDirectories(destinationPath.getParent());
            Files.copy(screenshot.toPath(), destinationPath);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
