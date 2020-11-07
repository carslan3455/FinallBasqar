package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends _Parent{

    WebElement myElement;

    public LeftNav() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Setup") private WebElement setup;
    @FindBy(linkText = "Parameters") private WebElement parameters;
    @FindBy(linkText = "Countries") private WebElement countries;
    @FindBy(linkText = "Cities") private WebElement cities;
    @FindBy(linkText = "Human Resources") private WebElement humanResources;
    @FindBy(css = "(//span[text()='Setup'])[3]") private WebElement setupHR;
    @FindBy(linkText = "Salary Types") private WebElement salaryTypes;
    @FindBy(linkText = "Salary Modifiers") private WebElement salaryModifiers;
    @FindBy(linkText = "Salary Constants") private WebElement salaryConstants;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "setup": myElement = setup;break;
            case "parameters": myElement = parameters;break;
            case "countries": myElement = countries;break;
            case "cities": myElement = cities;break;
            case "humanResources": myElement = humanResources;break;
            case "setupHR": myElement = setupHR;break;
            case "salaryTypes": myElement = salaryTypes;break;
            case "salaryModifiers": myElement = salaryModifiers;break;
            case "salaryConstants": myElement = salaryConstants;break;

        }
        clickFunction(myElement);
    }



}
