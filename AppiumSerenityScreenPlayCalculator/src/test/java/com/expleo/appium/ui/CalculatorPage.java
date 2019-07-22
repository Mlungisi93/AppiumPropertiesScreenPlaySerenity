package com.expleo.appium.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
public class CalculatorPage {

    //Input text box

    public static final Target INPUTBOXTEXT = Target.the(" calculator Input box").
            located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ViewSwitcher/android.widget.EditText"));

    //Output text box
    public static  Target OUTPUT_TEXTBOX = Target.the("Output is displayed").
            located(MobileBy.xpath("//android.widget.EditText"));


    //Menu
    public static final Target menuIcon= Target.the("Menu Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/overflow_menu"));







}
