Feature: Countries list

  Scenario: Get all countries and validate that US, DE and GB were returned in the response

     When I sent a GET request to all countries
     Then I get a response status 200
      And I see results
      And I see DE in a list
      And I see GB in a list
      And I see US in a list