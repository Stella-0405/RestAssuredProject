Feature: Check API for future date

  Scenario: To check response for future date
    Given API for foreign exchange
    When posted with future date Information
    Then validate positive response code received
    And store the response into response object

