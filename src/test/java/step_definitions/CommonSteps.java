package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class CommonSteps extends BaseTest{

    public static ValidatableResponse json;
    private RequestSpecification request = given();
    private Response response;


    @When("^I sent a GET request to (.*)$")
    public void i_send_get_country(String countryCode) {
        if (countryCode.equals("all countries")) {
            response = request.when().get(listUrl);
        } else if (countryCode.equals(countryCode)) {
            response = request.when().get(countryLink + countryCode);
        } else {
            System.out.println("Not specified country");
        }
    }

    @Then("^I get a response status 200$")
    public void i_get_response() {
        json = response.then();
        json.statusCode(200);
    }

}
