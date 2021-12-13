@Priority2
Feature: CMS

  Scenario Outline: Verifying Cms Account
    Given user is on the cms homepage
    When user enter <username>
    And user enter <password> pass field
    And user click on login button
    Then displays invalid credentials info

    Examples: 
      | username | password  |
      | 'fatimakhalida12345' | '1234566' |
