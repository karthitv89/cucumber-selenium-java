Feature: Login into Account
    Existing user should be able to login into account using correct credentials.

Scenario: Login into account correct credentials
    Given User navigates to stackoverflow.com website
    And User clicks on Login button
    And User enters a valid username
    And User enters a valid password
    When User clicks Login button
    Then User enters stackoverflow.com website successfully.
