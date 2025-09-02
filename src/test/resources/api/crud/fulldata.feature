
@Api
Feature: Create full data


  Scenario Outline: Test create full of data
    Given input "<title>" "<firstname>" "<lastname>" "<email>" "<dateOfBirth>" "<phone>" "<picture>" and location "<street>" "<city>" "<state>" "<country>" "<timezone>"
    Then status code should 200
    And delete user
    Then response is 200


    Examples:
      | title | firstname | lastname  | email                | dateOfBirth| phone      | picture      | street  | city   | state      | country | timezone  |
      |  mr   | Bahlil    | Bahlul    | rajakecil@golkar.com | 1971/6/12  | 0866667777 | www.rajamini | papua   | timika | east papua | konoha  | +05.00    |
