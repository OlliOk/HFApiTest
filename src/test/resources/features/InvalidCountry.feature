Feature: Invalid country

  Scenario: Get invalid country and validate the response

    When I sent a GET request to Germany
    Then I get a response status 200
     And I see error message
