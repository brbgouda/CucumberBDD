@fcDealsMap
Feature: Free CRM Create Deals

  Scenario: Create new deal test
    Given user is on Login page
    When user enters login credentials
      | username | password |
      | brbgouda | fc@123   |
    And user clicks on login button
    Then user is on home page
    And the user moves to new deal page
    And user creates deals
      | title        | amount | probability | comission |
      | BGTest1 Deal |   1000 |          50 |        10 |
      | BGTest2 Dea2 |   2000 |          50 |        10 |
      | BGTest3 Dea3 |   3000 |          50 |        10 |
