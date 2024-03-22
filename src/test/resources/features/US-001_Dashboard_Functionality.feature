Feature:Dashboard Functionality
  User Story: As a user I should be able to modify Dashboard page

  Background:
    Given user is on the login page of Symund Web App

  Scenario:Login Scenario
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

  Scenario: Customize Scenario
    When user click customize button
    And  select any  of the widgets
    And  click close button
    Then user should see choosed widgets on dashboard

  Scenario:Set Status Scenario
    When user click Set status button
    And select any of the status
    And click close button
    Then user should see choosed status on dashboard


