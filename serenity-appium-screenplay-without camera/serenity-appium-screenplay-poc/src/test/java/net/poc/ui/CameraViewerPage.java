package net.poc.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CameraViewerPage {

   public static final Target SHUTTER = Target.the("click to capture").located(
            MobileBy.AccessibilityId("Shutter"));

    /*public static final Target SHUTTER = Target.the("click to capture").located(
            MobileBy.id("com.android.camera2:id/shutter_button"));*/



   /* public static final Target CONFIRM = Target.the("Ok button").located(
            MobileBy.AccessibilityId("OK")); */
    public static final Target CONFIRM = Target.the("Done Button").located(
            MobileBy.AccessibilityId("Done"));

}
