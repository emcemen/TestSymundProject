package com.symund.step_definitions;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;



    /*
In this class we will be able to create "pre" and "post" condition
for ALL the SCENARIOS and even STEPS.
 */
    public class Hooks {

        //import the @Before coming from io.cucumber.java
     //   @Before(order = 1)
    //    public void setupMethod(){

     //       Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      //      Driver.getDriver().get(ConfigurationReader.getProperty("url"));


        /*
        @After will be executed automatically after EVERY scenario in the project.
         */
        @After
        public void teardownMethod(Scenario scenario){

            if (scenario.isFailed()) {

                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());

            }



            BrowserUtils.sleep(2);
            Driver.closeDriver();

        }


    }