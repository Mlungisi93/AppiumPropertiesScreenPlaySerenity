package com.expleo.appium.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class DigitsPage {
    //Digits or number
    public static final Target dot = Target.the(". Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/dot"));

    public static final Target zeroDigit = Target.the("0 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit0"));

    public static final Target oneDigit = Target.the("1 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit1"));

    public static final Target twoDigit= Target.the("2 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit2"));

    public static final Target threeDigit = Target.the("3 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit3"));

    public static final Target fourDigit = Target.the("4 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit4"));

    public static final Target fiveDigit = Target.the("5 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit5"));

    public static final Target sixDigit = Target.the("6 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit6"));

    public static final Target sevenDigit = Target.the("7 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit7"));

    public static final Target eightDigit = Target.the("8 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit8"));

    public static final Target nineDigit = Target.the("9 Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/digit9"));
}
