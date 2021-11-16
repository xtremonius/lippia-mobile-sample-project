package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.TimeEntriesService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class TimeEntriesSteps extends PageSteps {


    @And("The user presses time entries button")
    public void theUserPressesTimeEntriesButton(){
        TimeEntriesService.pressTimeEntriesButton();

    }

    @And("The user changes the hours")
    public void theUserChangesTheHours() {
        TimeEntriesService.changeTheHours();
    }

    @And("The user set a project")
    public void theUserSetAProject() {
        TimeEntriesService.setAproject();
    }

    @And("The user select a project")
    public void theUserSelectAProject() {
        TimeEntriesService.selectProject();
    }

    @And("The user presses save")
    public void theUserPressesSave() {
        TimeEntriesService.pressSave();
    }


    @Then("the user verify that the ticket was created \"(.*)\"$")
    public void theUserVerifyThatTheTicketWasCreated(String project) {
        TimeEntriesService.verifyTicketWasCreated(project);
    }
}
