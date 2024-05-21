@saturday
Feature: Is it Saturday ?
  Everybody wants to know when it´s Saturday

  Scenario Outline: Today it´s Saturday?
    Given today is "<day>"
    When I ask whether it´s Saturday yet
    Then I should be told "<answer>"

    @friday02
    Examples:
      | day       | answer |
      | Friday    | Nope   |
    @saturday
    Examples:
      | day       | answer |
      | Saturday  | Nice   |
    @sunday02
    Examples:
      | day       | answer |
      | Sunday    | Nope   |
    @monday
    Examples:
      | day       | answer |
      | Monday    | Nope   |
