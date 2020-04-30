Feature: testing web service
  @test1
  Scenario: As a user I test API
    Given As a user I check base url
    When As a user I test status code
    And As a user I test header
    And As a user I test body
    Then As a user I add new pet
git init