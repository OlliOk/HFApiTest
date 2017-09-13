package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class PostCountry extends BaseTest {

    public static ValidatableResponse json;
    private Response response;

    @When("^I sent POST new country$")
    public void i_post_country() {
        JsonObject newCountry = new JsonObject();

        newCountry.addProperty("name", "Test Country");
        newCountry.addProperty("alpha2Code", "TC");
        newCountry.addProperty("alpha3Code", "TCY");

        response = given().body(newCountry.toString())
                .when()
                .contentType(ContentType.JSON)
                .post(listUrl);
    }

    @Then("^I get a response status 201$")
    public void i_get_response() {
        json = response.then();
        json.statusCode(201);
    }
}
