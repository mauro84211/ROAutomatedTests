Feature: Select terminal
  As a Dispatcher I want to select the Terminal(s) so the Driver and Load filters can be updated.

  Scenario: Select terminal
    Given The dispatcher is in Dispatch Optimize tab view
    When Select specific terminal list
    Then The load list and driver list will be updated attending the terminal list selected