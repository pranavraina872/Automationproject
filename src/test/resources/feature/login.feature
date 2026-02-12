@testing
Feature: login page functionality
  Scenario: validate user should be able to login with valid credentials
    Given open the browser
    And enter the url
    And enter the credentials
    When user is clicking on login button
    Then user should be able to navigate homepage


  Scenario: validate user should be able to login with valid credentials
    Given open the browser
    And enter the url
    And enter the credentials "<Pranav>" and "<1234>"
    When user is clicking on login button
    Then user should be able to navigate homepage

  Scenario Outline: validate user should be able to login with valid credentials
    Given open the browser
    And enter the url
    And enter the credentials "<username>" and "<password>"
    When user is clicking on login button
    Then user should be able to navigate homepage
    Examples:
    |username | password |
    |Pranav   | 1234     |
