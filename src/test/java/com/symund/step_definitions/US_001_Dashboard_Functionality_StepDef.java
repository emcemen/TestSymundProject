package com.symund.step_definitions;

import com.symund.pages.BasePage;
import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import javax.swing.text.Utilities;
import java.util.List;
import java.util.Map;

public class US_001_Dashboard_Functionality_StepDef {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("user is on the login page of Symund Web App")
    public void user_is_on_the_login_page_of_symund_web_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters below credentials:")
    public void user_enters_below_credentials(Map<String, String> credentials) {
        loginPage.login(credentials.get("inputUsername"), credentials.get("inputPassword"));
    }

    @Then("Verify the user see the following modules and username:")
    public void verify_the_user_see_the_following_modules_and_username(List<String> expectedModules) {
        //Verify modules
        List<String> actualModules = basePage.getModulesAsString(basePage.mainModules);
        Assert.assertTrue(actualModules.containsAll(expectedModules));
        //Verify username
        basePage.userIcon.click();
        String actualUserName=basePage.userName.getText();
        String expectedUserName=ConfigurationReader.getProperty("username");
        Assert.assertTrue(actualUserName.equalsIgnoreCase(expectedUserName));
    }
/*
    @When("user click customize button")
    public void user_click_customize_button() {
     //   basePage.customize.click();
    }

    @When("select any  of the widgets")
    public void select_any_of_the_widgets() {

    }

    @When("click close button")
    public void click_close_button() {

    }

    @Then("user should see choosed widgets on dashboard")
    public void user_should_see_choosed_widgets_on_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click Set status button")
    public void user_click_set_status_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("select any of the status")
    public void select_any_of_the_status() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should see choosed status on dashboard")
    public void user_should_see_choosed_status_on_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
*/
}
