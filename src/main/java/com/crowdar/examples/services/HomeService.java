package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getAttribute;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.TOOLBAR_TITLE_TIME_ENTRIES);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.TOOLBAR_TITLE_TIME_ENTRIES), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void pressesTap() {
        MobileActionManager.waitVisibility(HomeConstants.TAP_NAV);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.TAP_NAV));
        MobileActionManager.click(HomeConstants.TAP_NAV);
    }


    public static void pressesSettings() {
        MobileActionManager.waitVisibility(HomeConstants.SETTING_BAR);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.SETTING_BAR));
        MobileActionManager.click(HomeConstants.SETTING_BAR);
    }

    public static void darkModeVerify() {
        String checked = getAttribute(HomeConstants.SETTING_DARK_MODE, "checked");
        Assert.assertEquals(checked, "true", "No se cambio el valor");
    }

    public static void pressesDarkMode() {
        MobileActionManager.waitVisibility(HomeConstants.SETTING_DARK_MODE);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.SETTING_DARK_MODE));
        MobileActionManager.click(HomeConstants.SETTING_DARK_MODE);
    }
}
