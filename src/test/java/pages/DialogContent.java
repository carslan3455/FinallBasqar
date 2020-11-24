package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends _Parent {

    WebElement myElement;
    List<WebElement> myList;

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
//    @FindBy (xpath = "//ms-add-button[contains(tooltip,TITLE)]")    private WebElement addButton;
    @FindBy (xpath = "//ms-add-button[contains(@tooltip,'.ADD')]//button")    private WebElement addButton;
    @FindBy (css = "ms-text-field[formcontrolname='name']>input")    private WebElement name;
    @FindBy (css = "ms-text-field[formcontrolname='code']>input")    private WebElement code;
    @FindBy(xpath = "//ms-save-button//button")   private WebElement saveButton;
    @FindBy (css = "div#toast-container")    private WebElement message;      //   div[role='allertdialog']
    @FindAll({ @FindBy(css = "div#toast-container") })    private List<WebElement> messageList;
    @FindBy (css = "ms-delete-button.ng-star-inserted")    private WebElement deleteButton;
    @FindAll({ @FindBy (css = "ms-delete-button.ng-star-inserted") })  private List<WebElement> deleteButtonList;
    @FindAll({ @FindBy (css = "ms-edit-button.ng-star-inserted") })  private List<WebElement> editButtonList;
    @FindAll({ @FindBy (css = "tbody>tr>td:nth-child(2)") })  private List<WebElement> nameList;
    @FindBy(css = "button[type='submit']")    private WebElement yesButton;
    @FindBy(css = "mat-select[formcontrolname='id']")    private WebElement country;
    // @FindBy(css = "mat-option[role='option']")    private WebElement option;
    @FindAll({ @FindBy(css = "mat-option[role='option']>span") })    private List<WebElement> optionsList;
    @FindBy (css = "#mat-chip-list-input-0")    private WebElement userType;
    @FindBy (css = "input[data-placeholder='Description']")    private WebElement description;
    @FindBy (css = "input[data-placeholder='Variable']")    private WebElement variable;
    @FindBy (css = "input[data-placeholder='Priority']")    private WebElement priority;
    @FindBy (css = "input[data-placeholder='Amount']")    private WebElement amount;
    @FindBy (css = "input[formcontrolname='name']")    private WebElement nameConstants;
    @FindBy (css = "input[data-placeholder='Valid From']")    private WebElement validFrom;
    @FindBy (css = "ms-text-field[formcontrolname='key']>input")    private WebElement key;
    @FindBy (css = "*[formcontrolname='value']>input")   private WebElement valueConstants;
    @FindBy (css = "ms-text-field[formcontrolname='title']>input")    private WebElement namePositionSalary;
    @FindAll({ @FindBy (css = "input[name*='Formula']") })  private List<WebElement> formulaList;
    @FindBy (xpath = "//span[text()='Category']") private WebElement category;
    // todo new constanse value budget diger sekmesinde olan
    // todo @FindBy (css = "ms-text-field[formcontrolname='value']>input")    private WebElement valueConstansBdgt;

    //Todo Not: buradan sonra category option ile secilecek, secimde general cıkarsa yeni bir drop down oluşuyor.
    // Yeni dropdown için aşağıdaki locator geliyor.
    @FindBy (xpath = "//span[text()='Subject Category']") private WebElement subjectCategory;
    @FindBy (css = "mat-select[formcontrolname='type']") private WebElement type;
    @FindBy (xpath = "//span[text()='Balance Type']") private WebElement balanceType;
    @FindBy (xpath = "//span[text()='Integration Codes']") private WebElement integrationCodes;
    @FindBy (css = "mat-select[formcontrolname='currency']") private WebElement currency;
    @FindBy (xpath = "(//button[@matbadgecolor='accent'])[2]") private WebElement addContraAcc;
    // todo olmayabilir @FindBy (xpath = "(//mat-select[@formcontrolname='category'])[1]") private WebElement categoryAcc;

    @FindBy (css = "input[formcontrolname='order']") private WebElement order;
    @FindBy (css = "input[placeholder='Expense accout code prefixes']")    private WebElement expenseAccPrefixes;
    @FindBy (xpath = "//span[text()='Add']") private WebElement addButtonCost;
    @FindBy (css = "mat-select[formcontrolname='value']") private WebElement styleSubjects;
    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input")    private WebElement shortName;
    @FindBy (css = "button[aria-label='Close dialog']")    private WebElement closeDialog;
    @FindBy (css = "td[aria-label='November 11, 2020']")    private WebElement selectDate;
    @FindBy (css = "div.cdk-overlay-container")    private WebElement closeDate;
    @FindBy (xpath = "(//div[@class='mat-tab-label-content'])[2]")    private WebElement constants;
    @FindBy (xpath = "//*[text()='Formula']")    private WebElement formula;
    @FindBy (xpath = "//ms-add-button[contains(@tooltip,'.BUTTON')]//button")    private WebElement addFormula;
    @FindBy (css = "mat-select[formcontrolname='budgetType']")    private WebElement budgetType;
    @FindBy(xpath = "(//ms-save-button//button)[2]")   private WebElement saveFormula;
    @FindBy(css = "svg[data-icon='window-maximize']") private WebElement maximizes;
    //    @FindBy(xpath = "//*[text()='Contra Account']") private WebElement contraAcc;
    @FindBy (xpath = "(//mat-expansion-panel-header[@role='button']/span)[3]")    private WebElement contraAcc;
    @FindBy(css = "input[formcontrolname='account']") private WebElement codeAcc;
    @FindBy (xpath = "(//mat-select[@formcontrolname='balanceType'])[2]") private WebElement balanceType2;
    @FindBy (xpath = "(//button[@matbadgecolor='accent'])[4]") private WebElement addButtonContAcc;
    @FindBy (xpath = "(//mat-select[role='combobox'])[4]") private WebElement codeBudget;
    @FindBy (xpath = "//span[text()=' Search ']") private WebElement search;
    @FindBy(css = "input.mat-input-element.mat-form-field-autofill-control")  WebElement searchName;
    @FindBy (css = "ms-text-field[formcontrolname='orderNo']>input") private WebElement orderNo;
    @FindBy (xpath = "//mat-icon[text()='cancel']")    private WebElement cancelExpenseAccPrefixes;

    // Todo bunlara bakilacak
//    formula
//    addFormula
//    budgetType
//    current
//    contraAcc
//

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "loginButton": myElement = loginButton; break;
            case "gotItButton":
                if (gotItBtns.size() == 0)
                return;
                myElement = gotItButton;
                break;
            case "addButton": myElement = addButton;break;
            case "saveButton": myElement = saveButton;break;
            case "deleteButton": myElement = deleteButton;break;
            case "yesButton": myElement = yesButton;break;
            case "country": myElement = country;break;
           //  case "option": myElement = option;break;
            case "userType": myElement = userType; break;
            case "category": myElement = category; break;
            case "subjectCategory": myElement = subjectCategory; break;
            case "validFrom": myElement = validFrom; break;
            case "type": myElement = type; break;
            case "balanceType": myElement = balanceType; break;
            case "integrationCodes": myElement = integrationCodes; break;
            case "currency": myElement = currency; break;
            case "expenseAccPrefixes": myElement = expenseAccPrefixes; break;
            case "randomSelect": myElement=randomSelectFromList(optionsList);break;
            case "addButtonCost": myElement = addButtonCost; break;
            case "styleSubjects": myElement = styleSubjects; break;
            case "closeDialog": myElement = closeDialog; break;
            case "selectDate": myElement = selectDate; break;
            case "closeDate": myElement = closeDate; break;
            case "constants": myElement = constants; break;
            case "formula": myElement = formula; break;
            case "addFormula": myElement = addFormula; break;
            case "budgetType": myElement = budgetType; break;
            case "saveFormula": myElement = saveFormula; break;
            case "maximizes": myElement = maximizes;break;
            case "addContraAcc": myElement = addContraAcc;break;
            case "balanceType2": myElement = balanceType2;break;
            case "contraAcc": myElement = contraAcc;break;
            case "addButtonContAcc": myElement = addButtonContAcc;break;
            case "search": myElement = search;break;

            // Option Listlerde text gonderdigimiz value secmek icin yazdik
            default:
                for (int i = optionsList.size()-1; i >=0  ; i--) {
                    if(optionsList.get(i).getText().equalsIgnoreCase(elementName)) {
                        System.out.println("selected option:" + optionsList.get(i).getText());
                        myElement = optionsList.get(i);break;
                    }
                }

        }
        clickFunction(myElement);
    }
    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {
            case "username": myElement = username; break;
            case "password": myElement = password; break;
            case "name": myElement = name; break;
            case "code": myElement = code; break;
            case "description": myElement = description; break;
            case "variable": myElement = variable; break;
            case "priority": myElement = priority; break;
            case "amount": myElement = amount; break;
            case "nameConstants": myElement = nameConstants; break;
            case "key": myElement = key; break;
            case "valueConstants": myElement = valueConstants; break;
            case "order": myElement = order; break;
            case "shortName": myElement = shortName; break;
            case "validFrom": myElement = validFrom; break;
            case "namePositionSalary": myElement = namePositionSalary; break;
            case "codeAcc": myElement = codeAcc; break;
            case "codeBudget": myElement = codeBudget; break;
            case "searchName": myElement = searchName; break;
            case "orderNo": myElement = orderNo; break;

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

    public void deleteFunction(String value){

        if (messageList.size() > 0) {
//            if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                clickFunction(deleteButtonList.get(i));
                break;
            }
        }
    }

    public void editFunction(String value){

        if (messageList.size() > 0) {
//            if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                clickFunction(editButtonList.get(i));
                break;
            }
        }
    }

    public void findElementListAndSendKeysFunction(String list,String value){

        switch (list) {
            case "formulaList": myList = formulaList;  break;

        }

        for (int i = 0; i <myList.size() ; i++) {
            sendKeysFunction(myList.get(i), value);
        }

    }
}


