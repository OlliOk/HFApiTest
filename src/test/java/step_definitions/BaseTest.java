package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseTest {
    protected final String baseUrl = "http://services.groupkt.com";

    protected String listUrl = baseUrl + "/country/get/all";

    protected String countryLink = baseUrl + "/country/get/iso2code/";

}
