package net.poc.steps;

import cucumber.api.CucumberOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_notes.feature:23"
)

public class Runner {
    static AppiumDriverLocalService appiumService = null;

    @Before
    public static void startAppiumServer(){
        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
    }

    @After
    public static void stopAppiumServer() {

        appiumService.stop();
    }

}