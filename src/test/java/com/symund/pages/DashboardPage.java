package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@class=\"action-item action-item--single header-close icon-close undefined undefined has-tooltip\"]")
    public WebElement closeButton;

    @FindBy(xpath = "//ol[contains(@class,'panels')][1]/li")
    public List<WebElement> customizeWidgetsOne;

    @FindBy(xpath = "//ol[contains(@class,'panels')][2]/li")
    public List<WebElement> customizeWidgetsTwo;


    /**
     * checks first  widgets which are located under customize element.There are two panel on html code
     * so, method is picking random panel and after go with randomly selected panel after it picks random widget list
     * of widgets which is under that list of widgets
     *
     * @param //no parameter
     */

    public void pickRandomWidget() {
        Random random = new Random();
        int randomPanelIndex = random.nextInt(2); // Randomly generates 0 or 1

        // Now, you can use the randomly selected index to access the specific panel
        List<WebElement> selectedPanel;
        if (randomPanelIndex == 0) {
            selectedPanel = customizeWidgetsOne;
        } else {
            selectedPanel = customizeWidgetsTwo;
        }

        int randomWidgetElement = random.nextInt(8) + 1;
        for (int i = 0; i < selectedPanel.size() - 1; i++) {
            if (i == randomWidgetElement) {
                selectedPanel.get(i).click();
            }
        }
    }
/*
    // //*[@id="app-dashboard"]/div[1]/div[1]/div/h2  get text of that and second div[i]---> 8 option keep it in List of Webelements
    public void listOfActualWidgetsOne() {
        String first="//*[@id=\"app-dashboard\"]/div[1]/div[";
        String second="]/div/h2 \"";
        for (int i = 1; i <= 8; i++) {
        @FindBy(xpath = first+i+second)
                public List<WebElement>actualWidgets;

        }
    }
*/
}







