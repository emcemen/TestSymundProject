package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateTo(String moduleName){

        moduleName = moduleName.substring(0,1).toUpperCase() + moduleName.substring(1).toLowerCase();
        String locator = "//ul[@id='appmenu']//a[@aria-label='"+moduleName+"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();

    }



    @FindBy(xpath = "(//a[contains(.,'Talk')])[1]")
    public List<WebElement> talk;

    @FindBy(xpath = "(//a[contains(.,'Activity')])[1]")
    protected WebElement activity;

    @FindBy(xpath = "(//a[contains(.,'Photos')])[1]")
    public WebElement photos;

    @FindBy(xpath = "(//a[contains(.,'Files')])[1]")
    public WebElement files;

    @FindBy(xpath = "(//a[contains(.,'Dashboard')])[1]")
    public WebElement dashboard;

    @FindBy(xpath = "(//a[contains(.,'Mail')])[1]")
    public WebElement mail;

    @FindBy(xpath = "(//a[contains(.,'Contacts')])[1]")
    public WebElement contacts;

    @FindBy(xpath = "(//a[contains(.,'Tasks')])[1]")
    public WebElement tasks;

    @FindBy(xpath = "(//a[contains(.,'Calendar')])[1]")
    public WebElement calender;

    @FindBy(xpath = "(//a[contains(.,'Notes')])[1]")
    public WebElement notes;

    @FindBy(xpath = "(//a[contains(.,'Contacts')])[1]")
    public WebElement deck;

    @FindBy(id = "expand")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"expand\"]/div[1]/img")
    public WebElement userIcon;


    @FindBy(xpath = "//*[@class=\"edit-panels icon-rename\"]")
    public WebElement customize;

    // this is for building the method for click a module just typing the name of the module
    @FindBy(xpath = "//*[@id=\"appmenu\"]/li/a")
    public List<WebElement> mainModules;


    //this method allow us to click a module with its name
    public void clickModule(String targetModule) {
        for (int i = 0; i < mainModules.size() - 1; i++) {
            if (mainModules.get(i).getAttribute("aria-label").equals(targetModule)) {
                mainModules.get(i).click();
            }
        }
    }

    public static List<String> getModulesAsString(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getAttribute("aria-label"));
        }
        return elemTexts;
    }

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[1]/div/span")
    public WebElement userName;





}

