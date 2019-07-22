package com.expleo.appium.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class OperatorsPage {

    //Operator
    public static final Target plusOperator= Target.the("+ Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/plus"));

    public static final Target minusOperator= Target.the("- Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/minus"));

    public static final Target multiplyOperator= Target.the("X Clicked").
            located(MobileBy.id("net.ludeke.calculator:id/mul"));

    public static final Target deviceOperator= Target.the("devide button").
            located(MobileBy.id("net.ludeke.calculator:id/div"));

    public static final Target deleteOperator= Target.the("delete button").
            located(MobileBy.id("net.ludeke.calculator:id/del"));

    public static final Target EQUAL_OPERATOR= Target.the("= buttton").
            located(MobileBy.id("net.ludeke.calculator:id/equal"));
}
