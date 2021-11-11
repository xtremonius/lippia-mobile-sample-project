package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.HomeService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getAttribute;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {

    @Then("Home page is displayed")
    public void isHomePageVisible() {
        HomeService.isViewLoaded();
    }

    @When("The user changes the language")
    public void doChangeLanguage() {
        MobileActionManager.click(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR);
    }

    @When("The user log out of the app")
    public void doSignOut() {
        MobileActionManager.click(HomeConstants.SIGN_OUT_BUTTON_LOCATOR);
    }

    @Then("The user log in satisfactory")
    public void theUserLogInSatisfactory() {
        HomeService.isViewLoaded();
    }

    @And("The user presses tap-nav")
    public void theUserPressesTapNav() {
        MobileActionManager.waitVisibility(HomeConstants.TAP_NAV);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.TAP_NAV));
        MobileActionManager.click(HomeConstants.TAP_NAV);
    }

    @And("The user presses settings")
    public void theUserPressesSettings() {
        MobileActionManager.waitVisibility(HomeConstants.SETTING_BAR);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.SETTING_BAR));
        MobileActionManager.click(HomeConstants.SETTING_BAR);
    }

    @io.cucumber.java.en.Then("Dark mode is enabled")
    public void darkModeIsEnabled() {
        String checked = getAttribute(HomeConstants.SETTING_DARK_MODE, "checked");
        Assert.assertEquals(checked, "true", "No se cambio el valor");
    }

    @And("The user presses dark mode")
    public void theUserPressesDarkMode() {
        MobileActionManager.waitVisibility(HomeConstants.SETTING_DARK_MODE);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.SETTING_DARK_MODE));
        MobileActionManager.click(HomeConstants.SETTING_DARK_MODE);
    }
}
