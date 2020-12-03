package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;

import java.util.List;

public class _02_ProjectSteps {

    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();


    @When("^User click on the element in the leftNav class$")
    public void userClickOnTheElementInTheLeftNavClass(DataTable elements) {
        List<String> elementList=elements.asList(String.class);

        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i));
            leftNav.findElementAndClickFunction(elementList.get(i));
        }

    }


    @Then("^User should see \"([^\"]*)\" message$")
    public void userShouldSeeMessage(String message){

        dialogContent.findElementAndFindVerifyContainsText("success/error", message);
    }

    @When("^User delete \"([^\"]*)\"$")
    public void userDelete(String value) {

        dialogContent.deleteFunction(value);
        dialogContent.findElementAndClickFunction("yesButton");

    }

    @Then("^User edit \"([^\"]*)\"$")
    public void userEdit(String value) {

        dialogContent.editFunction(value);
    }

    @And("^User sending the keys List in the dialog content class$")
    public void userSendingTheKeysListInTheDialogContentClass(DataTable elements) {
        List<String> list=elements.asList(String.class);

        for (int i = 0; i <list.size()/2 ; i++) {
            dialogContent.findElementListAndSendKeysFunction(list.get(0),list.get(1));
        }
    }
}


