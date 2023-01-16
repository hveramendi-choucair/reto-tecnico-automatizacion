#Autor Henry
Feature: Create an employee
  I want to create an employee

  Scenario: Creation an employee
    When you create an employee
     | name | salary | age |
     | Jose | 322    | 30  |
    Then I see the employee create