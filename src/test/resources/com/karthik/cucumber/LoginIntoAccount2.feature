Feature: Login into Account
    Existing user should be able to login into account using correct credentials.

Scenario: Login into account correct credentials2
    Given User navigates to stackoverflow.com website2
    And User clicks on Login button2
    And User enters a valid username2
    And User enters a valid password2
    When User clicks Login button2
    Then User enters stackoverflow.com website successfully2
