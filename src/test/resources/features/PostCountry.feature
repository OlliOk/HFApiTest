Feature: POST new country

  Scenario: POST new country and validate the response

    When I sent POST new country
    Then I get a response status 201

    When I sent a GET request to all countries
    Then I get a response status 200
    And I see Test Country in a list