Feature: Negative Scenario for given API
 
  Scenario: To check response for negative scenario
    Given API for foreign exchange
    When posted with correct Information
    Then validate positive response code received
    And Store the response into response object
