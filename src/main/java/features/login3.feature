@fclogin3
Feature: Free CRM Login

  Scenario Outline: Login Test
    Given user is on Login page
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then user is on home page

    Examples: 
      | username | password |
      | brbgouda | fc@123   |
      | brbgouda | fc@123   |
