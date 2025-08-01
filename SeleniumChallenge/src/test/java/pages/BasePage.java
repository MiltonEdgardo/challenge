package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ExplicitWaitManager;

public class BasePage {

    protected WebDriver driver;
    protected ExplicitWaitManager explicitWaitManager;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.explicitWaitManager = new ExplicitWaitManager(driver);
    }

    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void clickElement(WebElement element) {
        explicitWaitManager.waitUntilBeClickable(element);
        element.click();
    }

    public boolean isDislpayed(WebElement element) {
        explicitWaitManager.waitUntilIdDisplayed(element);
        return element.isDisplayed();
    }

    public String getText(WebElement element) {
        explicitWaitManager.waitUntilBeVisible(element);
        return element.getText();
    }

    public String getUrlLink(WebElement element, String attribute) {
        explicitWaitManager.waitUntilBeVisible(element);
        return element.getAttribute(attribute);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void writeText(WebElement element, String textToWrite) {
        explicitWaitManager.waitUntilBeClickable(element);
        element.clear();
        element.sendKeys(textToWrite);
    }

    public void pressEnterKey(WebElement element) {
        explicitWaitManager.waitUntilBeClickable(element);
        element.sendKeys(Keys.ENTER);
    }

    public void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }
}
