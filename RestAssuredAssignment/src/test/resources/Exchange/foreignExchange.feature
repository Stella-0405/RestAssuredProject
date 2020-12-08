
Feature: Check the API for foreign exchange.
 
 
  Scenario: To validate response for a given API
    Given API for foreign exchange
    When posted with correct Information
    Then validate positive response code received

  