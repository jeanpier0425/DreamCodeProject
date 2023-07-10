Feature: API Testing Example

  Scenario: Get a resource
    Given the endpoint is set
    When I send a GET request to "/comments/1"
    Then the response status code should be 200
    And the response body should contain "name"
