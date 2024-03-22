package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class TaskModulePage {
    public TaskModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@title='Add List…']")
        public WebElement addListButton;
    @FindBy(xpath = "//*[@id='newListInput']")
    public WebElement addListTextBox;

    @FindBy(xpath = "(//*[@class='colorpicker-list'])[5]/li")
    public List<WebElement>addListTextBoxColors;

    public void clickRandomColor() {
        Random random = new Random();
        int randomColorElement = random.nextInt(8)+1;
        for (int i = 0; i < addListTextBoxColors.size() - 1; i++) {
               if(i==randomColorElement){
                addListTextBoxColors.get(i).click();
            }
        }
    }
    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/form/input[3]")
    public WebElement okButton;





}
