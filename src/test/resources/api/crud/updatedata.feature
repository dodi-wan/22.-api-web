



@api
Feature: edit all data existing

  Description:
  "id": "60d0fe4f5311236168a109ec",
  "title": "mr",
  "firstName": "Lucas",
  "lastName": "Larsen",
  "picture": "https://randomuser.me/api/portraits/med/men/50.jpg"

  Scenario Outline: Test edit and update all data dummy api
    Given update data "<id>" "<firstName>" "<lastName>"
    Then response should be 200


    Examples:
      | id                        | firstName | lastName |
      | 60d0fe4f5311236168a109ec  | Uzumaki   | Naruto   |