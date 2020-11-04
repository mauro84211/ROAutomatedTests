Feature: Assigned Pick Up Date
  As a Dispatcher
  I want to select the Assigned pickup date
  so the Driver and Load filters can be updated.

  Scenario: Default assigned pick up date
    When The dispatcher is in Dispatch Optimize tab view
    Then The Assigned Pick Up date selected by default in general filters must be the current day.

  Scenario: Select an specific assigned pick up date
    Given The dispatcher is in Dispatch Optimize tab view
    When Change the assigned pick up date value
    Then The load list and driver list will be updated attending the assigned pick up date selected

  Rule: Assigned Pick Up Date can't be selected the day before of current day