

@Demo
Feature: Testing the cucumber



  @Demo
  Scenario Outline: Testing cucumber
    Given I want to  <name> application
    When I check for the <value> in application screen
    Then I verify the <status> in application

    Examples: 
      | name  | value | status  |
      | jhon |     5 | success |
      | berlin |     7 | Fail    |
