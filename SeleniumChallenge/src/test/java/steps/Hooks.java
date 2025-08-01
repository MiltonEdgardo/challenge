package steps;

import browserManager.DriverManager;
import browserManager.DriverManagerFactory;
import browserManager.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.ScreenshotUtil;

import static browserManager.DriverType.CHROME;

public class Hooks {

    protected DriverType driverType = CHROME;
    protected static WebDriver driver;
    private DriverManager driverManager;

    @Before
    public void setUp() {
        driverManager = DriverManagerFactory.getManager(driverType);
        driver = driverManager.getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ScreenshotUtil.takeScreenshot(driver);
            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }

        driverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
