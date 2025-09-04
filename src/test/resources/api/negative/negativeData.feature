
@api
Feature: negative create data variable gender

  Scenario Outline: Test create data with negative variable gender
    Given create input data "<title>" "<firstname>" "<lastname>" "<email>" "<gender>"
    Then status code 400


    Examples:
      | title   | firstname     | lastname         |           email          | gender |
      |  madam  | ivan gunakan  | putra kecil ayah | madamigun@putrakecil.com | hybird |