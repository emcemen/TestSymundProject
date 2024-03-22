package com.symund.step_definitions;

import com.github.javafaker.Faker;
import com.symund.pages.BasePage;
import com.symund.pages.LoginPage;
import com.symund.pages.TaskModulePage;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_014_Task_Module_Functionality_StepDef {

    LoginPage loginPage = new LoginPage();
    BasePage basePage =new BasePage();

    TaskModulePage taskModulePage=new TaskModulePage();
    @Given("user on the Dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
      basePage.clickModule(string);
    }
    @When("user click Add List...text box")
    public void user_click_add_list_text_box() {
       taskModulePage.addListButton.click();
    }

    @When("user write the name of the task list to the text box")
    public void user_write_the_name_of_the_task_list_to_the_text_box() {
        Faker faker = new Faker();
        String randomNameForTaskList = String.valueOf(faker.name());
        taskModulePage.addListTextBox.sendKeys(randomNameForTaskList);

    @When("user pick one of the color")
    public void user_pick_one_of_the_color() {
        taskModulePage.clickRandomColor();
    }
    @When("user click ok symbol")
    public void user_click_ok_symbol() {
      taskModulePage.okButton.click();
    }
    @Then("user should see Created task list name on the task list")
    public void user_should_see_created_task_list_name_on_the_task_list() {

    }


    }
    @When("user click add a task to...text box")
    public void user_click_add_a_task_to_text_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user write the name of the task to the text box")
    public void user_write_the_name_of_the_task_to_the_text_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see Created task on the web page")
    public void user_should_see_created_task_on_the_web_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






    }
    @When("user click current module")
    public void user_click_current_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user choose any task and click check box which is located left side of the task line")
    public void user_choose_any_task_and_click_check_box_which_is_located_left_side_of_the_task_line() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see checked task in the completed tasks")
    public void user_should_see_checked_task_in_the_completed_tasks() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





    @When("user click current module")
    public void user_click_current_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user choose any task and click star icon which is located right side of the task line")
    public void user_choose_any_task_and_click_star_icon_which_is_located_right_side_of_the_task_line() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see checked task in the imported tasks")
    public void user_should_see_checked_task_in_the_imported_tasks() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click current module")
    public void user_click_current_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("number which is located current module line must be same with  number which is located all module line")
    public void number_which_is_located_current_module_line_must_be_same_with_number_which_is_located_all_module_line() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
*/
}
