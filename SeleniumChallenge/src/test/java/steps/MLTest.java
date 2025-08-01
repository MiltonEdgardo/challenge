package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.ApiResponse;

import static org.junit.jupiter.api.Assertions.*;

public class MLTest {



    private Response response;

    private ApiResponse apiResponse;

    private String uri = "https://www.mercadolibre.com.ar";

    private String path = "/menu/departments";

    @Given("a user, goes to the ML url")
    public void setTheUrlService() {
        RestAssured.baseURI = uri;
    }

    @When("the user receive the response from the page")
    public void GetTheServiceResponse() {
        response = RestAssured
                .given()
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/115.0.0.0 Safari/537.36")
                .accept("application/json")
                .when()
                .get(path);

        apiResponse = response.as(ApiResponse.class);

    }

    @Then("the user should see the departments options in it")
    public void validateDepartmentElements() {

        assertEquals(200, response.getStatusCode(), "The response wasn't success");
        assertNotNull(apiResponse.departments, "The department list is null");
        assertFalse(apiResponse.departments.isEmpty(), "The department list is empty");

        System.out.println("First department found: " + apiResponse.departments.get(0).name);

    }
}
