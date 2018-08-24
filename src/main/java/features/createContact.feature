@fcContacts
Feature: Free CRM Create Contact

  Scenario Outline: Create Contacts Test
    Given user is on Login page
    When title of Login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    And user is on home page
    Then the user moves to new contact page
    And user enters "<firstname>" and "<lastname>" and "<position>"
    Then user clicks on Save button
    Then close the browser

    Examples: 
      | username | password | firstname | lastname | position    |
      | brbgouda | fc@123   | brb       | gouda    | QA_Engineer |
