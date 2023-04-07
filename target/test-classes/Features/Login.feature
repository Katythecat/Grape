Feature: Login Functionality
  Scenario: User enter valid username and password
    Given open the browser and launch HRM application
    When enter valid username and password
    And user clicks on log in button
    Then user successfully logged in to the page
    And close the browser