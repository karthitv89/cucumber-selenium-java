@datatable
Feature: In http://www.webdriveruniversity.com website, enter details in contact form
  A user will enter name, comments and other details and save th data successfully.

Background:
  Given I can access webdriveruniversity
  When I click on the Contact us button

Scenario: user enter information and successfully save the data
  And I enter first name
  And I enter last name
  And I enter email address
  And I enter comments
    | example comment one | example comment two |
    | example comment four | example comment four |
  When I click on the submit button
  Then The information should be submitted successfully submitted by the contact us form

Scenario: user enters wrong information and validation fails
  And I enter wrong first name
  And I enter wrong last name
  And I enter wrong email address
  And I enter wrong comments
    | example comment one | example comment two |
    | example comment four | example comment four |
  When I click on the submit button
  Then The information should not be submitted and validation errors should be shown
