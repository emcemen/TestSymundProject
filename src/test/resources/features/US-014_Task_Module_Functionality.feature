@test14
Feature:Task Module Functionality
  User Story: As a user I should be able to create a new task list or a single task
  and add any task to completed and importants task list.

  Background:
    Given user on the Dashboard page
    When the user clicks the "Tasks" module

  Scenario: US-014-01_Create a new task list
    When user click Add List...text box
    And  user write the name of the task list to the text box
    And  user pick one of the color
    And user click ok symbol
    Then user should see Created task list name on the task list

  Scenario: US-014-02_Create single task
    When user click add a task to...text box
    And  user write the name of the task to the text box
    Then user should see Created task on the web page

  Scenario: US-014-03_Add any task to the completed tasks
    When user click current module
    And  user choose any task and click check box which is located left side of the task line
    Then user should see checked task in the completed tasks


  Scenario:US-014-04_ Add any task to the important tasks
    When user click current module
    And  user choose any task and click star icon which is located right side of the task line
    Then user should see checked task in the imported tasks


  Scenario:US-014-05_ Number of uncompleted tasks
    When user click current module
    Then  number which is located current module line must be same with  number which is located all module line

    #if you click star button task goingg to important list
     #if you click check box which is near created task it goes to completed list






