package step_definitions;

import cucumber.api.java.en.And;

import static org.hamcrest.Matchers.equalTo;

public class CountryValidation {
    @And("^I see country (.*)$")
    public void i_see_country(String countryCode) {
        CommonSteps.json.body("RestResponse.result.alpha2_code", equalTo(countryCode));
    }
}
