package step_definitions;

import cucumber.api.java.en.And;

import static org.hamcrest.Matchers.*;

public class InvalidCountry extends BaseTest{

    @And("I see error message$")
    public void i_see_error_message() {
        CommonSteps.json.body("RestResponse.messages", hasItem("No matching country found for requested code [Germany]."));
    }

}
