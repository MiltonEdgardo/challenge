package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;


public class LoginTest {

    private WebDriver driver = Hooks.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage;
    private String PRODUCT_TITLE = "Products";

    @Given("a user, goes to the login page")
    public void goToLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @When("the user enters {string} and {string}")
    public void userEnterUserAndPass(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the user should see the home page with the products")
    public void userRedirectToProductsPage() {
        homePage = new HomePage(driver);
        Assertions.assertEquals(PRODUCT_TITLE, homePage.getProductText());
    }

    @Then("the user should see an alert message that said {string}")
    public void userReceiveALoginErrorMessage(String errorMessage) {
        Assertions .assertEquals(errorMessage, loginPage.getErrorLoginMessage());
    }
}
