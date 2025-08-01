package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitManager {

    WebDriverWait webDriverWait;

    public ExplicitWaitManager(WebDriver driver) {
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void waitUntilBeClickable(WebElement element) {
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilBeVisible(WebElement element) {
        this.webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilBeSelected(WebElement element) {
        this.webDriverWait.until(ExpectedConditions.elementToBeSelected(element));
    }

    public void waitUntilIdDisplayed(WebElement element) {
        this.webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
