Feature: Work shift functionality
  As a Dispatcher I want to select the Work Shift so the Driver and Load lists can be updated.

  Scenario: Select work shift
    Given The dispatcher is in Dispatch Optimize tab view
    When Select specific work shift list
    Then The load list and driver list will be updated attending the work shift selected