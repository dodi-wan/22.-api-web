
@web
Feature: Login Automation

  Description;
  Login with credential list on saucedemo; Expected: username standard_user, problem_user, performance_glitch_user,
  error_user, visual_user can login and locked_out_user cannot login

  @web
  Scenario Outline: login username credential passed login
    Given user is on homepage saucedemo
    When user input username "<username>" and password "<password>"
    And  user click button login
    Then verify user already login page saucedemo

    Examples:
    |     username                  |   password          |
    |     standard_user             |   secret_sauce      |
    |     problem_user              |   secret_sauce      |
    |     performance_glitch_user   |   secret_sauce      |
    |     error_user                |   secret_sauce      |
    |     visual_user               |   secret_sauce      |


  Scenario Outline: login username credential has been locked
    Given user is on homepage saucedemo
    When user input username "<username>" and password "<password>"
    And user click button login
    Then message login "<Expected message>"

    Examples:
      | username        |   password   | Expected message                                     |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.  |