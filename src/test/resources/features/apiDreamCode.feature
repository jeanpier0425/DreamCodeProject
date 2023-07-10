Feature: API Testing Coding Challenge

  @Success
  Scenario: Get a resource successfully
    Given the endpoint is set
    When I send a GET request to "/us/94105"
    Then the response status code should be 200
    And the response body should contain "San Francisco"

    @Fail
  Scenario: Get a resource fail
    Given the endpoint is set
    When I send a GET request to "/fail/94111"
    Then the response status code should be 404