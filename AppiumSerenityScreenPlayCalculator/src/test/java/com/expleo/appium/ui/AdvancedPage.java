package com.expleo.appium.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
public class AdvancedPage {

    public static Target sin = Target.the("sin clicked").located(MobileBy.id("net.ludeke.calculator:id/sin"));

    public static Target cos= Target.the("cos clicked").located(MobileBy.id("net.ludeke.calculator:id/cos"));

    public static Target tan= Target.the("tan clicked").located(MobileBy.id("net.ludeke.calculator:id/tan"));

    public static Target ln= Target.the("ln clicked").located(MobileBy.id("net.ludeke.calculator:id/ln"));

    public static Target log = Target.the("log clicked").located(MobileBy.id("net.ludeke.calculator:id/log"));

    public static Target factional = Target.the("! clicked").located(MobileBy.id("net.ludeke.calculator:id/factional"));

    public static Target pi = Target.the("pi clicked").located(MobileBy.id("net.ludeke.calculator:id/pi"));

    public static Target e = Target.the("e clicked").located(MobileBy.id("net.ludeke.calculator:id/e"));

    public static Target power = Target.the("^ clicked").located(MobileBy.id("net.ludeke.calculator:id/power"));

    public static Target leftParenthesis = Target.the("( clicked").located(MobileBy.id("net.ludeke.calculator:id/leftParen"));

    public static Target rightParenthesis = Target.the(") clicked").located(MobileBy.id("net.ludeke.calculator:id/rightParen"));

    public static Target sqrt = Target.the("sqrt clicked").located(MobileBy.id("net.ludeke.calculator:id/sqrt"));








}
