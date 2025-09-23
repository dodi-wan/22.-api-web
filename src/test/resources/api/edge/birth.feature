
@Api
Feature: Boundary Value birth date



  @Api
Scenario Outline: Test input below 1900
  When input "<title>" "<firstname>" "<lastname>" "<email>" "<dateOfBirth>"
  Then status response is 400

  Examples:
    | title | firstname | lastname  | email                   | dateOfBirth |
    |  mr   | neymar    | jr        | neymarprince@brasil.com | 1887/6/14  |