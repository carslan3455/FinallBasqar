package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends _Parent {

    WebElement myElement;

    public DialogContent() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")   private WebElement username;
    @FindBy(id = "mat-input-1")   private WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")   private WebElement loginButton;
    @FindBy(linkText = "Got it!")   private WebElement gotItButton;
    @FindAll({@FindBy(linkText = "Got it!")})private List<WebElement> gotItBtns;
    @FindBy (xpath = "//span[text()='Dashboard ']")   private WebElement dashboard;
    @FindAll({@FindBy(xpath = "//span[@class='mat-option-text']")})  private List<WebElement> countryList;
    @FindBy (xpath = "//ms-add-button[contains(tooltip,TITLE)]")    private WebElement addButton;
    @FindBy (css = "ms-text-field[formcontrolname='name']>input")    private WebElement name;
    @FindBy (css = "ms-text-field[formcontrolname='code']>input")    private WebElement code;
    @FindBy (css = "ms-save-button.ng-star-inserted")    private WebElement saveButton;
    @FindBy (css = "div#toast-container")    private WebElement message;      //   div[role='allertdialog']
    @FindBy (css = "ms-delete-button.ng-star-inserted")    private WebElement deleteButton;
    @FindAll({ @FindBy (css = "ms-delete-button.ng-star-inserted") })  private List<WebElement> deleteButtonList;
    @FindAll({ @FindBy (css = "ms-edit-button.ng-star-inserted") })  private List<WebElement> editButtonList;
    @FindAll({ @FindBy (css = "tbody>tr>td:nth-child(2)") })  private List<WebElement> nameList;
    @FindBy(css = "button[type='submit']")    private WebElement yesButton;
    @FindBy(css = "mat-select[formcontrolname='id']")    private WebElement country;
    @FindBy(css = "mat-option[role='option']")    private WebElement option;
    @FindAll({ @FindBy(css = "mat-option[role='option']>span") })    private List<WebElement> optionsList;
    @FindBy (css = "#mat-chip-list-input-0")    private WebElement userType;
    @FindBy (css = "input[data-placeholder='Description']")    private WebElement discription;
    @FindBy (css = "input[data-placeholder='Variable']")    private WebElement variable;
    @FindBy (css = "input[data-placeholder='Priority']")    private WebElement priority;
    @FindBy (css = "input[data-placeholder='Amount']")    private WebElement amount;
    @FindBy (css = "input[data-placeholder='Amount']")    private WebElement nameConstans;
    @FindBy (css = "input[data-placeholder='Valid From']")    private WebElement validFrom;
    @FindBy (css = "ms-text-field[formcontrolname='key']>input")    private WebElement key;
    @FindBy (css = "ms-integer-field[formcontrolname='value']>input")    private WebElement valueConstans;


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "loginBtn": myElement = loginButton; break;
            case "gotItBtn":
                if (gotItBtns.size() == 0)
                return;
                myElement = gotItButton;
                break;
            case "addButton": myElement = addButton;break;
            case "saveButton": myElement = saveButton;break;
            case "deleteButton": myElement = deleteButton;break;
            case "yesButton": myElement = yesButton;break;
            case "country": myElement = country;break;
            case "option": myElement = option;break;
            case "userType": myElement = userType; break;
            default:
               myElement=optionsList.get(randomSelect(optionsList)); break;


        }
        clickFunction(myElement);
    }
    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {
            case "username": myElement = username; break;
            case "password": myElement = password; break;
            case "name": myElement = name; break;
            case "code": myElement = code; break;
            case "discription": myElement = discription; break;
            case "variable": myElement = variable; break;
            case "priority": myElement = priority; break;
            case "amount": myElement = amount; break;
            case "nameConstans": myElement = nameConstans; break;
            case "validFrom": myElement = validFrom; break;
            case "key": myElement = key; break;
            case "valueConstans": myElement = valueConstans; break;

        }
        sendKeysFunction(myElement,value);
    }
    public void findElementAndFindVerifyContainsText(String elementName, String text) {
        switch (elementName) {
            case "dashboard": myElement = dashboard;break;
            case "success/error": myElement = message;break;

        }
        verifyElementContainsText(myElement, text);
    }


}


