package step_definitions;

import cucumber.api.java.en.And;

import static org.hamcrest.Matchers.*;

public class CountriesList extends BaseTest {

    @And("I see results$")
    public void i_see_results() {
        CommonSteps.json.body("RestResponse.messages", hasItem("Total [249] records found."));
    }

    @And("^I see (.*) in a list$")
    public void i_see_country_in_list(String countryCode) {
        CommonSteps.json.body("RestResponse.result.alpha2_code", hasItem(countryCode));
    }

}
