Feature: In http://www.webdriveruniversity.com website, enter details in contact form
  A user will enter name, comments and other details and save th data successfully.

Background:
  Given I can access webdriveruniversity
  When I click on the login portal button
  And I enter valid username

Scenario: user enter information and successfully save the data
  And I enter "valid" password
  When I click on the login button
  Then It should be presented successful validation message

Scenario: user enters wrong information and validation fails
  And I enter "invalid" password
  When I click on the login button
  Then It should be presented error validation message
