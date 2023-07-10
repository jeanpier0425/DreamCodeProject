package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static utils.Constants.URL;

public class ApiStepDefinition {

    private Response response;

    @Given("the endpoint is set")
    public void setApiEndpoint() {
        RestAssured.baseURI = URL;
    }

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String resource) {
        response = RestAssured.get(resource);
        }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(actualStatusCode, expectedStatusCode);
    }

    @Then("the response body should contain {string}")
    public void verifyResponseBody(String expectedBody) {
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        Assert.assertTrue(responseBody.contains(expectedBody));
    }
}