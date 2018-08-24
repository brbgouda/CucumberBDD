@fcDeals
Feature: Free CRM Create Deals

  Scenario: Create new deal test
    Given user is on Login page
    When user enters credentials
      | brbgouda | fc@123 |
    And user clicks on login button
    Then user is on home page
    When the user moves to new deal page
    And user enters deal details
      | BGTest Deal | 1000 | 50 | 10 |
    Then user clicks on Save button
