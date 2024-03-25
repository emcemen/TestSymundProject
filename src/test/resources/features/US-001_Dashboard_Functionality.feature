Feature:Dashboard Functionality
  User Story: As a user I should be able to modify Dashboard page

  Background:
    Given user is on the login page of Symund Web App

  Scenario:US-001_01_Login Scenario
    When  user enters below credentials:
      | inputUsername | employee15  |
      | inputPassword | Employee123 |
    Then Verify the user see the following modules and username:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Notes     |
      | Deck      |
      | Tasks     |
      |More apps  |
    #More apps module seen hidden but when i search modules I found 13 option if that is not correct i will change
    # US-001

  Scenario: US-001_02_ Customize Scenario
    When user click customize button
    And  select any  of the widgets
    And  click close button
    Then user should see choosed widgets on dashboard

  Scenario: US-001_03_ Set Status Scenario
    When user click Set status button
    And select any of the status
    And click close button
    Then user should see choosed status on dashboard



