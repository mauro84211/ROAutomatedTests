Feature: Login Functionality
  In order to get in in the system
  As a valid user system
  I want to login successfully

  Scenario: Login Successful
    Given I am in the login page of the RO System
    When I enter valid credentials
    Then I should be taken to the Home page