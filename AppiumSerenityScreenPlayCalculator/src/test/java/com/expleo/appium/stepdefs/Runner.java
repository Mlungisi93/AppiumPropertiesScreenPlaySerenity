package com.expleo.appium.stepdefs;

import cucumber.api.CucumberOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src\\test\\resources\\Adding.feature")
public class Runner {
    static AppiumDriverLocalService appiumService = null;

   /* @Before
    public static void startAppiumServer()
    {
        appiumService = AppiumDriverLocalService.buildDefaultService();
        System.out.println("Appium Service starting.....");
    }

    @After
    public static void stopAppiumServer()
    {
        appiumService.stop();
        System.out.println("Appium Service stoping.....");
    }*/
}
