package com.expleo.appium.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {


    //Options

    public static final Target menuAdvancedOption= Target.the("Advanced Clicked").
            located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]"));

    public static final Target menuClearOption= Target.the("Clear Clicked").
            located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]"));

//Only on the Advanced Page
    public static Target basicPanel = Target.the("Basic panel clicked").
            located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]"));




}
