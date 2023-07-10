Feature: API Testing Example

  Background: payload
    Given I have a payload

  @Get
  Scenario: Get a resource
    Given the endpoint is set
    When I send a GET request to "/comments/1"
    Then the response status code should be 200
    And the response body should contain "name"

    @Post
  Scenario: Post request
    Given the endpoint is set
    And I send a POST request to "/posts"
    Then the response status code should be 201
    And the response body should contain "body"

