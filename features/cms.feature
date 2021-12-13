@Priority1
Feature: CMS

  Scenario: Verifying Cms Account
    Given user is on the cms homepage
    When user enter username
    And user enter password
    And user click on login button
    Then displays invalid credentials
