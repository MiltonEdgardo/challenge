package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    private WebElement usernamePlaceHolder;
    @FindBy(id = "password")
    private WebElement passwordPlaceHolder;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(css = "[data-test='error']")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        navigateTo("https://www.saucedemo.com/");
    }


    public void login(String username, String password) {
        writeText(usernamePlaceHolder, username);
        writeText(passwordPlaceHolder, password);
        clickElement(loginButton);
    }

    public void enterOnlyUsername(String username) {
        writeText(usernamePlaceHolder, username);
        clickElement(loginButton);
    }

    public void enterOnlyPassword(String password) {
        writeText(passwordPlaceHolder, password);
        clickElement(loginButton);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public String getErrorLoginMessage() {
        return getText(errorMessage);
    }
}
