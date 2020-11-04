Feature: Optimize tab
  In order to get in in the system
  As a valid user system
  I want to login successfully and go to optimize tab

  Scenario: Optimize path
    Given I am in the login page of the RO System
    * I enter valid credentials
    * I should be taken to the Home page
    When I click over optimize button
    Then I should be taken to the Optimize page