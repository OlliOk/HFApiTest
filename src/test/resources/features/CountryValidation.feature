Feature: Country validation

  Scenario: Get each country individually (US, DE and GB) and validate

    When I sent a GET request to DE
    Then I get a response status 200
     And I see country DE

    When I sent a GET request to GB
    Then I get a response status 200
     And I see country GB

    When I sent a GET request to US
    Then I get a response status 200
     And I see country US
