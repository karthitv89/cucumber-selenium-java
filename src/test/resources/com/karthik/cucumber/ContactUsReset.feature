Feature: A user should reset the form by clicking the reset button

  Scenario: user enters information and resets the form
    Given I can access http://www.webdriveruniversity.com
    When I click on the Contact us button
    And I enter first name
    And I enter last name
    And I enter email address
    And I enter comments
    When I click on the reset button
    Then The information should be removed from the contact us form